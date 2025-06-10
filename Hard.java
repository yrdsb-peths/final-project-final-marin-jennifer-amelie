import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class is extended from its parent class, MainWorld.
 * This class is the hard mode of the game.
 * 
 * The hard mode contains obstacles such as toxin and the user has to jump
 * between logs in order to reach the portal and save the bird.
 */

public class Hard extends MainWorld
{    
    //changable for timer here
    int timer = 3170;
    GreenfootSound bg;// background sound
    
    // label to display the coins
    private Label coinLabel;

    /**
     * Constructor for objects of class Hard.
     * 
     */
    public Hard()
    {    
        // sets the dimesnion
        super(700, 600, 1);
        
        // background 
        setBackground("images/gameBG1.png");
        bg = new GreenfootSound("jungle.mp3");
        
        // adds capybara
        Capybara capybara = new Capybara();
        addObject(capybara, 150, 100);
        
        // switch
        Switch s = new Switch();
        addObject(s, 350, 550);
        
        //adding platforms
        Log floor = new Log("short");
        addObject(floor, 100, 580);
        Log floor1 = new Log("short");
        addObject(floor1, 350, 580);
        Log floor2 = new Log("short");
        addObject(floor2, 515, 580);
        
        Log stump = new Log("stump");
        addObject(stump, 600, 485);
        Log stump1 = new Log("stump");
        addObject(stump1, 650, 325);
        Log stump2 = new Log("stump");
        addObject(stump2, 550, 200);
        
        Log top = new Log("short");
        addObject(top, 350, 150);
        Log top1 = new Log("short");
        addObject(top1, 175, 150);
        
        Log mid = new Log("med");
        addObject(mid, 300, 450);
        Log mid1 = new Log("short");
        addObject(mid1, 50, 500);
        
        Log last = new Log("med");
        addObject(last, 0, 350);
        
        //portal
        Portal portal = new Portal();
        addObject(portal, 300, 225);
        
        //coins
        Coin coin = new Coin();
        addObject(coin, 100, 540);
        
        Coin coin1 = new Coin();
        addObject(coin1, 50, 450);
        
        Coin coin2 = new Coin();
        addObject(coin2, 515, 540);
        
        Coin coin3 = new Coin();
        addObject(coin3, 550, 125);
        
        Coin coin4 = new Coin();
        addObject(coin4, 230, 300);
        
        Coin coin5 = new Coin();
        addObject(coin5, 410, 370);

        //add timer 
        Timer t = new Timer();
        addObject(t, 400, 20);

        // toxin
        Toxin toxin = new Toxin(85, 10);
        addObject(toxin, 262, 155);
        
        Toxin toxin2 = new Toxin(160, 20);
        addObject(toxin2, 225, 590);
        
        Toxin toxin3 = new Toxin(80, 20);
        addObject(toxin3, 430, 590);
        
        Toxin toxin4 = new Toxin(150, 20);
        addObject(toxin4, 633, 590);
        
        Toxin toxin5 = new Toxin(60, 20);
        addObject(toxin5, 25, 590);
        
        
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
            Log temp = new Log("short");
            addObject(temp, 225, 275);
        }
        
        // sets the volume of the music
        bg.setVolume(40);
        
        // plays the music
        bg.play();
        
        //add number on timer
        if(timer / 105 > 0){ // how fast the timer counts down
            if(gameOver) {
                return; // checks if game is over
            }
            timer --; // counts down
        }
        showText(""+timer / 105, 400, 20); // displays the time

        // ensures the timer stops at 0
        if (timer / 105 <= 0.99){ 
            // game is over
            setGameOver(true);
            
            // displays game over
            GreenfootImage gameOverImage = new GreenfootImage("Game Over", 60, Color.RED, Color.BLACK);
            addObject(new GameOverLabel(gameOverImage), getWidth() / 2, getHeight() / 2);
            // displays the reset button
            addObject(new RestartButton(), getWidth() / 2 - 100, getHeight() / 2 + 80);
            // displays the menu button
            addObject(new MenuButton(), getWidth() / 2 + 100, getHeight() / 2 + 80);
        }
    }
    /**
    /* updates the coin label
    /* @param coins the number of coins user has collected
    */
    public void updateCoinLabel(int coins)
    {
        coinLabel.setValue("Coins: " + coins + "/6"); // coins out of 6
    }
}
