import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class displays the scene 5 of the story.
 */

public class Scene5 extends MainWorld
{
    // checks if all the dialogues are played
    private Boolean timeYet = false;
    
    
    // story lines
    Label label1 = new Label("You have been invited to assist King", 30);
    Label label2 = new Label("Capybara on his journey. This journey is", 30);
    Label label3 = new Label("perilous, so here are some tips to help", 30);
    Label label4 = new Label("you navigate through the corrosive Ancient", 30);
    Label label5 = new Label("Tree and retrieve all the coins.", 30);
    Label label6 = new Label("Continue \u2192", 30);
    
    
    // animation timer
    SimpleTimer animationTimer = new SimpleTimer();
    
    public Scene5()
    {
        super(680, 520, 1);
        
        // background 
        getBackground().setColor(Color.BLACK);
        getBackground().fill();
        GreenfootImage instructionBg = new GreenfootImage("images/instructionsBg.png");
        instructionBg.scale(680, 520); 
        getBackground().drawImage(instructionBg, 0, 0);
        
    }
    
    public void act() {
        // controls the speed at which the story line displays
        if (animationTimer.millisElapsed() > 500) { 
            addObject(label1, 330, 90);
        }
        if (animationTimer.millisElapsed() > 2500) {  // after 2 seconds
            addObject(label2, 330, 130);
        }
        if (animationTimer.millisElapsed() > 4000) {  
            addObject(label3, 330, 170);
        }
        if (animationTimer.millisElapsed() > 6000) {  
            addObject(label4, 330, 210);
        }
         if (animationTimer.millisElapsed() > 8000) {  
           addObject(label5, 255, 250);
        }
        if (animationTimer.millisElapsed() > 10000) {  
            addObject(label6, 550, 500);
            timeYet = true;
        }
        // checks if all the dialogues are played
        if (timeYet) {
            if(Greenfoot.isKeyDown("right")){
            Scene6 world = new Scene6();
            Greenfoot.setWorld(world);
            }
        }
    }
}
