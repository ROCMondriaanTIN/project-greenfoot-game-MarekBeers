import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BlueBox here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BlueBox extends Actor
{
    int pop;
    public BlueBox(int pop)
    {
        this.pop = pop;
    }
    /**
     * Act - do whatever the BlueBox wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new PopSelect(pop));
            ((LevelSelect)getWorld()).stopped();
        }
    }    
}
