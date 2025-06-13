import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class TitleScreen extends World
{
    Label titleLabel = new Label("Capybara and Birdie", 60);

    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1);
        GreenfootImage titleBg = new GreenfootImage("images/titleBg.jpg");
        getBackground().drawImage(titleBg, 275, 200);
        addObject(titleLabel, 285, 200);
        prepare();
    }

    /**
     * The main world act loop
     */
    public void act(){
        if(Greenfoot.isKeyDown("space")){
            Scene1 world = new Scene1();
            Greenfoot.setWorld(world);
        }
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Label label = new Label("Press <space> to Start", 30);
        addObject(label,190,280);
    }
}
