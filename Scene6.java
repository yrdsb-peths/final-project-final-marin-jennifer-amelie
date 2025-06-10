import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Scene2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Scene6 extends MainWorld
{
    private Boolean timeYet = false;
    
    Label label1 = new Label("1. The green toxins are deadly. Jump \u2191", 30);
    Label label2 = new Label("to avoid touching it.", 30);
    Label label3 = new Label("2. Every 30 seconds, the Ancient Tree", 30);
    Label label4 = new Label("will collapse and reset. You must", 30);
    Label label5 = new Label("escape within the time limit.", 30);
    Label label6 = new Label("3. All of the logs are safe to stand on.", 30);
    Label label7 = new Label("4. Jump to collect the coins.", 30);
    Label label8 = new Label("5. Press <e> to activate all switches.", 30);
    Label label9 = new Label("6. Use stumps to teleport you up.", 30);
    Label label10 = new Label("Good luck on your journey!", 30);
    Label label11 = new Label("Continue \u2192", 30);
    
    SimpleTimer animationTimer = new SimpleTimer();
    
    public Scene6()
    {
        super(680, 520, 1);
        getBackground().setColor(Color.BLACK);
        getBackground().fill();
        GreenfootImage instructionBg = new GreenfootImage("images/instructionsBg.png");
        instructionBg.scale(680, 520); 
        getBackground().drawImage(instructionBg, 0, 0);
    }
    
    public void act() {
        if (animationTimer.millisElapsed() > 500) {  // after 2 seconds
            addObject(label1, 330, 85);
        }
        if (animationTimer.millisElapsed() > 2500) {  // after 2 seconds
            addObject(label2, 240, 125);
        }
        if (animationTimer.millisElapsed() > 4000) {  
            addObject(label3, 330, 165);
        }
        if (animationTimer.millisElapsed() > 6000) {  
            addObject(label4, 330, 205);
        }
        if (animationTimer.millisElapsed() > 8000) {  
           addObject(label5, 295, 245);
        }
        if (animationTimer.millisElapsed() > 10000) {  
           addObject(label6, 320, 285);
        }
        if (animationTimer.millisElapsed() > 12000) {  
           addObject(label7, 255, 325);
        }
        if (animationTimer.millisElapsed() > 14000) {  
           addObject(label8, 315, 365);
        }
        if (animationTimer.millisElapsed() > 16000) {  
           addObject(label9, 290, 405);
        }
        if (animationTimer.millisElapsed() > 18000) {  
            addObject(label10, 330, 435);
            timeYet = true;
        }
        if (animationTimer.millisElapsed() > 18000) {  
            addObject(label11, 550, 500);
        }

        
        if (timeYet) {
            if(Greenfoot.isKeyDown("right")){
            Menu world = new Menu();
            Greenfoot.setWorld(world);
            }
        }
    }
}
