import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class displays the bad ending of the story.
 * The bad ending is displayed when the user does not collects all 
 * 6 coins in the level. In the bad ending, capybara fails to 
 * free the bird and the bird is gone forever.
 */

public class Ending2 extends MainWorld
{
    // declares the Kingbara sprite
    private Kingbara kingbara;
    
    // the story lines
    Label label1 = new Label("Because you didn't collect enough of coins", 30);
    Label label2 = new Label("Birdie disappeared... forever...", 30);
    Label label3 = new Label("Birdie!! ", 30);
    Label label4 = new Label("Birdie...", 30);
    Label label5 = new Label("The end", 30);
    GreenfootSound bg; // background music
    
    SimpleTimer animationTimer = new SimpleTimer(); // animation timer
    
    public Ending2()
    {
        // sets the dimension
        super(680, 520, 1);
        
        // background music
        bg = new GreenfootSound("doom.mp3");
        
        // background image
        GreenfootImage mist = new GreenfootImage("images/mist.jpg");
        mist.scale(680, 520); // size
        getBackground().drawImage(mist, 0, 0); // position
        
        kingbara = new Kingbara(); // gets a new kingbara
        addObject(kingbara, 400, 550); // adds it
        
    }
    
    public void act() {
        kingbara.kingbara(); // adds the sprite to the world
        bg.setVolume(50); // voulme
        bg.play(); // play
        
        // controls the speed at which the story line displays
        if (animationTimer.millisElapsed() > 1000) {
            addObject(label1, 300, 40);
        }
        if (animationTimer.millisElapsed() > 4000) {
            addObject(label2, 370, 100);
        }
        if (animationTimer.millisElapsed() > 6000) {  
            addObject(label3, 430, 160);
        }
        if (animationTimer.millisElapsed() > 8000) {  
            addObject(label4, 450, 220);
        }
        if (animationTimer.millisElapsed() > 10000) {  
            addObject(label5, 620, 500);
        }
    }
}
