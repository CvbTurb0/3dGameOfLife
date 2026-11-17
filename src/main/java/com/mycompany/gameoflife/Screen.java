package com.mycompany.gameoflife;

import com.mycompany.gameoflife.gameRules.Rule;
import javax.swing.JFrame;

public class Screen {
       
    
    public static void main(String[] args) {

        
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle("Conways Game of Life");
        
        
        GamePanel gp = new GamePanel();
        window.add(gp);
        
        window.pack();
        

        window.setLocationRelativeTo(null);
        window.setVisible(true);
        
    }
    
}
