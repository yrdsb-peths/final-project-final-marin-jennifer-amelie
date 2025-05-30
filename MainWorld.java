import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MainWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainWorld extends World
{
    private boolean gameOver = false;
    
    //changable for timer here
    int timer = 3050;

    public MainWorld()
    {
        super(680, 520, 1);
        
    }
    
    public MainWorld(int width, int height, int cellSize)
    {    
        super(width, height, cellSize);
    }
    
    public void setGameOver(boolean value) {
        gameOver = value;
    }
    
    public boolean isGameOver() {
        return gameOver;
    }
    
    public void act(){
        if (gameOver) {
            return;
        }
        
        //add number on timer
        timer--;
        showText(""+timer / 100, 342, 20);

        if (timer <= 0){
            Greenfoot.stop();
        }
        
        //Collecting Coins
        
    }
}

