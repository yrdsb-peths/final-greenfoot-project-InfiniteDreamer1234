import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Speedy here.
 * 
 * Justin Dong 
 * June 2023 
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
    
    private int score;
    Label scorelabel;
    private boolean isRemoved = false;
    
    
    // Assign the passed score value
    public Speedy(int score) {
        this.score = score; 
    }

    public void act() {
        setLocation(getX(), getY() + 3); 
        MyWorld world = (MyWorld) getWorld();
        
        //Determines speed of the car based on the total score 
        if (!isAtEdge()) 
        {
            if (score > 25) 
            {
            setLocation(getX(), getY() + 4);
            if(score > 50)
            {
                setLocation(getX(), getY() + 5);
            }
        }
    } else {
        // Increases the score when the car leaves the world 
        if (!isRemoved) {
            isRemoved = true;
            world.removeObject(this);
            world.increaseScore();
        }
    }

        setRotation(180); 
    }


}


