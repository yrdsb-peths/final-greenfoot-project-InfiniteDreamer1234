import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Man here.
 * 
 * Justin Dong
 * June 2023 
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
    // This will move the man to the right
    // Once the X value is 599,
    // it will be removed from the world 
    int x = getX();  
    int y = getY();  
    setLocation(x + speed, y);  
    QuickIntro world = (QuickIntro) getWorld();
        if(getX()  >= 599 )
        {
           world.removeObject(this);
        }
    
    animateMan();
    hit();
   
}
    
public Man()
    {
        // This array animates the man 
        for(int i = 0; i < idle.length; i++)
        {
            idle[i] = new GreenfootImage("Running/tile" + i + ".png");
            idle[i].mirrorHorizontally();
            idle[i].scale(45,45);
        }
        animationTimer.mark();
        setImage(idle[0]);
    }
    
    int imageIndex = 0;
    public void animateMan()
    {
        // This method will determine how fast it will go through the images. 
        if(animationTimer.millisElapsed () < 100)
        {
            return;
        }
        animationTimer.mark();
        setImage(idle[imageIndex]);
        imageIndex = (imageIndex + 1) % idle.length;
    }
    
    public void hit()
    {
        // Removes the man once it touches the car 
        QuickIntro world = (QuickIntro) getWorld();
        if(isTouching(Vehicle.class))
        {
            getWorld().removeObject(this);
           
        } 
    } 
}
