package com.mycompany.gameoflife;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class GamePanel extends JPanel {
    
    private final int screenWidth = 600; //Placeholders
    private final int screenHeight = 600;
    
    
    public GamePanel(){
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.white);
        this.setDoubleBuffered(true);

        this.setFocusable(true);
        this.requestFocusInWindow();
    }
    
    
    public void paintComponent(Graphics g){ //Everything should be painted in here
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        
        
    }
    
}
