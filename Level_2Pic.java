import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level_2Pic here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level_2Pic extends Actor
{
    int pop;
    public Level_2Pic(int pop)
    {
        this.pop = pop;
        
        
    }
    /**
     * Act - do whatever the Level_2Pic wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new TestingVraag(pop, 2));
            ((LevelSelect)getWorld()).stopped();
        }
    }    
}
