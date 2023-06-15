import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Vehicle here.
 * 
 * @ Justin Dong 
 * @ June 2023 
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
        // Vehicle will move towards the right after 1.9 seconds 
        if(timer.millisElapsed() > 1900 )
        {
        
            int x = getX();  
            int y = getY();  
            setLocation(x + speed, y);  
            QuickIntro world = (QuickIntro) getWorld();
            // Once the vehicle reaches the end of the world, it will dissapear 
            if(getX()  >= 599 )
            {
               world.removeObject(this);
            }
    
        }
    
    }
    
}
