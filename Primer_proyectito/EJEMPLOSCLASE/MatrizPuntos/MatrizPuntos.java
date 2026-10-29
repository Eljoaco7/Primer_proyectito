package EJEMPLOSCLASE.MatrizPuntos;

public class MatrizPuntos {
  //Atributo de instancia
  private Punto [][] mat;
  //Constructor
  public MatrizPuntos(int nFil, int nCol){
  //Requiere nFil>0 y nCol>0
    mat = new Punto [nFil][nCol];
  }
  //Comando
  public void establecerPunto (int f, int c, Punto p){
  /*Requiere 0<=f<cantFilas() y o<=c<cantColumnas() */
    mat[f][c] = p; 
  }

  public void reemplazaNulos(){
  /*Reemplaza cada referencia no ligada por un nuevo punto con valores (0,0)*/
    for (int f = 0; f < cantFilas(); f++)
      for (int c = 0; c < cantColumnas() ; c++)
        if (mat[f][c] == null)
           mat[f][c] = new Punto (0,0);
  }

  //Consultas
  public int cantFilas(){
    return mat.length; 
  }
  public int cantColumnas(){
    return mat[0].length;
  }
  public Punto obtenerPunto (int f, int c){
  /*Requiere 0<=f<cantFilas() y 0<=c<cantColumnas()*/
    return mat[f][c]; 
  }

  public double mayorDistancia(){
  /*Computa la mayor distancia entre puntos en posiciones consecutivas en una misma fila*/
    double mayor = 0; 
    double d;
    for (int f = 0; f < cantFilas(); f++)
      for (int c = 0; c < cantColumnas()-1 ; c++)
        if (mat[f][c] != null && mat[f][c+1] != null){
           d = mat[f][c].distancia(mat[f][c+1]);
           System.out.println(d);
           if (d > mayor)
              mayor = d;
        }
    return mayor;
  }
  public boolean hayNSeguidos(int f, int n){
  /*Retorna true si hay n puntos en posiciones consecutiva con x igual a 0 en la fila f. Requiere 0<=f<cantFilas() */
    int cont = 0;
    for (int c = 0; c < cantColumnas() && cont < n ; c++)
      if (mat[f][c] != null && mat[f][c].obtenerX() == 0)
        cont++;
      else
        cont = 0;
    return cont == n;
  }

  public boolean hayAlMenosNInvEnF(Punto p, int n, int f){
    // Requiere p ligado y que f sea una fila válida.  
    int cont = 0;
    for (int c = 0; c < cantColumnas() && cont < n; c++){        
      if (mat[f][c] != null && mat[f][c].esInverso(p))
        cont++;
    }
    return cont >= n;
  }

  public boolean hayExactamenteNInvEnF(Punto p, int n, int f){
    // Requiere p ligado y que f sea una fila válida.  
    int cont = 0;
    for (int c = 0; c < cantColumnas() && cont <= n; c++){        
      if (mat[f][c] != null && mat[f][c].esInverso(p))
        cont++;
    }
    return cont == n;
  }

  public boolean hayALoSumoNInvEnF(Punto p, int n, int f){
    // Requiere p ligado y que f sea una fila válida.  
    int cont = 0;
    for (int c = 0; c < cantColumnas() && cont <= n; c++){        
      if (mat[f][c] != null && mat[f][c].esInverso(p))
        cont++;
    }
    return cont <= n;
  }
  
  public boolean hayAlMenosMconN(Punto p, int n, int m){
    // Requiere p ligado.  
    int contFil = 0;
    int cont = 0;
    for (int f = 0; f < cantFilas() && contFil < m; f++){   
      cont = 0;
      for (int c = 0; c < cantColumnas() && cont < n; c++)        
        if (mat[f][c] != null && mat[f][c].esInverso(p))
          cont++;
      if (cont >= n)
        contFil++;
    }
    return contFil >= m;
  }
  
  public boolean hayExactamenteMconN(Punto p, int n, int m){
    // Requiere p ligado.
    int contFil = 0;
    int cont = 0;
    for (int f = 0; f < cantFilas() && contFil <= m; f++){   
      cont = 0;
      for (int c = 0; c < cantColumnas() && cont < n; c++)        
        if (mat[f][c] != null && mat[f][c].esInverso(p))
          cont++;
      if (cont >= n)
        contFil++;
    }
    return contFil == m;
  }
  
  public TablaPuntos puntosInversos(Punto p){
    // Requiere p ligado.
    TablaPuntos tabP = new TablaPuntos(mat.length);
    boolean encontre;
    int f, c;
    for (f = 0; f < cantFilas(); f++){
      encontre = false;
      for (c = 0; c < cantColumnas() && !encontre; c++)
        if (mat[f][c] != null && mat[f][c].esInverso(p)){
          encontre = true;
          tabP.insertar(f, mat[f][c]);
        }
    }
    return tabP;  
  }
}