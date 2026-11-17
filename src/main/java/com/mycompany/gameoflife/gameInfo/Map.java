package com.mycompany.gameoflife.gameInfo;

public class Map {

    //I'm supposed to use getters, aren't I?
    public Cell[][][] map;
    boolean wrapAround;
    
    
    public Map(int height, int width, int depth, boolean wrapAround){
        map = new Cell[height][width][depth];
        this.wrapAround = wrapAround;
    }
    
    
    
    
}
