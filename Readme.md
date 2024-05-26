# IndexMasaM-Java
## Requiered
- jdk-17.0.10_windows-x64
- Maven
- Dependencias: hamcrest, mysql
### Exercise

<strong>Calcula el Indice de la masa corporal a partir de la estatura y el peso del individuo:</strong>
<hr>

<br>
Aplica las siguientes normas:

Etapa 1:
Calculo del Indice de masa Corporal (IMC). 
- Se importa la clase: java.util.Scanner para capturar el dato del usuario. Se inicia un objeto scanner bajo el nombre capt a través de capt.nextInt(). Y al final se cierra con capt.close();
- Solicita la altura en centimetros, la convierte en metros dividiendo el valor en 100, reasignando el valor a la variable tipo entero (sizePerson).
- Solicita el peso en kiñogramos.
- Mediante el método Math.pow() se calcula la potencia del valor de la variable sizePerson (Estatura).
- Se define una variable tipo double para recibir el valor del calculo del IMC.
- Para facilitar la presentación del indicador reduciendo sus decimales a maximo dos, se utiliza el metodo Math.round().

Etapa 2
Clasificación del IMC según la tabla de criterios.

- Mediante el uso de condicionales se realiza la comparación de los rangos y devuelve el texto de la categoria correspondiente: delgadez, normal, sobrepeso, obecidad, etc.  