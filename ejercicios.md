1. Versión simple de ls
   Haz un programa que reciba el nombre de un directorio y muestre todo su contenido, indicando en cada caso si se trata de un fichero o directorio y los permisos que tenemos sobre él.

La salida tendrá un aspecto similar a este:

-rw- archivo

drwx directorio

...

2. Búsqueda de carácteres

Haz un programa que dado un fichero y un carácter cuente el número de ocurrencias de ese carácter en el fichero. Variante: dado un fichero encuentre el carácter más usado.

3. Ordenaciones

Haz un programa que sea capaz de ordenar alfabéticamente las líneas contenidas en un fichero de texto. El nombre del fichero que contiene se debe pasar como argumento en la línea de comandos, así como el tipo de ordenación (ascendente case-sensitive, ascendente-case-insensitive, descendente case-sensitive, descendente case-insensitive). El nombre del fichero resultado debe ser el mismo que el original añadiendo el tipo de ordenación, por ejemplo, palabras_asc_non_case.txt

4. Corrección de cuestionarios

La profesora de Acceso a Datos necesita ayuda para corregir un cuestionario de 20 preguntas tipo true/false. La respuesta correcta, los identificadores de los alumnos y sus respuestas se han guardado en un fichero de texto.

Este sería el contenido de un fichero de ejemplo test.txt:

TTTFFFTTTFTFTFTFTFTF

ABC76543 TTTFFFTTTFTFTFTFTFTF

ABC43526 TTTTTTTTTTTTTTTTTTTT

ABC12423 TTTFF TTTFTFTFTFTFTT

ABC12345 FFFFFFFFFFFFFFFFFFFF

Donde la 1ª fila contiene las respuestas correctas del cuestionario y las siguientes filas contienen el código de cada alumno y sus respuestas, una por fila. Cada respuesta correcta puntuará 0,5, cada respuesta incorrecta restará 0,15 y las respuestas en blanco no puntuarán ni penalizarán.

Escribe un programa que procese el fichero y para cada alumno (código identificador) se indique el resultado en su cuestionario.

Mejoras:

En lugar de mostrar la nota, indica su calificación dentro de esta escala:

• Entre 10 y 8.5: excelente

• Entre 8.49-7: notable

• Entre 6-6.99: bien

• Entre 5-5.99: aprobado

• Entre 0-4.99: suspenso

Añade una tabla resumen con el porcentaje de alumnos con cada calificación.

5. Coches

Dado un listado de modelos de coche, se generará un listado agrupado para cada marca con sus modelos. Por ejemplo, si tenemos los siguientes modelos en un fichero llamado coches.txt:

Mazda 5

Seat Ateca

Citröen C1

Ferrari 458 Italia

Ford Focus

Seat Tarraco

Hyundai Tucson

Mazda CX-5

Honda Civic

Seat Ibiza

Hyundai Kona

Citröen C3 Aircross

Mazda 3

Ford Fiesta

Como resultado tendremos un fichero llamado marcas.txt con el siguiente contenido:

Citröen: C1, C3 Aircross

Ferrari: 458 Italia

Ford: Fiesta, Focus

Honda: Civic

Hyundai: Kona, Tucson

Mazda: 3, 5, CX-5

Seat: Ateca, Ibiza, Tarraco

6. Prueba el código de leer y guardar objetos de tipo Persona con Mascotas. ¿Qué sucede si modificamos la clase antes de deserializar?


Extras:
1. Variante ejercicio 1: ls -R

Haz un programa que reciba el nombre de un directorio y muestre su contenido, indicando en cada caso si se trata de un fichero o directorio y los permisos que tenemos sobre él. El programa actuará recursivamente, mostrando el contenido de todos los subdirectorios con los que se vaya encontrando. Para ello, utiliza una pila en el que se guarden los nombres de directorios pendientes de mostrar. Utiliza los métodos pop para extraer y push para insertar. Pista: Deque<Path> stack = new ArrayDeque<Path>();

2. MiniShell

En este programa implementaremos una versión muy reducida de una línea de comandos. El programa guardará el directorio de trabajo en una variable, que se inicializará al directorio del proyecto.

Nota: para saber si este directorio se puede utilizar:  System.getProperty("user.dir").

El prompt de nuestro shell indicará el directorio actual seguido del símbolo ">".

El programa aceptará los comandos cd, ls y cat:

cd permitirá cambiar el directorio de trabajo. Debe aceptar tanto rutas absolutas como relativas.
ls mostrará el contenido del directorio actual. Se mostrará un símbolo "/" después de los directorios.
cat  recibirá el nombre de un archivo del directorio actual y mostrará su contenido.
3. Crea un programa para jugar al Ahorcado. Crea una clase Game que tendrá propiedades como las siguientes: state, errors, secretWord, ... De tal modo que cuando queramos dejar el juego, nos pregunte si queremos guardar el estado del juego para continuar otro día. Si es así nos pedirá el nombre del archivo y serializaremos el objeto Juego. Cada vez que comience el programa debe preguntarnos si queremos recuperar una partida anterior.