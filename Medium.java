import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class is extended from its parent class, MainWorld.
 * This class is the medium mode of the game.
 * 
 * The medium mode contains obstacles such as toxin and the user has to jump
 * between logs in order to reach the portal and save the bird.
 */

public class Medium extends MainWorld
{
    //changable for timer here
    int timer = 2050; 
    
    // label to display the coins
    private Label coinLabel;
    
    // background sound
    GreenfootSound bg;
    /**
     * Constructor for objects of class Medium.
     * 
     */
    
    
    public Medium() { 
        super(680, 520, 1);
        setBackground("images/gameBG.png");
        
        // sets the music
        bg = new GreenfootSound("jungle.mp3");
        
        Capybara capybara = new Capybara();
        addObject(capybara, 60, 485);
        
        //switch
        Switch s = new Switch();
        addObject(s, 570, 110);
        
        //adding platforms
        Log floor = new Log("med");
        addObject(floor, 30, 575);
        Log floor1 = new Log("med");
        addObject(floor1, 380, 575);
        Log floor2 = new Log("short");
        addObject(floor2, 670, 575);
        Log floor3 = new Log("stump");
        addObject(floor3, 750, 540);
        
        Log fs = new Log("med");
        addObject(fs, 420, 425);
        Log fs2 = new Log("short");
        addObject(fs2, 180, 425);
        Log fs1 = new Log("stump");
        addObject(fs1, 50, 350);
        
        Log sd = new Log("short");
        addObject(sd, 220, 290);
        Log sd1 = new Log("short");
        addObject(sd1, 400, 275);
        Log sd2 = new Log("short");
        addObject(sd2, 580, 290);
        Log sd3 = new Log("stump");
        addObject(sd3, 725, 225);
        
        Log last = new Log("short");
        addObject(last, 570, 140);
        Log last2 = new Log("short");
        addObject(last2, 100, 125);
        
        //portal
        Portal portal = new Portal();
        addObject(portal, 100, 90);
        
        // toxin
        Toxin toxin = new Toxin(70, 15);
        addObject(toxin, 200, 575);
        
        Toxin toxin2 = new Toxin(100, 15);
        addObject(toxin2, 570, 575);
        
        Toxin toxin3 = new Toxin(270, 10);
        addObject(toxin3, 400, 290);
        
        //Coins 
        Coin coin1 = new Coin();
        addObject(coin1, 360, 480);
        
        Coin coin2 = new Coin();
        addObject(coin2, 20, 480);
        
        Coin coin3 = new Coin();
        addObject(coin3, 50, 250);
        
        Coin coin4 = new Coin();
        addObject(coin4, 400, 220);
        
        Coin coin5 = new Coin();
        addObject(coin5, 500, 370);
        
        Coin coin6 = new Coin();
        addObject(coin6, 650, 150);
        
        //add timer 
        Timer t = new Timer();
        addObject(t, 342, 20);
        
        // add the label to display the coins score
        coinLabel = new Label("Coins: 0/6", 30);
        addObject(coinLabel, 80, 20);

    }
    
    public void act(){
        // sets the volume of the music
        bg.setVolume(40);
        
        // plays the music
        bg.play();
        if(Log.getYes()){
            Log last1 = new Log("med");
            addObject(last1, 375, 140);
        }
        
        //add number on timer
        if(timer / 105 > 0){
            if(gameOver) {
                return;
            }
            timer --;
        }
        showText(""+timer / 105, 342, 20);

        if (timer / 105 <= 0.99){
            setGameOver(true);
            gameOver = true;
            
            GreenfootImage gameOverImage = new GreenfootImage("Game Over", 60, Color.RED, Color.BLACK);
            addObject(new GameOverLabel(gameOverImage), getWidth() / 2, getHeight() / 2);
            
            addObject(new RestartButton(), getWidth() / 2 - 100, getHeight() / 2 + 80);
            addObject(new MenuButton(), getWidth() / 2 + 100, getHeight() / 2 + 80);
        }
    }
    
    // updates the coin label
    // @param coins        the number of coins user has collected
    public void updateCoinLabel(int coins)
    {
        coinLabel.setValue("Coins: " + coins + "/6"); // coins out of 6
    }
}
