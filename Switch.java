import greenfoot.*;
/**
 * A game element -- switch.
 * Capybara can turn on the switch to have a log pop out.
 */
public class Switch extends Actor
{
    //set image.
    public Switch(){
        //Rswitch -- off
        GreenfootImage Rswitch = new GreenfootImage("images/switch/Rswitch.png");
        Rswitch.scale(60,60);
        setImage(Rswitch);
    }
    /**
     * When Capybara reaches the switch, Capybara can press 'E' to turn on the switch.
     */
    public void act()
    {
        //Lswitch -- on
        GreenfootImage Lswitch = new GreenfootImage("images/switch/Lswitch.png");
        GreenfootSound click = new GreenfootSound("switch.mp3");
        Lswitch.scale(60,60);
        if(isTouching(Capybara.class)&&Greenfoot.isKeyDown("E")){
            click.play();
            setImage(Lswitch);
            Log.setYes(true);
        }
    }
}
