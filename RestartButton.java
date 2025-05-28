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
        if (isClicked()) {
            Greenfoot.setWorld(new MyWorld());
        }
    }
}

