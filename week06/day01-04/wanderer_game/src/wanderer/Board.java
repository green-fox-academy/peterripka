package wanderer;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JFrame;


public class Board extends JComponent implements KeyListener {
    int dirX;
    int dirY;
    int dirXMonster;
    int dirYMonster;
    PositionedImage image = new PositionedImage( "img/hero-down.png", 0, 0 );
    List<Character> fillCharacter;
    boolean battleState;
    boolean isHeroAlive;
    boolean keyHolderDead;
    boolean bossDead;
    int charStepCounter;
    boolean monsterMoved;
//    boolean isGameOver;
    int randomNum;

    public Board() {
        this.setPreferredSize( new Dimension( 720, 800 ) );
        this.setVisible( true );
        this.dirX = 0;
        this.dirY = 0;
        this.dirXMonster = 0;
        this.dirYMonster = 0;
        fillCharacter = fillupList();
        battleState = false;
        isHeroAlive = true;
        keyHolderDead = false;
        bossDead = false;
        this.charStepCounter = 1;
        monsterMoved = false;
//        isGameOver = false;

    }

    Hero hero = new Hero();

    public List<Character> fillupList() {
        List<Character> tempList = new ArrayList<Character>();
        for (int i = 0; i < 3; i++) {
            Skeleton skeleton = new Skeleton();
            skeleton.setPosXY();
            tempList.add( skeleton );
        }
        Boss boss = new Boss();
        boss.setPosXY();
        tempList.add( boss );
        KeyHolder keyHolder = new KeyHolder();
        keyHolder.setPosXY();
        tempList.add( keyHolder );
//        tempList.add( hero );
        return tempList;
    }

    BoardArray boardArray = new BoardArray();

    public void paint(Graphics graphics) {
        super.paint( graphics );
        Tile floor = new Floor( 0, 0 );
        Tile wall = new Wall( 0, 0 );

        for (int i = 0; i < boardArray.getBoardArray().length; ++i) {
            for (int j = 0; j < boardArray.getBoardArray().length; ++j) {
                int globalY = i * 72;
                int globalX = j * 72;
                if (boardArray.getBoardArray()[i][j] == 0) {
                    globalX = 72 * j;
                    floor.posX = globalX;
                    floor.posY = globalY;
                    floor.draw( graphics );
                } else {
                    globalX = 72 * j;
                    wall.posX = globalX;
                    wall.posY = globalY;
                    wall.draw( graphics );
                }
            }
        }
        for (Character character : fillCharacter) {
            character.draw( graphics );
        }
        drawStat( graphics );
        hero.draw( graphics );
    }


    public void keyTyped(KeyEvent e) {
    }

    public void keyPressed(KeyEvent e) {
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame( "RPG Game" );
        Board board = new Board();
        frame.add( board );
        frame.setDefaultCloseOperation( 3 );
        frame.setVisible( true );
        frame.pack();
        frame.addKeyListener( board );
    }

    public void checkCollision() {
        for (int i = 0; i < fillCharacter.size(); i++) {
            if (hero.getPosX() == fillCharacter.get( i ).getPosX() && hero.getPosY() == fillCharacter.get( i ).getPosY())
                battleState = true;
        }
    }

    public Character getMonster() {
        for (int i = 0; i < fillCharacter.size(); i++) {
            if (hero.getPosX() == fillCharacter.get( i ).getPosX() && hero.getPosY() == fillCharacter.get( i ).getPosY()) {
                return fillCharacter.get( i );
            }
        }
        return null;
    }

    public void removeMonster(Character character) {
        int index = fillCharacter.indexOf( getMonster() );
        fillCharacter.remove( index );

    }

