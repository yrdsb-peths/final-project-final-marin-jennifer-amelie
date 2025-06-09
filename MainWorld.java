import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MainWorld extends World
{
    public boolean gameOver = false;
    // number of coins being collected 
    public int coinsNum = 0;
    public Label coinLabel;
    
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
    
    public void incrementCoinCount() {
        coinsNum++;
        updateCoinLabel(coinsNum);
    }
    
    public void updateCoinLabel(int coins)
    {
        if (coinLabel != null) {
            coinLabel.setValue("Coins: " + coinsNum);
        }
    }

}

