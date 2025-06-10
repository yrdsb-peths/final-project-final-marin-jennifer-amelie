import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class displays the scene 2 of the story.
 */

public class Scene2 extends MainWorld
{
    // declares the sprites
    private Chillingbara chillingbara;
    private Birdie birdie;
    
    // checks if all the dialogues are played
    private Boolean timeYet = false;
    
    // background sound
    GreenfootSound bg;
    
    // story lines
    Label label1 = new Label("One day, when Capybara and Birdie are hanging", 30);
    Label label2 = new Label("out in the royal garden,", 30);
    Label label3 = new Label("a streak of lightning suddenly flashes by...", 30);
    Label label4 = new Label("Continue \u2192", 30);
    
    // animation timer
    SimpleTimer animationTimer = new SimpleTimer();
    
    
    public Scene2()
    {
        super(680, 520, 1);
        
        // background music
        bg = new GreenfootSound("campfire.mp3");
        bg.setVolume(50);
        
        // backgrou d
        GreenfootImage gardenBg = new GreenfootImage("images/garden.png");
        gardenBg.scale(680, 520); 
        getBackground().drawImage(gardenBg, 0, 0);
        
        // sets location of the sprites
        chillingbara = new Chillingbara();
        addObject(chillingbara, 400, 300); 
        
        birdie = new Birdie();
        addObject(birdie, 260, 280);
    }
    
    public void act() {
        // adds the sprites
        chillingbara.chillingbara();
        birdie.birdie();
        
        // plays the background music
        bg.play();
        
        // controls the speed at which the story line displays
        if (animationTimer.millisElapsed() > 500) {  // after 2 seconds
            addObject(label1, 330, 40);
        }
        if (animationTimer.millisElapsed() > 2000) {  // after 2 seconds
            addObject(label2, 170, 80);
        }
        if (animationTimer.millisElapsed() > 4000) {  
            addObject(label3, 290, 120);
        }
        if (animationTimer.millisElapsed() > 6000) {  
            addObject(label4, 550, 500);
            timeYet = true;
        }
        
        // checks if all the dialogues are played
        if (timeYet) {
            if(Greenfoot.isKeyDown("right")){
            Scene3 world = new Scene3();
            Greenfoot.setWorld(world);
            bg.stop();
            }
        }
    }
}
