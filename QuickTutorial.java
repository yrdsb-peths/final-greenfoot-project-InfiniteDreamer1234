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
        
        
        
        
        
    }
    
    public void act()
    {
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
    }
    
}
