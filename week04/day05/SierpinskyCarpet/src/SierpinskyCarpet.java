import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SierpinskyCarpet {
    public static void mainDraw(Graphics graphics) {

        graphics.fillRect( 0, 0, WIDTH, HEIGHT );
        draw( graphics, WIDTH / 2 - WIDTH / 6, HEIGHT / 2 - HEIGHT / 6, WIDTH / 3, HEIGHT / 3, 4 );

    }

    public static void draw(Graphics graphics, int x, int y, int width, int height, int level) {

        graphics.setColor(new Color((int) (Math.random() *256), (int)(Math.random() *256), (int)(Math.random() *256)));
        graphics.fillRect( x, y, width, height );

        if (level > 0) {
            draw( graphics, x + (width / 3), y - (width / 3) * 2, width / 3, height / 3, level - 1 );
            draw( graphics, x + (width / 3), y + height + height / 3, width / 3, height / 3, level - 1 );

            draw( graphics, x - (width / 3) * 2, y + height / 3, width / 3, height / 3, level - 1 );
            draw( graphics, x + width + (width / 3), y + height / 3, width / 3, height / 3, level - 1 );

            draw( graphics, x - (width / 3) * 2, y - (width / 3) * 2, width / 3, height / 3, level - 1 );
            draw( graphics, x + width + (width / 3), y + height + height / 3, width / 3, height / 3, level - 1 );

            draw( graphics, x - (width / 3) * 2, y + height + height / 3, width / 3, height / 3, level - 1 );
            draw( graphics, x + width + (width / 3), y - (width / 3) * 2, width / 3, height / 3, level - 1 );
        }
    }


    static int WIDTH = 600;
    static int HEIGHT = 600;

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
        protected void paintComponent(Graphics graphics) {
            super.paintComponent( graphics );
            mainDraw( graphics );
        }
    }
}