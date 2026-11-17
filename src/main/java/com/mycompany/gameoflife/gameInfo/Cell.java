package com.mycompany.gameoflife.gameInfo;

public class Cell {

private int age;
private boolean alive;
public static int cellCount;
public static int liveCellCount;
public static int deadCellCount;

    public int getAge() {return this.age;}
    public boolean getIsAlive(){return this.alive;}
    
    //Could prolly add in error checking later
    public Cell(int age, boolean alive){
        this.age = age;
        this.alive = alive;
        if (alive){ 
            liveCellCount++;
        }else{
            deadCellCount++;
        }
        cellCount++;
    }
    
    public int kill(){
        deadCellCount++; liveCellCount--;
        age = 0;
        alive = false;
        return 0;
    }
    public int birth(){
        liveCellCount ++;deadCellCount--;
        age = 0;
        alive = true;
        return 0;
    }
    public int survive(){
        age++;
        alive = true;
        return 0;
    }
}
