import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class E here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class E extends Mover
{
    private int geld = 50;
    /**
     * Act - do whatever the E wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        for (Actor hero : getIntersectingObjects(Hero.class))
        {
            if (hero != null)
            {
                Hero h = (Hero)hero;
                h.geefPunt(geld);
                h.geefe("E");
                getWorld().removeObject(this);
                
            }
        }
        applyVelocity();
    }    
}
