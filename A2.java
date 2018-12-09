import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class A2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class A2 extends Mover
{
    private int geld = 50;
    int level;
    String a = "A";
    public A2(int level)
    {
        this.level = level;
    }
    /**
     * Act - do whatever the E wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        for (Actor hero : getObjectsInRange(200, Hero.class))
        {
            if (Greenfoot.mouseClicked(this))
            {
                Hero h = (Hero)hero;
                h.geefPunt(geld);
                h.geefa2(a);
                Greenfoot.playSound("Sonic Ring sound Effect in stereo.mp3");
                getWorld().removeObject(this);
            }
        }
        
        applyVelocity();
    }
}
