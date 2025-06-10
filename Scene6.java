import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class displays the scene 6 of the story.
 */

public class Scene6 extends MainWorld
{
    // checks if all the dialogues are played
    private Boolean timeYet = false;
    
    
    // story lines
    Label label1 = new Label("1. The green toxins are deadly. Jump \u2191", 30);
    Label label2 = new Label("to avoid touching it.", 30);
    Label label3 = new Label("2. Every few seconds, the Ancient Tree", 30);
    Label label4 = new Label("will collapse and reset. You must", 30);
    Label label5 = new Label("escape within the time limit.", 30);
    Label label6 = new Label("3. All of the logs are safe to stand on.", 30);
    Label label7 = new Label("4. Jump to collect the coins.", 30);
    Label label8 = new Label("5. Press <e> to activate all switches.", 30);
    Label label9 = new Label("Good luck on your journey!", 30);
    Label label10 = new Label("Continue \u2192", 30);
    
    
    // animation timer
    SimpleTimer animationTimer = new SimpleTimer();
    
    public Scene6()
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
            addObject(label2, 240, 130);
        }
        if (animationTimer.millisElapsed() > 4000) {  
            addObject(label3, 330, 170);
        }
        if (animationTimer.millisElapsed() > 6000) {  
            addObject(label4, 330, 210);
        }
        if (animationTimer.millisElapsed() > 8000) {  
           addObject(label5, 295, 250);
        }
        if (animationTimer.millisElapsed() > 10000) {  
           addObject(label6, 320, 290);
        }
        if (animationTimer.millisElapsed() > 12000) {  
           addObject(label7, 255, 330);
        }
        if (animationTimer.millisElapsed() > 14000) {  
           addObject(label8, 315, 370);
        }
        if (animationTimer.millisElapsed() > 16000) {  
           addObject(label9, 330, 410);
        }
        if (animationTimer.millisElapsed() > 18000) {  
            addObject(label10, 550, 500);
            timeYet = true;
        }
        // checks if all the dialogues are played
        if (timeYet) {
            if(Greenfoot.isKeyDown("right")){
            Menu world = new Menu();
            Greenfoot.setWorld(world);
            }
        }
    }
}
