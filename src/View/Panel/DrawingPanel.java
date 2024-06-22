package View.Panel;

import Controller.Grapichs.GraphicsClass;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;

public class DrawingPanel extends JPanel {
    private String shape = "";

    public void setShape(String shape) {
        this.shape = shape;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawShape(g);
    }

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
                    graphics.setColor(Color.pink);
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
}
