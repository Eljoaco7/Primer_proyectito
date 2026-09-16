package Primer_proyectito.TP3.Ej_7;

public class MasPreguntas {
/*a. Una clase A está asociada a la clase B si tiene uno o más atributos de la clase B.

b. Si una clase A está asociada a una clase B, el ambiente de referenciamiento de un método definido
en la clase A incluye a todos los atributos y servicios definidos en B.

c. Si una clase A está asociada a una clase B y A incluye un método p, la clase B no puede definir un
método p con el mismo número y tipo de parámetros que el método p definido en A.

d. Existe una relación de dependencia entre las clases A y B, si A declara una variable local, un
parámetro o retorna un resultado de clase B.        

A) Si, una clase se dice que esta asociada a otra cuando tiene 1 o mas atributos de instancia del tipo
de la otra clase

B) No, el ambiente de referenciamiento de un método de A está formado por los
atributos y servicios propios de A (más sus parámetros y variables locales),
no por los de B. Para acceder a un atributo o servicio de B hay que hacerlo
de forma calificada, a través de la referencia (por ejemplo capitan.obtenerNombre()),
nunca en forma directa como si fuera propio de A.

C) No, de hecho si puede ya que son métodos de clases distintas, cada uno actua por su cuenta
y no generan colisiones mas haya de una confusion visual para el programador, en varias clases
ya hemos definido equals y toString en clases que son asociadas entre si y no pasa nada.

D) Si es correcta, surge de una relación del tipo usaUn entre
los objetos.


*/
    
}
