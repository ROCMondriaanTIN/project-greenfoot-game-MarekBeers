import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BlauwHoofdje here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BlauwHoofdje extends Actor
{
    int pop;
    public BlauwHoofdje(int pop)
    {
        this.pop = pop;
    }
    /**
     * Act - do whatever the BlauwHoofdje wants to do. This method is called whenever
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
