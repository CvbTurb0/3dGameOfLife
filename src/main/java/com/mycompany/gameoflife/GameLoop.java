package com.mycompany.gameoflife;

import com.mycompany.gameoflife.gameInfo.Cell;
import com.mycompany.gameoflife.gameInfo.Map;
import com.mycompany.gameoflife.gameInfo.Rules;

public class GameLoop {
    
    private Map currentMap;
    private Rules rules;
    
    
    public int initialize(Rules rules, int[] coords, int height, int width, int depth, boolean wrapAround){
        this.rules = rules;
        this.currentMap = new Map(height, width, depth, wrapAround);
        
        if (coords.length % 3 != 0){
            return -1;
        }
        //Make empty map
        for (int i = 0; i < height; i++){
            for (int j = 0; j < width; j++){
                for (int k = 0; k <  depth; k++){
                    currentMap.map[i][j][k] = new Cell(0, false);
                }
            }
        }
        //Fill in map with begining live cells
        for (int i = 0; i < coords.length; i++){
            currentMap.map[i][++i][++i].birth();
        }
        return 0;   
    }
    public int step(){
        return 0; 
    }
    
    
}
