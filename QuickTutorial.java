import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class QuickTutorial here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class QuickTutorial extends World
{
    private long lastMark = System.currentTimeMillis();
    private SimpleTimer timer = new SimpleTimer();
    /**
     * Constructor for objects of class QuickTutorial.
     * 
     */
    public QuickTutorial()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        
        Speeding speeding = new Speeding();
        addObject(speeding,350,350);
        
        
        
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("Enter"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
        
        
        if (timer.millisElapsed() > 900 )
        {
            Label welcomeLabel = new Label("Welcome to the tutorial!" , 35);
            addObject(welcomeLabel, 300, 100);
        }
        
        if (timer.millisElapsed() > 1800 )
        {
            Label teachLabel = new Label("In order to move," , 35);
            addObject(teachLabel, 300, 175);
        }
        
        if (timer.millisElapsed() > 2700 )
        {
            Label pressLabel = new Label("Please press 1, 2, 3, or 4" , 35);
            addObject(pressLabel, 300, 250);
        }
        
        if (timer.millisElapsed() > 4500 )
        {
            
            removeObjects(getObjects(Label.class));
            
            Label goodLabel = new Label("Very good! Very good!" , 35);
            addObject(goodLabel, 325,100);
            
            Label goalLabel = new Label("Your main goal in this game", 35);
            addObject(goalLabel, 300, 175);
            
            Label dodgeLabel = new Label("will be to dodge oncoming traffic",35);
            addObject(dodgeLabel, 300, 250);
            
            
        }
        
        if (timer.millisElapsed() > 5500 )
        {
            
            removeObjects(getObjects(Label.class));
            
            Label eachLabel = new Label("Each car you dodge will give you 1 point" , 35);
            addObject(eachLabel, 300,100);
            
            Label luckLabel = new Label("Good luck with making it to work on time!" , 35);
            addObject(luckLabel, 300, 175);
            
            Label startLabel = new Label("Press Enter to start the game", 35);
            addObject(startLabel, 300, 250);
            
           
            
            
        }
            
            
        }
}
    
    

