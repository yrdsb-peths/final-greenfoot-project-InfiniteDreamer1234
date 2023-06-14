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
    
    GreenfootImage[]idle = new GreenfootImage[18];
    
       
    public int speed;
    SimpleTimer animationTimer = new SimpleTimer();
    public void act()
    {
        int x = getX();  // Get the current x-coordinate
    int y = getY();  // Get the current y-coordinate
    
    setLocation(x + speed, y);  // Move the object horizontally
    
        QuickIntro world = (QuickIntro) getWorld();
        if(getX()  >= 599 )
        {
           world.removeObject(this);
        }
    
    
    animateMan();
    eat();
   
    }
    public Man()
    {
    for(int i = 0; i < idle.length; i++)
        {
            idle[i] = new GreenfootImage("cat_idle/tile" + i + ".png");
            idle[i].mirrorHorizontally();
            idle[i].scale(40,40);
        }
        animationTimer.mark();
        setImage(idle[0]);
    }
    
    int imageIndex = 0;
    public void animateMan()
    
    {
        if(animationTimer.millisElapsed () < 100)
        {
            return;
        }
        animationTimer.mark();
        setImage(idle[imageIndex]);
        imageIndex = (imageIndex + 1) % idle.length;
    }
    
    public void eat()
    {
        QuickIntro world = (QuickIntro) getWorld();
        if(isTouching(Vehicle.class))
        {
            getWorld().removeObject(this);
           
        } 
    } 
}