    public void drawStat(Graphics g) {
        g.setFont( new Font( "Calibri", Font.BOLD, 17 ) );
        g.drawString( hero.toString(), 25, 740 );
        if (battleState && isHeroAlive) {
            g.setFont( new Font( "Calibri", Font.PLAIN, 18 ) );
            g.drawString( "[ your hero encountered a horrible monster, press >SPACE< to fight it ]", 80, 762 );
            g.setFont( new Font( "Calibri", Font.BOLD, 17 ) );
            g.drawString( getMonster().toString(), 25, 785 );
        }
        if (isHeroAlive && bossDead && !battleState && keyHolderDead) {
            g.setColor( new Color( 0, 0, 0, 180 ) );
            g.fillRect( 0, 310, 720, 100 );
            g.setFont( new Font( "Arial", Font.BOLD, 80 ) );
            g.setColor( Color.YELLOW );
            g.drawString( "< YOU WON! >", 85, 390 );
        } else if (!isHeroAlive) {
            g.setColor( new Color( 0, 0, 0, 180 ) );
            g.fillRect( 0, 310, 720, 100 );
            g.setFont( new Font( "Arial", Font.BOLD, 80 ) );
            g.setColor( Color.CYAN );
            g.drawString( "< GAME OVER >", 50, 390 );
        }
    }

    public void keyReleased(KeyEvent e) {
        if (!battleState && isHeroAlive && charStepCounter % 3 != 0) {
            if (e.getKeyCode() == KeyEvent.VK_UP && dirY > 0 && boardArray.getBoardArray()[dirY - 1][dirX] == 0) {
                hero.goUp();
                dirY--;
                charStepCounter++;
            } else if (e.getKeyCode() == KeyEvent.VK_DOWN && dirY < 9 && boardArray.getBoardArray()[dirY + 1][dirX] == 0) {
                hero.goDown();
                dirY++;
                charStepCounter++;
            } else if (e.getKeyCode() == KeyEvent.VK_LEFT && dirX > 0 && boardArray.getBoardArray()[dirY][dirX - 1] == 0) {
                hero.goLeft();
                dirX--;
                charStepCounter++;
            } else if (e.getKeyCode() == KeyEvent.VK_RIGHT && dirX < 9 && boardArray.getBoardArray()[dirY][dirX + 1] == 0) {
                hero.goRight();
                dirX++;
                charStepCounter++;
            }
            checkCollision();
        } else if (!battleState && charStepCounter == 3) {
            for (Character character : fillCharacter) {
                dirXMonster = character.getPosX() / 72;
                dirYMonster = character.getPosY() / 72;
                boolean monsterMoved = false;
                while (!monsterMoved) {
                    int randomNum = (int) (Math.random() * 4 + 1);
                    if (randomNum == 1 && dirYMonster > 0 && boardArray.getBoardArray()[dirYMonster - 1][dirXMonster] == 0) {
                        character.goUp();
                        dirYMonster--;
                        monsterMoved = true;
                    } else if (randomNum == 2 && dirYMonster < 9 && boardArray.getBoardArray()[dirYMonster + 1][dirXMonster] == 0) {
                        character.goDown();
                        dirYMonster++;
                        monsterMoved = true;
                    } else if (randomNum == 3 && dirXMonster > 0 && boardArray.getBoardArray()[dirYMonster][dirXMonster - 1] == 0) {
                        character.goLeft();
                        dirXMonster--;
                        monsterMoved = true;
                    } else if (randomNum == 4 && dirXMonster < 9 && boardArray.getBoardArray()[dirYMonster][dirXMonster + 1] == 0) {
                        character.goRight();
                        dirXMonster++;
                        monsterMoved = true;
                    }
                    checkCollision();
                    charStepCounter = 1;
                }
            }

        } else {
            if (e.getKeyCode() == KeyEvent.VK_SPACE) {
                while (hero.getCurrHealthPoint() >= 0 && getMonster().getCurrHealthPoint() >= 0) {
                    hero.strike( getMonster() );
                }
                if (hero.getCurrHealthPoint() <= 0) {
                    isHeroAlive = false;
                    battleState = false;
//                    isGameOver = true;
                } else {
                    if (getMonster() instanceof KeyHolder) {
                        keyHolderDead = true;
                    } else if (getMonster() instanceof Boss) {
                        bossDead = true;
                    }
                    hero.setLevel( hero.getLevel() + 1 );
                    battleState = false;
                    hero.levelUp();
                    removeMonster( getMonster() );
//                    if (keyHolderDead && bossDead) {
//                        isGameOver = true;
//                    }
                }
            }
        }
        // and redraw to have a new picture with the new coordinates
        repaint();
    }
}
