import javax.swing.*;
import java.awt.*;
import java.lang.Math;

import static javax.swing.JFrame.EXIT_ON_CLOSE;


public class Triangles {

    public static void mainDraw(Graphics graphics) {

//        ArrayList<Integer> numlist = new ArrayList<Integer>();
//        numlist.add(4);
//        numlist.add(8);
//        numlist.add(16);
//        numlist.add(32);
//        numlist.add(64);
//
//        int randomIndex = (int) (Math.random() * numlist.size());
//        int randomValue = numlist.get(randomIndex);

        int row = 20;
        int side = 20;
        double heightOfTriangleDbl = Math.sqrt((side * side) - (side / 2) * (side / 2));
        int heightOfTriangle = (int) Math.round(heightOfTriangleDbl);
        int halfOfWidth = WIDTH / 2;

        for (int i = 0; i < row; i++) {

            graphics.setColor(new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255)));
            graphics.drawLine(halfOfWidth + ((side / 2) * i), 0 + i * heightOfTriangle, side + (side * i), HEIGHT);
            graphics.setColor(new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255)));
            graphics.drawLine(halfOfWidth - ((side / 2) * i), 0 + heightOfTriangle * i, halfOfWidth + ((side / 2) * i), 0 + heightOfTriangle * i);
            graphics.setColor(new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255)));
            graphics.drawLine(halfOfWidth - ((side / 2) * i), 0 + heightOfTriangle * i, WIDTH - (side + (side * i)), HEIGHT);

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
    static int HEIGHT = 320;

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
