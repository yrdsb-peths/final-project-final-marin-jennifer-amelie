import greenfoot.*;
/**
 * This class is extended from its parent class, MainWorld.
 * This class is the easy mode of the game.
 * 
 * The easy mode contains obstacles such as toxin and the user has to jump
 * between logs in order to reach the portal and save the bird.
 */

public class Easy extends MainWorld {
    
    //changable for timer here
    int timer = 1550; //1550
    
    // label to display the coins
    private Label coinLabel;

    // background sound
    GreenfootSound bg;
    
    // a constructor
    public Easy() {
        // sets the dimension of the world
        super(680, 520, 1);
        
        // sets the background
        setBackground("images/gameBG.png");
        
        // sets the music
        bg = new GreenfootSound("jungle.mp3");
        
        // initialize the character, capybara
        Capybara capybara = new Capybara();
        // adds capybara
        addObject(capybara, 60, 480);
        
        //adding platforms (the logs)
        Log floor1 = new Log("med");
        addObject(floor1, 150, 515);
        Log floor2 = new Log("short");
        addObject(floor2, 420, 515);
        Log floor3 = new Log("short");
        addObject(floor3, 570, 515);
        Log floor4 = new Log("stump");
        addObject(floor4, 640, 500);
        
        Log first = new Log("short");
        addObject(first, 550, 400);
        Log first1 = new Log("short");
        addObject(first1, 375, 400);
        Log first2 = new Log("med");
        addObject(first2, 150, 370);
        
        Log snd = new Log("med");
        addObject(snd, 450, 290);
        
        Log ths = new Log("short");
        addObject(ths, 200, 220);
        Log ths1 = new Log("stump");
        addObject(ths1, 50, 175);
        
        Log last1 = new Log("med");
        addObject(last1, 375, 120);
        Log last2 = new Log("short");
        addObject(last2, 150, 125);
        
        //portal
        Portal portal = new Portal();
        addObject(portal, 450, 80);
        
        //toxin
        Toxin to = new Toxin(90, 15);
        addObject(to, 330, 510);
        Toxin to1 = new Toxin(60, 15);
        addObject(to1, 495, 510);
        
        //add timer 
        Timer t = new Timer();
        addObject(t, 342, 20);

        //add coins to the world
        Coin coin = new Coin();
        addObject(coin, 330, 440);

        Coin coin1 = new Coin();
        addObject(coin1, 490, 440);
        
        Coin coin2 = new Coin();
        addObject(coin2, 410, 220);
        
        Coin coin3 = new Coin();
        addObject(coin3, 50, 60);
        
        Coin coin4 = new Coin();
        addObject(coin4, 300, 60);
        
        Coin coin5 = new Coin();
        addObject(coin5, 50, 300);
        
        //add the bird
        Bird bird = new Bird();
        addObject(bird, 585, 120);
        
        // add the label to display the coins score
        coinLabel = new Label("Coins: 0/6", 30);
        addObject(coinLabel, 80, 20); 
    }
    // the act method
    public void act(){
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
        showText(""+timer / 105, 342, 20); // displays the time

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
