import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MenuButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class MenuButton extends Button {
    public MenuButton() {
        super("Menu");
    }

    public void act() {
        super.act();
        if (isClicked()) {
            Greenfoot.setWorld(new Menu()); // Replace MenuWorld with your actual menu world
        }
    }
}

