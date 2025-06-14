import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Log here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Log extends Actor
{
    String size;
    //var for logs that only appear after flicking switch
    public static boolean yes = false;
    public Log(String type){
        if(type.equals("long")){
            GreenfootImage log = new GreenfootImage("treetrunks/long.png");
            log.scale(680, 30);
            setImage(log);
        }
        if(type.equals("med")){
            GreenfootImage log = new GreenfootImage("treetrunks/medium.png");
            log.scale(300, 30);
            setImage(log);
        }
        if(type.equals("short")){
            GreenfootImage log = new GreenfootImage("treetrunks/short.png");
            log.scale(100, 30);
            setImage(log);
        }
        if(type.equals("stump")){
            GreenfootImage log = new GreenfootImage("treetrunks/stump.png");
            log.scale(100, 100);
            setImage(log); 
        }
    }
    public static boolean getYes(){
        return yes;
    }
    public static void setYes(boolean on){
        yes = on;
    }
}
