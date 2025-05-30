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
        super(600, 600, 1);
        GreenfootImage titleBg = new GreenfootImage("images/titleBg.jpg");
        getBackground().drawImage(titleBg, 275, 150);
        addObject(titleLabel, 275, 200);
        prepare();
    }

    /**
     * The main world act loop
     */
    public void act(){
        if(Greenfoot.isKeyDown("space")){
            MainWorld world = new MainWorld();
            Greenfoot.setWorld(world);
        }
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Label label = new Label("Press <space> to Start", 20);
        addObject(label,91,325);
        label.setLocation(138,300);
        
        Label label2 = new Label("Use \u21D0 and \u21D2 to Move", 20);
        addObject(label2,56,400);
        label2.setLocation(134,375);
    }
}
