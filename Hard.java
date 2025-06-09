import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Hard extends MainWorld
{
    //changable for timer here
    int timer = 2050;
    /**
     * Constructor for objects of class Hard.
     * 
     */
    public Hard()
    {    
        super(700, 600, 1);
        
        setBackground("images/gameBG1.png");
        Capybara capybara = new Capybara();
        addObject(capybara, 150, 100);
        Switch s = new Switch();
        addObject(s, 350, 550);
        //adding platforms
        Log floor = new Log("short");
        addObject(floor, 100, 580);
        Log floor1 = new Log("short");
        addObject(floor1, 350, 580);
        Log floor2 = new Log("short");
        addObject(floor2, 515, 580);
        
        Log stump = new Log("stump");
        addObject(stump, 600, 485);
        Log stump1 = new Log("stump");
        addObject(stump1, 650, 325);
        Log stump2 = new Log("stump");
        addObject(stump2, 550, 200);
        
        Log top = new Log("short");
        addObject(top, 350, 150);
        Log top1 = new Log("short");
        addObject(top1, 175, 150);
        
        Log mid = new Log("med");
        addObject(mid, 300, 450);
        Log mid1 = new Log("short");
        addObject(mid1, 50, 500);
        
        Log last = new Log("med");
        addObject(last, 0, 350);
        
        //portal
        Portal portal = new Portal();
        addObject(portal, 250, 225);
        
        // toxin
        Toxin toxin = new Toxin(80, 15);
        addObject(toxin, 263, 150);
        
        Toxin toxin2 = new Toxin(155, 15);
        addObject(toxin2, 225, 580);
        
        Toxin toxin3 = new Toxin(80, 15);
        addObject(toxin3, 430, 580);
        
        //add timer 
        Timer t = new Timer();
        addObject(t, 397, 20);
    }
    public void act(){
        if(Log.getYes()){
            Log temp = new Log("short");
            addObject(temp, 250, 275);
        }
        
        //add number on timer
        if(timer / 105 > 0){
            if(gameOver) {
                return;
            }
            timer --;
        }
        showText(""+timer / 105, 397, 20);

        if (timer / 105 <= 0.99){
            setGameOver(true);
            gameOver = true;
           
            GreenfootImage gameOverImage = new GreenfootImage("Game Over", 60, Color.RED, Color.BLACK);
            addObject(new GameOverLabel(gameOverImage), getWidth() / 2, getHeight() / 2);
            
            addObject(new RestartButton(), getWidth() / 2 - 100, getHeight() / 2 + 80);
            addObject(new MenuButton(), getWidth() / 2 + 100, getHeight() / 2 + 80);
        }
    }
}
