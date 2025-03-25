# Mis notas de aprendizaje Java-Gym

## Java

### Prólogo - Configuración de IntelliJ IDEA para que reconozca las carpetas como parte de un proyecto Java

Para poder crear clases Java en nuestro repositorio a través de IntelliJ IDEA, necesitamos configurar correctamente la estructura del proyecto. El problema es que IntelliJ no reconoce automáticamente la carpeta como parte de un proyecto Java.
Aquí están los pasos para solucionarlo:

1. Primero, necesitamos marcar las carpetas como "Sources Root" para que IntelliJ reconozca que contienen código fuente Java:

   - Hacemos clic derecho en la carpeta "chapter1"
   - Vamos a "Mark Directory as"
   - Seleccionamos "Sources Root"

2. Alternativamente, podemos configurar todo el repositorio como un proyecto Java:

   - Vamos a File > Project Structure (o presionamos Ctrl+Alt+Shift+S)
   - En la sección "Project", aseguramos que el SDK esté configurado con la versión de Java que queremos
   - En la sección "Modules", añadimos las carpetas que queremos como módulos Java
   - Para cada módulo, marcamos las carpetas correspondientes como "Sources"

3. Otra opción es crear una estructura de proyecto Maven:

   - Clic derecho en la carpeta raíz
   - New > Module (o Project)
   - Seleccionamos Maven
   - Seguimos el asistente para crear la estructura correcta

### Capítulo 2: Type Conversion

Cuando se hace un casting de primitivos de coma flotante (float, double) a primitivos enteros, el número se redondea hacia abajo.

No se puede hacer cast de un boolean o hacia un tipo boolean.

Un char se guarda en memoria con 2 bytes, y puede almacenar cualquier carácter Unicode. Es un tipo numérico.

El operador **instanceof** nos permite comprobar si un objeto es de un determinado tipo o una subclase de ese tipo.

### Capítulo 3: Getters and Setters

Crea una clase llamada Libro que tenga un atributo privado llamado titulo (de tipo String).
1. Añade un getter público para el atributo titulo.
2. Añade un setter público para el atributo titulo. Este setter debe tener una restricción: el título no puede estar vacío (es decir, no puede ser null ni una cadena de texto vacía ""). Si se intenta establecer un título vacío, el setter no debe hacer nada.

En la solución, el setter setTitulo verifica si el nuevoTitulo es válido antes de asignarlo al atributo privado titulo. Esto demuestra cómo los setters pueden implementar restricciones para proteger la integridad de los datos de la clase.

Convenciones de nomenclatura:
* Para variables no booleanas:
   * Getter: getVariableName() (el nombre de la variable comienza con mayúscula).
   * Setter: setVariableName(...) (el nombre de la variable comienza con mayúscula).
* Para variables booleanas:
   * Getter: isVariableName() (el nombre de la variable comienza con mayúscula).
   * Setter: setVariableName(...) (el nombre de la variable comienza con mayúscula).

### Chapter 4: Reference Data Types

En Java, cuando trabajamos con tipos de datos de referencia (como objetos), las variables no almacenan el objeto directamente, sino que guardan la dirección de memoria donde ese objeto reside. Esta dirección es lo que llamamos una referencia.

La referenciación es el proceso de acceder al objeto real en la memoria utilizando esa referencia. Cuando se usa el operador punto (.) sobre una variable de referencia para interactuar con sus miembros (campos o métodos), el JVM utiliza la referencia para encontrar el objeto y luego accede al miembro solicitado.

Para instanciar un tipo de referencia, se utiliza la palabra clave new seguida de una llamada al constructor de la clase.

Object obj = new Object(); // Note the 'new' keyword
Aquí, Object es el tipo de referencia. obj es la variable en la que se almacenará la nueva referencia. Object() es la llamada al constructor de la clase Object. Esto es lo que sucede:
• Se asigna espacio en la memoria (heap) para el objeto.
• Se llama al constructor Object() para inicializar ese espacio de memoria.
• La dirección de memoria del objeto recién creado se almacena en la variable obj, de modo que obj hace referencia al objeto.

## Spring

## Hibernate

