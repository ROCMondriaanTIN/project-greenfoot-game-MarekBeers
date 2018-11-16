import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level_1Pic here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level_1Pic extends Actor
{
    /**
     * Act - do whatever the Level_1Pic wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new MyWorld());
        }
    }    
}
