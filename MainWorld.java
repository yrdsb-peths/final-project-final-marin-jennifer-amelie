import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

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
        
    }
}

