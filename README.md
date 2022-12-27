# Api stream
Ejercicios con streams

Se realzian diferentes ejecicios para la manipulacion de los streams en java

# Streams

Estos son flujos de informacion que tiene operadores manipulacion pero que solo
pueden tener un operador terminal al momento de hacer uno de estos operadores
el stream ya fanalizo el flujo y no se puede volver a manipular.

Esto flujos se puede llenar de diferente maneras, uno de ellas de directamente
con el metodo .of(), otra manera seria mediante la propiedad de las listas .stream()
las cuales transforman estas estructuras en flujos de informacion en el caso de 
arreglos tenemos stream.builder() el cual podermos hacer llenada usando el .add()

# Operadores finales 
+ .count() -> nos permite realizar el contero de un flujo <br>
+ .anyMatch() -> nos permite realizar una busqueda de un elemento cualquiera en el flujo <br>
+ .collect() -> este permite transformar un flujo en una lista <br>
+ .summaryStatistics() -> este nos permite obterner las siguientes estadisticas del flujo en valores enteros ejemplo el largo de los nombres de un modelo usuarios aqui los operadores: <br>
  ================= <br>
   .getSum() -> la sumataria totales de un flujo <br>
   .getMax() -> nos retorna el elemento con el mayor valor <br> 
   .getMin() -> nos retorna el elemento con el menor valor <br> 
   .getAverage() -> nos retorna promerio <br> 
  ================= <br> 
*Nota : IntSummaryStatistics se usa en conjunto MapToInt y con el flujo IntStream existe tambien sus equivalentes para Long y Double.* <br>
+ .forEach() -> nos permite recorrer el resultado del stream <br> 

# Operadores Intermedios
+ .map() -> es del tipo function y manipula la informacion del stream y retorna un valor resultado de esa operacion del tipo del flujo que se esta analizando <br>
+ .filter() -> se encarga de filtrar la informacion del stream <br>
+ .disctinct() -> este nos permite agurpar los elementos repetidos del stream <br>
+ .flatMap() -> retorna diferentes de streams despues de su manipulacion del flujo de informacion <br>
+ .concat() -> se usa para concatnear informacion dentro los streams <br>
+ .peek() -> nos permite ver el paso a paso en el stream mientras de va tranformando <br>

en el proyecto encontraran algunos ejecicios basico de manipulacion de informacion fija de los stream pero tambien hay implementaciones manipulando
modelos los cuales son Usuario y Factura son ejemplos sencillos pero se explica como manipular un flujo de objetos.



  
  
  
  
  





