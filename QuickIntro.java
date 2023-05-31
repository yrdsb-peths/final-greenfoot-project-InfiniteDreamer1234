import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class QuickIntro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class QuickIntro extends World
{

    /**
     * Constructor for objects of class QuickIntro.
     * 
     */
    public QuickIntro()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        
          
    }
    public void press()
    {
    if(Greenfoot.isKeyDown("Shift"))
        {
            
            System.out.println("Welcome to rush hour!");
        }
    }
    
    public void act()
    {
    if(Greenfoot.isKeyDown("Enter"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    
}
