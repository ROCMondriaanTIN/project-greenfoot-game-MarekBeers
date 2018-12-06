import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cross here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cross extends Actor
{
    int pop;
    int lvl;
    public Cross(int pop, int lvl)
    {
        this.pop = pop;
        this.lvl = lvl;
    }
    /**
     * Act - do whatever the Cross wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new LevelSelect(pop));
            if(lvl == 1){
                ((MyWorld)getWorld()).stopped();
            }
            else if (lvl == 2)
            {
                ((Testing)getWorld()).stopped();
            }
            else if (lvl == 3)
            {
                ((Level3)getWorld()).stopped();
            }
            else if(lvl==10)
            {
                ((PopSelect)getWorld()).stopped();
            }
        }
    }    
}
