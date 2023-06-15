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
    
    int speed = 1;
    private int score;
    Label scorelabel;
    private boolean isRemoved = false;
    
    public Speedy(int score) {
        this.score = score; // Assign the passed score value
    }

    public void act() {
        setLocation(getX(), getY() + 3); 
        MyWorld world = (MyWorld) getWorld();
        if (!isAtEdge()) {
        if (score > 25) {
            setLocation(getX(), getY() + 4);
            if(score > 50)
            {
                setLocation(getX(), getY() + 5);
            }
        }
    } else {
        if (!isRemoved) {
            isRemoved = true;
            world.removeObject(this);
            world.increaseScore();
        }
    }

        setRotation(180); 
    }

    public void setSpeed(int spd) {
        speed = spd;
    }
}


