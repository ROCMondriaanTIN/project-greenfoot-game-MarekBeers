import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cont here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cont extends Actor
{
    int pop;
    int level;
    public Cont(int pop, int level)
    {
        this.pop = pop;
        this.level = level;
    }
    /**
     * Act - do whatever the Cont wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(level == 1)
        {
           if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new MyWorld(pop));
        } 
        }
        else if (level == 2)
        {
            if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new Testing(pop));
        } 
    }
    }    
}
