import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class displays the good ending of the story.
 * The good ending is displayed when the user collects all 6 coins in the level.
 * In the good ending, capybara manages to free the bird and they reunite
 * in the kingdom.
 */

public class Ending extends MainWorld
{
    // declares the sprite, kingbara
    private Kingbara kingbara;
    
    // declares the sprite, birdie
    private Birdie birdie;
    
    // displays the lines of the story
    Label label1 = new Label("There you are Birdie!", 30);
    Label label2 = new Label("Welcome back!", 30);
    Label label3 = new Label("And this is the story, between", 30);
    Label label4 = new Label("Capybara and Birdie.", 30);
    Label label5 = new Label("The end :)", 30);
    
    // timer that controls the speed of the animation
    SimpleTimer animationTimer = new SimpleTimer();
    
    //the background sound 
    GreenfootSound bg;
    
    // a constructor
    public Ending()
    {
        // sets the dimension
        super(680, 520, 1);
        
        // sets the background
        GreenfootImage kingdomBg = new GreenfootImage("images/kingdom.png");
        kingdomBg.scale(680, 520);  // adjusts the size
        getBackground().drawImage(kingdomBg, 0, 0); // sets the position
        bg = new GreenfootSound("bird.mp3"); // initializes the background sound
        
        // adds the sprite, kingbara
        kingbara = new Kingbara();
        addObject(kingbara, 400, 550); 
        
        // adds the sprite, birdie
        birdie = new Birdie();
        addObject(birdie, 5, 250);
    }
    
    public void act() {
        kingbara.kingbara(); // adds the sprite, kingbara
        birdie.birdie(); // adds the sprite, Birdie
        bg.setVolume(50); // sets the volume
        bg.play(); // plays the background sound
        
        // animates the bird
        if (animationTimer.millisElapsed() < 3000) { 
            birdie.move(1);
        }
        
        // controls the speed at which the story line displays
        if (animationTimer.millisElapsed() > 500) { 
            addObject(label1, 300, 40);
        }
        if (animationTimer.millisElapsed() > 2000) { 
            addObject(label2, 335, 100);
        }
        if (animationTimer.millisElapsed() > 6000) {  
            addObject(label3, 358, 160);
        }
        if (animationTimer.millisElapsed() > 8000) {  
            addObject(label4, 358, 220);
        }
        if (animationTimer.millisElapsed() > 11000) {  
            addObject(label5, 600, 500);
        }
    }
}