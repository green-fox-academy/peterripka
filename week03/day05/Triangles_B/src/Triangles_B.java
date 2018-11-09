import javax.swing.*;
import java.awt.*;
import java.lang.Math;

import static javax.swing.JFrame.EXIT_ON_CLOSE;


public class Triangles_B {

    public static void mainDraw(Graphics graphics) {

        int row = 21;
        int side = 20;
        double heightOfTriangleDbl = Math.sqrt((side * side) - (side / 2) * (side / 2));
        int heightOfTriangle = (int) Math.round(heightOfTriangleDbl);

        for (int i = 0; i < WIDTH / side; i++) {

            graphics.setColor(new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255)));
//            graphics.setColor(Color.RED);
            graphics.drawLine(0+(side/2*i), HEIGHT-(i*heightOfTriangle), WIDTH-(side/2*i), HEIGHT-(i*heightOfTriangle));
            graphics.setColor(new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255)));
//            graphics.setColor(Color.GREEN);
            graphics.drawLine(0+(side*i), HEIGHT, WIDTH/2+(side/2*i), HEIGHT-(row-i)*heightOfTriangle);
            graphics.setColor(new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255)));
//            graphics.setColor(Color.BLUE);
            graphics.drawLine(WIDTH-(side*i), HEIGHT, WIDTH/2-(side/2*i), HEIGHT-(row-i)*heightOfTriangle);

        }
    }


//
//            // drawing the lines with random colors for every line, to set everything to GREEN just replace the lines below to graphics.setColor(Color.GREEN);
//            for (int i = 0; i < halfOfWidth; i += gap) {
//                graphics.setColor(new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255)));
//                graphics.drawLine(halfOfWidth, i, halfOfWidth - i, halfOfHeight);
//
//                graphics.setColor(new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255)));
//                graphics.drawLine(halfOfWidth, i, halfOfWidth + i, halfOfHeight);
//
//                graphics.setColor(new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255)));
//                graphics.drawLine(halfOfWidth - i, halfOfHeight, halfOfWidth, WIDTH - i);
//
//                graphics.setColor(new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255)));
//                graphics.drawLine(halfOfWidth, HEIGHT - i, halfOfWidth + i, halfOfHeight);


    // Don't touch the code below
    static int WIDTH = 420;
    static int HEIGHT = 420;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}
