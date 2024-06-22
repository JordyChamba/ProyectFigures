# Programacón Funcional (Figuras)

## Descripción
Shape Drawer es una aplicación gráfica simple creada en Java que permite a los usuarios dibujar diferentes formas (círculo, triángulo y cuadrado) en un panel de dibujo. Esta aplicación utiliza conceptos de programación funcional, incluyendo funciones de orden superior, para definir y dibujar las formas.

## Programación Funcional y Funciones de Orden Superior
La programación funcional es un paradigma de programación que trata la computación como la evaluación de funciones matemáticas y evita el cambio de estado y los datos mutables. En este proyecto, se utiliza una función de orden superior para definir el comportamiento de dibujo de cada forma.

### Funciones de Orden Superior
Una función de orden superior es una función que toma una o más funciones como argumentos, devuelve una función como resultado, o ambas cosas. En este proyecto, las funciones `FunctionCircle`, `FunctionTriangle` y `FunctionSquare` en la clase `GraphicsClass` son ejemplos de funciones de orden superior.

## Estructura del Proyecto
El proyecto se divide en tres paquetes principales:
- `Main`: Contiene la clase principal para ejecutar la aplicación.
- `View.Panel`: Contiene los paneles de la interfaz gráfica, incluidos `MainPanel` y `DrawingPanel`.
- `Controller.Graphics`: Contiene la clase `GraphicsClass` que define las funciones de orden superior para dibujar las formas.

## Instrucciones de Ejecución
1. Clona el repositorio en tu máquina local.
2. Abre el proyecto en tu IDE favorito.
3. Asegúrate de que tienes configurado el SDK de Java.
4. Ejecuta la clase `Main` que se encuentra en el paquete `Main`.

## Ejemplo de Uso
1. Ejecuta la aplicación.
2. Haz clic en uno de los botones ("Draw Circle", "Draw Triangle", "Draw Square") para dibujar la forma correspondiente en el panel de dibujo.

## Implementación de Programación Funcional
En el archivo `DrawingPanel.java`, se utiliza programación funcional para definir las formas:

```java
private void drawShape(Graphics g) {
    switch (shape) {
        case "Circle":
            GraphicsClass.FunctionCircle(graphics -> {
                graphics.setColor(Color.RED);
                graphics.fillOval(50, 50, 100, 100);
            }, g);
            break;
        case "Triangle":
            GraphicsClass.FunctionTriangle(graphics -> {
                graphics.setColor(Color.PINK);
                int[] xPoints = {200, 250, 150};
                int[] yPoints = {50, 150, 150};
                graphics.fillPolygon(xPoints, yPoints, 3);
            }, g);
            break;
        case "Square":
            GraphicsClass.FunctionSquare(graphics -> {
                graphics.setColor(Color.DARK_GRAY);
                graphics.fillRect(300, 50, 100, 100);
            }, g);
            break;
    }
}
