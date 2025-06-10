import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class displays the introduction of the story.
 */

public class Scene1 extends MainWorld
{
    private Kingbara kingbara; // declares the sprite, kingbara
    private Birdie birdie; // declares the sprite, birdie
    
    // checks if all the dialogues are played
    private Boolean timeYet = false; 
    
    GreenfootSound bg; // background sound
    
    // displays the lines of the story
    Label label1 = new Label("A long time ago, in Solcieleux, a kingdom", 30);
    Label label2 = new Label("characterized by its striking beauty of the sky", 30);
    Label label3 = new Label("and nature, was ruled by two inseparable friends: ", 30);
    Label label4 = new Label("Capybara and Birdie.", 30);
    Label label5 = new Label("Continue \u2192", 30);
    
    // animation timer for the sprites
    SimpleTimer animationTimer = new SimpleTimer();

    
    public Scene1()
    {
        super(680, 520, 1);
        
        // background sound
        bg = new GreenfootSound("jungle.mp3");
        bg.setVolume(50);
        
        // background
        GreenfootImage kingdomBg = new GreenfootImage("images/kingdom.png");
        kingdomBg.scale(680, 520); 
        getBackground().drawImage(kingdomBg, 0, 0);
        
        // Kingbara sprite
        kingbara = new Kingbara();
        addObject(kingbara, 400, 550); 
        
        
        // Birdie sprite
        birdie = new Birdie();
        addObject(birdie, 200, 300);
    }
    
    public void act() {
        // adds the sprites
        kingbara.kingbara();
        birdie.birdie();
        
        // plays the music
        bg.play();
        
        // controls the speed at which the story line displays
        if (animationTimer.millisElapsed() > 500) {  
            addObject(label1, 300, 40);
        }
        if (animationTimer.millisElapsed() > 2000) {  // after 2 seconds
            addObject(label2, 335, 80);
        }
        if (animationTimer.millisElapsed() > 4000) {  
            addObject(label3, 358, 120);
        }
        if (animationTimer.millisElapsed() > 6000) {  
            addObject(label4, 358, 160);
        }
        if (animationTimer.millisElapsed() > 8000) {  
            addObject(label5, 550, 500);
            timeYet = true;
        }
        
        // checks if all the dialogues are played
        if (timeYet) {
            if(Greenfoot.isKeyDown("right")){
            Scene2 world = new Scene2();
            Greenfoot.setWorld(world);
            bg.stop();
            }
        }
    }
}
