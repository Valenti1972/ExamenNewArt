# ExamenNewArt
Practica examen 9 juny 2023
Enunciat
La galería de arte "New Art" se dedica a la compra, exposición y venta de obras de arte de
jóvenes artistas que se concretan en esculturas y cuadros. Nos han encargado un pequeño
programa que debe permitir dar de alta obras de arte y realizar un sencillo control de las
compras, las ventas y los beneficios.
De cada obra de arte interesa almacenar el nombre, el autor, el precio de compra, el precio de
venta y si está o no vendida. Además, cuando se trata de una escultura queremos guardar el
material del cual se compone (piedra, mármol y arcilla) y sus medidas: alto, ancho y profundo.
En cambio, cuando se trata de un cuadro queremos almacenar el tipo de pintura (óleo, fresco y
acuarela), su ancho y su alto.
De lo expuesto identificamos, inicialmente, la jerarquía de clases siguiente:
• ObraArte: Superclase no instanciable que dispone de los atributos comunes para las
subclases.
• Escultura: Subclase instanciable de ObraArte con cuatro atributos.
• Cuadro: Subclase instanciable de ObraArte con tres atributos.
ACTIVITAT 1
(2 punts)
Cread la clase ObraArte, añadid un constructor que dé valor a todos sus
atributos, a excepción del atributo ‘precio de venta’ y del atributo ‘vendida’.
Añadid los métodos accesores y modificadores para todos los atributos.
Consideraciones: Los atributos relativos al precio serán del tipo ‘float’.
Cread la clase Escultura, añadid un constructor que dé valor tanto a los
atributos que necesita el constructor de la superclase como a los suyos propios.
Por último, añadid los métodos accesores y modificadores para sus cuatro
atributos.
Cread la clase Cuadro, añadid un constructor que dé valor tanto a los atributos
que necesita el constructor de la superclase como a los suyos propios. Por
último, añadid los métodos accesores y modificadores para sus tres atributos.
Consideraciones: las medidas de las obras de arte serán del tipo ‘int’.
ACTIVITAT 2
(0,75 punts)
Sería interesante disponer de un atributo compartido por todas las obras de arte
que nos permitiera conocer en cualquier momento el total de obras existentes.
Cread este atributo de clase ‘contador’, de tipo ‘long’ y haced que se
incremente en cada instanciación de una obra de arte.
Necesitaremos un método público para poder obtener el valor del contador
desde fuera de la clase.
ACTIVITAT 3
(0,75 punts)
Queremos un código para identificar cada obra de arte. La solución que
decidimos implementar es crear un atributo de instancia llamado ‘codigo’ de
tipo ‘long’, que tomará su valor del contador general de obras de arte cada vez
que creemos una obra.
Ejemplo: Si tenemos tres obras de arte porque hemos creado dos Esculturas y
un Cuadro:
contador=3
escultura1-> codigo=1
escultura2-> codigo=2
cuadro1-> codigo=3
ACTIVITAT 4
(1,5 punts)
Para comprobar que lo realizado hasta el momento funciona vamos a crear una
clase llamada Principal, donde:
● Creamos un array del tipo ObraArte con capacidad para almacenar
cuatro obras.
● Creamos dos esculturas y dos cuadros.
● Añadimos las obras creadas en el array.
● Recorremos el array y mostramos el código y el nombre de cada obra
de arte.
ACTIVITAT 8
(1,5 punts)
Queremos recorrer el bucle para mostrar información detallada como la de la
imagen:
Para ello vamos a crear un método de instancia llamado ‘toString’ en la
superclase que devuelva un String con todos los atributos. En casa subclase
ampliaremos este método para añadir la información propia. Finalmente en el
bucle del programa principal podremos imprimir toda la información con una
simple llamada a ‘toString’ de la obra de arte en curso.
Consideraciones: Para concatenar cadenas utilizaremos la clase
StringBuilder.
RESULTAT DE L’OBSERVACIÓ I AVALUACIÓ DE LA PRÀCTICA
ACTIVITA
T
FACTORS ESCALES PUNTUACIÓ
Màx. Obtinguda Mín.
1
Implementa les
característiques
demanades a
l’enunciat amb
eficiència i
estàndards de
qualitat
Totes les característiques
10 2 0
La meitat de les
característiques 5
Cap de les característiques
0
AVALUACIÓ ACTIVITAT 1 APTE NO APTE
MD032013QP12102MD032013QP12102
3
2
Implementa les
característiques
demanades a
l’enunciat amb
eficiència i
estàndards de
qualitat
Totes les característiques 10
0,75 0
La meitat de les
característiques
5
Cap de les característiques 0
AVALUACIÓ ACTIVITAT 2 APTE NO APTE
3
Implementa les
característiques
demanades a
l’enunciat amb
eficiència i
estàndards de
qualitat
Totes les característiques 10
0,75 0La meitat de les
característiques
5
Cap de les característiques 0
AVALUACIÓ ACTIVITAT 3 APTE NO
APTE
4
Implementa les
característiques
demanades a
l’enunciat amb
eficiència i
estàndards de
qualitat
Totes les característiques 10
1,5 0La meitat de les
característiques
5
Cap de les característiques 0
AVALUACIÓ ACTIVITAT 4 APTE NO
APTE
5
Implementa les
característiques
demanades a
l’enunciat amb
eficiència i
estàndards de
qualitat
Totes les característiques 10
1 0La meitat de les
característiques
5
Cap de les característiques 0
AVALUACIÓ ACTIVITAT 5 APTE NO
APTE
6
Implementa les
característiques
demanades a
l’enunciat amb
eficiència i
estàndards de
qualitat
Totes les característiques
10
1,25 0La meitat de les
característiques
5
Cap de les característiques 0
AVALUACIÓ ACTIVITAT 6 APTE NO
APTE
7
Implementa les
característiques
demanades a
l’enunciat amb
eficiència i
estàndards de
qualitat
Totes les característiques 10
1,25 0La meitat de les
característiques
5
Cap de les característiques 0
AVALUACIÓ ACTIVITAT 7 APTE NO
APTE
8
Implementa les
característiques
demanades a
l’enunciat amb
eficiència i
estàndards de
qualitat
Totes les característiques 10
1,5 0La meitat de les
característiques
5
Cap de les característiques 0
AVALUACIÓ ACTIVITAT 8 APTE NO
APTE
