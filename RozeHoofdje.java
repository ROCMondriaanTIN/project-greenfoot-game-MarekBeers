import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RozeHoofdje here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RozeHoofdje extends Actor
{
    int pop;
    public RozeHoofdje(int pop)
    {
        this.pop = pop;
    }
    
    /**
     * Act - do whatever the RozeHoofdje wants to do. This method is called whenever
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
