import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FractalTree {

    private static void drawTree(Graphics g, int x1, int y1, double angle, int depth) {
        if (depth == 0) return;
        int x2 = x1 + (int) (Math.cos( Math.toRadians( angle ) ) * depth * 5.0);
        int y2 = y1 + (int) (Math.sin( Math.toRadians( angle ) ) * depth * 5.0);
        g.drawLine( x1, y1, x2, y2 );
        g.setColor( new Color( (int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256) ) );
        drawTree( g, x2, y2, angle - 30, depth - 1 );
        drawTree( g, x2, y2, angle + 0, depth - 1 );
        drawTree( g, x2, y2, angle + 30, depth - 1 );
    }

    static int WIDTH = 500;
    static int HEIGHT = 500;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame( "Drawing" );
        jFrame.setDefaultCloseOperation( EXIT_ON_CLOSE );
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize( new Dimension( WIDTH, HEIGHT ) );
        jFrame.add( panel );
        jFrame.setLocationRelativeTo( null );
        jFrame.setVisible( true );
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        public void paint(Graphics g) {
            drawTree( g, 250, 350, -90, 11 );
        }
    }
}