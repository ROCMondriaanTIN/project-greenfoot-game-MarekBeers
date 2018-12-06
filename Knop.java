import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Knop here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Knop extends Mover
{
    /**
     * Act - do whatever the Knop wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        for (Actor hero : getIntersectingObjects(Hero.class))
        {
            if (hero != null)
            {
                Greenfoot.playSound("Sonic Ring sound Effect in stereo.mp3");
                getWorld().removeObject(this);
            }
        }
        applyVelocity();
    }    
}
