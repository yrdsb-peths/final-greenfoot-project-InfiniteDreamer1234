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
    
    GreenfootImage[]idle = new GreenfootImage[5];
    public void act()
    {
       
    }
    public Man()
    {
    for(int i = 0; i < idle.length; i++)
        {
            idle[i] = new GreenfootImage("cat_idle/tile00" + i );
            idle[i].scale(100,50);
        }
        
        setImage(idle[0]);
    }
    
    int imageIndex = 0;
    public void animateMan()
    {
        setImage(idle[imageIndex]);
        imageIndex = imageIndex + 1 % idle.length;
    }
}
