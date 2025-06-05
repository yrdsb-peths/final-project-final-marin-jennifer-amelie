import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Restart here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class RestartButton extends Button {
    public RestartButton() {
        super("Restart");
    }

    public void act() {
        super.act();
        World current = getWorld();
        if (isClicked()) {
            if (current instanceof Easy) {
                Greenfoot.setWorld(new Easy());
            } else if (current instanceof Medium) {
                Greenfoot.setWorld(new Medium());
            } else if (current instanceof Hard) {
                Greenfoot.setWorld(new Hard());
            }
            Log.setYes(false);
        }
    }
}

