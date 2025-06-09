import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The MainWorld class is a superclass contains the main functions of its
 * child class which are: Easy, Ending, Ending2, Hard, Medium, Scene 1-6.
 * 
 * Some of the available functions are:
 * 1. Check if the game is over
 * 2. Update the number of coins that the user has collected
 * 3. Set the timer for the game
 * 4. Creating a child class of any size
 */

public class MainWorld extends World
{
    // gameOver boolean
    public boolean gameOver = false;
    
    // number of coins being collected 
    public int coinsNum = 0;
    // label for the coin scores
    public Label coinLabel;
    
    //changable for timer here
    int timer = 3050;
    
    
    public MainWorld()
    {
        super(680, 520, 1);
    }
    
    
    // allows the child classes to create worlds
    public MainWorld(int width, int height, int cellSize)
    {    
        super(width, height, cellSize);
    }
    
    // Sets the gameOver value
    public void setGameOver(boolean value) {
        gameOver = value;
    }
    
    // tells the other methods whether if game is over
    public boolean isGameOver() {
        return gameOver;
    }
    
    // increases the coin scores
    public void incrementCoinCount() {
        coinsNum++;
        updateCoinLabel(coinsNum);
    }
    
    
    // updates the label for the coin score
    public void updateCoinLabel(int coins)
    {
        if (coinLabel != null) {
            coinLabel.setValue("Coins: " + coinsNum);
        }
    }

}

