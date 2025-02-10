package brickBreaker;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Gameplay extends JPanel implements KeyListener, ActionListener {
    private boolean play = false;
    private int score = 0;
    private int totalBricks = 21;
    private Timer time;
    private int delay = 8;
    private int playerX = 310;
    private int ballposX = 120;
    private int ballposY = 350;
    private int ballXdir = -1;
    private int ballYdir = -2;

    public Gameplay(){
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        timer = new Timer(delay,this);
        timer.start();
    }

    public void point(Graphics g){
        //background
        g.setColor(Color.black);
        g.fillRect(1,1,692,592);

        //borders
        g.setColor(Color.yellow);
        g.fillRect(0,0,3,592);
        g.fillRect(0,0,692,2);
        g.fillRect(691,0,3,592);

        // he paddel
        g.setColor(Color.gray);
        g.fillRect(playerX, 550,100,0);

        // the ball
        g.setColor(Color.CYAN);
        g.fillRect(ballposX,ballposY,20,20);
    }

    private void setFocusTraversalKeysEnabled(boolean focusTraversalKeysEnabled) {
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
            if(playerX >=600){
                playerX = 600;
            } else {
                moveRight();
            }

        }
        if(e.getKeyCode() == KeyEvent.VK_LEFT) {
            if(playerX <10){
                playerX = 10;
            } else {
                moveLeft();
            }

        }

    }


}
