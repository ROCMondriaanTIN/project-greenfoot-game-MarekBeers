import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Munt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Munt extends Mover
{
    private int geld = 5;

    public void act() 
    {
        
        for (Actor hero : getIntersectingObjects(Hero.class))
        {
            if (hero != null)
            {
                Hero h = (Hero)hero;
                h.geefPunt(geld);
                Greenfoot.playSound("Super Mario Bros.-Coin Sound Effect.mp3");
                getWorld().removeObject(this);
                
            }
        }
        applyVelocity();
    }
    

    
}
