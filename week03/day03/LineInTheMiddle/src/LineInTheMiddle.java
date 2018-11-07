import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LineInTheMiddle {
    public static void mainDraw(Graphics graphics){
        // draw a red horizontal line to the canvas' middle.
        // draw a green vertical line to the canvas' middle.

        graphics.setColor(Color.GREEN);
        graphics.drawLine(0 , HEIGHT/2, 600, HEIGHT/2);

        graphics.setColor(Color.RED);
        graphics.drawLine(WIDTH/2, 0, WIDTH/2, 500);

        //        graphics.fillRect(450, 350, 53, 24);
        //        graphics.setColor(new Color(145, 220, 255));
        //        graphics.drawRect(100, 100, 300, 300);
        //
        //        graphics.setColor(Color.MAGENTA);
        //        int xpoints[] = {25, 145, 25, 145, 25};
        //        int ypoints[] = {25, 25, 145, 145, 25};
        //        int npoints = 5;                        // or xpoints.length
        //
        //        graphics.drawPolygon(xpoints, ypoints, npoints);
        //
        //        graphics.setColor(Color.CYAN);
        //        graphics.fillPolygon(xpoints, ypoints, npoints);
        //
        //
        //        graphics.setColor(Color.ORANGE);
        //
        //        for (int i = 0; i < 50; i+=10) {
        //            graphics.setColor(new Color((int) (Math.random() *256), (int)(Math.random() *256), (int)(Math.random() *256)));
        //            graphics.fillRect(i, i, 20, 20);

        }

    // Don't touch the code below
    static int WIDTH = 600;
    static int HEIGHT = 500;

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