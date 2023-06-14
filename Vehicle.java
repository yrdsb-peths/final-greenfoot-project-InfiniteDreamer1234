import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Vehicle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

 
public class Vehicle extends Actor
{
    /**
     * Act - do whatever the Vehicle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int speed;
    private long lastMark = System.currentTimeMillis();
    private SimpleTimer timer = new SimpleTimer();
    public void act()
    {
        if(timer.millisElapsed() > 1800 )
        {
        
            int x = getX();  // Get the current x-coordinate
            int y = getY();  // Get the current y-coordinate
            setLocation(x + speed, y);  // Move the object horizontally
            QuickIntro world = (QuickIntro) getWorld();
            if(getX()  >= 599 )
            {
               world.removeObject(this);
            }
    
        }
    
    }
    
}
