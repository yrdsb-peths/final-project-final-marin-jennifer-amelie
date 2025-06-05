import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Scene2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Scene2 extends MainWorld
{
    private Chillingbara chillingbara;
    private Birdie birdie;
    private Boolean timeYet = false;
    
    Label label1 = new Label("One day, when Capybara and Birdie are hanging", 30);
    Label label2 = new Label("out in the royal garden,", 30);
    Label label3 = new Label("a streak of lightning suddenly flashes by...", 30);
    Label label4 = new Label("Continue \u2192", 30);
    
    SimpleTimer animationTimer = new SimpleTimer();
    
    GreenfootSound th;
    public Scene2()
    {
        super(680, 520, 1);
        bg = new GreenfootSound("campfire.mp3");
        th = new GreenfootSound("thunder.mp3");
        bg.setVolume(50);
        GreenfootImage gardenBg = new GreenfootImage("images/garden.png");
        gardenBg.scale(680, 520); 
        getBackground().drawImage(gardenBg, 0, 0);
        
        chillingbara = new Chillingbara();
        addObject(chillingbara, 400, 300); 
        
        birdie = new Birdie();
        addObject(birdie, 260, 280);
    }
    
    public void act() {
        chillingbara.chillingbara();
        birdie.birdie();
        bg.play();
        if (animationTimer.millisElapsed() > 500) {  // after 2 seconds
            addObject(label1, 330, 40);
        }
        if (animationTimer.millisElapsed() > 2000) {  // after 2 seconds
            addObject(label2, 170, 80);
        }
        if (animationTimer.millisElapsed() > 4000) {  
            addObject(label3, 290, 120);
            th.play();
        }
        if (animationTimer.millisElapsed() > 6000) {  
            addObject(label4, 550, 500);
            timeYet = true;
        }
        
        if (timeYet) {
            if(Greenfoot.isKeyDown("right")){
            Scene3 world = new Scene3();
            Greenfoot.setWorld(world);
            bg.stop();
            }
        }
    }
}
