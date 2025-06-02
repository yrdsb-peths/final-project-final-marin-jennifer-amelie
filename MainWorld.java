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
    private Capybara capybara;

    
    Label label1 = new Label("A long time ago, in Solcieleux, a kingdom", 30);
    Label label2 = new Label("characterized by its striking beauty of the sky", 30);
    Label label3 = new Label("and nature, was ruled by two inseparable friends: ", 30);
    Label label4 = new Label("Capybara and Birdie.", 30);
    
    //changable for timer here
    int timer = 3050;
    SimpleTimer animationTimer = new SimpleTimer();

    public MainWorld()
    {
        super(680, 520, 1);
        GreenfootImage kingdomBg = new GreenfootImage("images/kingdom.png");
        kingdomBg.scale(680, 520); 
        getBackground().drawImage(kingdomBg, 0, 0);
        addObject(label1, 300, 40);
        
        capybara = new Capybara();
        addObject(capybara, 400, 550); 

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
        capybara.kingbara();
        if (animationTimer.millisElapsed() > 2000) {  // after 2 seconds
            addObject(label2, 335, 80);
        }
        if (animationTimer.millisElapsed() > 4000) {  
            addObject(label3, 358, 120);
        }
        if (animationTimer.millisElapsed() > 6000) {  
            addObject(label4, 358, 160);
        }
        
    }
}

