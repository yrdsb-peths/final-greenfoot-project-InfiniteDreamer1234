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
    public void act()
    {
        int x = getX();  // Get the current x-coordinate
    int y = getY();  // Get the current y-coordinate
    
    setLocation(x + speed, y);  // Move the object horizontally
    
    
    
    }
    
}
