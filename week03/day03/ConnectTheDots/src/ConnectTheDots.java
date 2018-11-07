import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ConnectTheDots {
    public static void mainDraw(Graphics graphics) {
        // Create a function that takes 1 parameter:
        // An array of {x, y} points
        // and connects them with green lines.
        int[][] box = {{10, 10}, {290, 10}, {290, 290}, {10, 290}};
        int[][] whatIsThis = {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
                {120, 100}, {85, 130}, {50, 100}};

        draw(graphics, box);
        draw(graphics, whatIsThis);
    }

    public static void draw(Graphics graphics, int[][] input) {

        int[] xPoints = new int[input.length];
        int[] yPoints = new int[input.length];
        int nPoints = input.length;

        for (int i = 0; i < input.length; i++) {
            xPoints[i] = input[i][0];
            yPoints[i] = input[i][1];
        }
        graphics.setColor(Color.GREEN);
        graphics.drawPolygon(xPoints, yPoints, nPoints);
    }

    // Don't touch the code below
    static int WIDTH = 320;
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