package Controller.Grapichs;

import Model.Interfaces.ICircle;
import Model.Interfaces.ISquare;
import Model.Interfaces.ITriangle;

import java.awt.*;

public class GraphicsClass {
    public static void FunctionSquare(ISquare square, Graphics g){
        square.drawSquare(g);
    }
    public static void FunctionCircle(ICircle circle, Graphics g){
        circle.drawCircle(g);
    }
    public static void FunctionTriangle(ITriangle triangle, Graphics g){
        triangle.drawTriangle(g);
    }
}
