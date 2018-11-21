import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Deur_Mid here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Deur_Mid extends Mover
{
    int pop;
    public Deur_Mid(int pop)
    {
        this.pop = pop;
    }
    /**
     * Act - do whatever the Deur_Mid wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (getOneIntersectingObject(Hero.class)!=null && getWorld().getObjects(K.class).isEmpty() && getWorld().getObjects(O.class).isEmpty() && getWorld().getObjects(E.class).isEmpty())
        {
            Greenfoot.setWorld(new LevelSelect(pop));
        }
        applyVelocity();
    }    
}
