package main;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class LineJPanel extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        this.setBackground(Color.WHITE);

        // rectangle
        int[] xRectangles = { 50, 100, 150, 100 };
        int[] yRectangles = { 150, 100, 150, 200 };
        int nRectangle = 4;

        g.setColor(Color.GREEN);
        g.drawPolygon(xRectangles, yRectangles, nRectangle);

        // star
        int[] xStars = { 150, 200, 225, 250, 300, 275, 300, 250, 225, 200, 150, 175 };
        int[] yStars = { 100, 100, 50, 100, 100, 150, 200, 200, 250, 200, 200, 150 };
        int nStar = 12;

        g.setColor(Color.GREEN);
        g.drawPolygon(xStars, yStars, nStar);

        // triangle
        int[] xTriangles = { 350, 350, 450 };
        int[] yTriangles = { 200, 100, 100 };
        int nTriangle = 3;

        g.setColor(Color.GREEN);
        g.drawPolygon(xTriangles, yTriangles, nTriangle);

    }
}
