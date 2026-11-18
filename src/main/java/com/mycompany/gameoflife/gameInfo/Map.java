package com.mycompany.gameoflife.gameInfo;

public class Map {

    //I'm supposed to use getters, aren't I?
    private Cell[][][] map;
    private boolean infinite;
    private int height;
    private int width;
    private int depth;
    
    public Map(int height, int width, int depth, boolean infinite){
        this.height = height;
        this.width = width;
        this.depth = depth;
        map = new Cell[height][width][depth];
        this.infinite = infinite;
    }
    
    public boolean isInfinite(){return infinite;}
    public int getHeight(){return height;}
    public int getWidth(){return width;}
    public int getDepth(){return depth;}
    
    
    public Cell getCell(int row, int col, int depth){
        return map[row][col][depth];
    }
    public int setCell(int row, int col, int depth, Cell cell){
        if (cell == null){
            return -1;
        }
        map[row][col][depth] = cell;
        return 0;
    }
    public Coords[] findNeighbors(Coords coords){
        Coords[] neighbors = new Coords[26]; //26 neighbors
        //Gonna use 3 loops and the coords system now. I can now be null. 
        
        
        return neighbors;
        
    }
    
    
    
    
}
