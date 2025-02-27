# Mis notas de aprendizaje Java-Gym

## Java

### Configuración de IntelliJ IDEA para que reconozca las carpetas como parte de un proyecto Java

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

### Punto 2

## Spring


## Hibernate

