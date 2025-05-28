import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Button extends Actor
{
    private GreenfootImage defaultImage;
    private GreenfootImage hoverImage;

    public Button(String text) {
        defaultImage = new GreenfootImage(text, 24, Color.WHITE, Color.BLACK);
        hoverImage = new GreenfootImage(text, 24, Color.YELLOW, Color.BLACK);
        setImage(defaultImage);
    }

    public void act() {
        if (Greenfoot.mouseMoved(this)) {
            setImage(hoverImage);
        } else if (Greenfoot.mouseMoved(null)) {
            setImage(defaultImage);
        }
    }

    public boolean isClicked() {
        return Greenfoot.mouseClicked(this);
    }
}


