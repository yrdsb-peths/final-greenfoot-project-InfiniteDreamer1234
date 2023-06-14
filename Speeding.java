import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Speeding here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Speeding extends Actor
{
    /**
     * Act - do whatever the Speeding wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   
    
    
    public void act() 
    {

        
        if(Greenfoot.isKeyDown("1"))
        {
            move1();
            
        }
        if(Greenfoot.isKeyDown("2"))
        {
            move2();
        }
        if (Greenfoot.isKeyDown("3"))
        {
            move3();
        }
        if (Greenfoot.isKeyDown("4"))
        {
            move4();
        }
        
      
        
    }
 
    public void move1()
    {
        setLocation(125,350);
    }
 
    public void move2()
    {
        setLocation(250,350); 
    }
 
    public void move3()
    {
        setLocation(375,350);
    }
 
    public void move4()
    {
        setLocation(500,350);
    }
}
