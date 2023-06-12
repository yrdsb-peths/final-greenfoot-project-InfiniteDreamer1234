import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Speedy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

    /**
     * Act - do whatever the Speedy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public class Speedy extends Actor
{
    /**
     * Act - do whatever the Speedy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int speed = 2;
    
    public void act()
    {
       
        setLocation(getX(), getY() +1);
        MyWorld world = (MyWorld) getWorld();
        if(getY()  >= 350 )
        {
           
            world.removeObject(this);
            world.increaseScore();
            
           
            
             
        }
        
        setRotation(180); 
    }
    
     public void setSpeed(int spd)
    {
        speed = spd;
    }
}


