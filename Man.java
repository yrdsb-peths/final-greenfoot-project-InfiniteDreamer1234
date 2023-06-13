import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Man here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Man extends Actor
{
    /**
     * Act - do whatever the Man wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    GreenfootImage[]idle = new GreenfootImage[4];
    public void act()
    {
         for(int i = 0; i < idle.length; i++)
        {
            idle[i] = new GreenfootImage("images/running/idle00" + i);
        }
        
        setImage(idle[0]);
    }
}
