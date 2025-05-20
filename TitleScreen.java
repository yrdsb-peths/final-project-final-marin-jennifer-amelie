import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class TitleScreen extends World
{
    Label titleLabel = new Label("Capybara and Bird", 60);

    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        GreenfootImage titleBg = new GreenfootImage("images/titleBg.jpg");
        getBackground().drawImage(titleBg, 275, 100);
        addObject(titleLabel, 275, 100);
        prepare();
    }

    /**
     * The main world act loop
     */
    public void act(){
        if(Greenfoot.isKeyDown("space")){
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Label label = new Label("Press <space> to Start", 20);
        addObject(label,91,191);
        label.setLocation(138,177);
        
        Label label2 = new Label("Use \u21D0 and \u21D2 to Move", 20);
        addObject(label2,56,222);
        label2.setLocation(134,214);
    }
}
