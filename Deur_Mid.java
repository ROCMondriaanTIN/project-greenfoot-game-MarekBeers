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
    int lvl;
    public Deur_Mid(int pop, int lvl)
    {
        this.pop = pop;
        this.lvl = lvl;
    }
    /**
     * Act - do whatever the Deur_Mid wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(lvl == 1){
            if (getOneIntersectingObject(Hero.class)!=null && getWorld().getObjects(K.class).isEmpty() && getWorld().getObjects(O.class).isEmpty() && getWorld().getObjects(E.class).isEmpty())
            {
                Greenfoot.setWorld(new LevelCleared(pop));
                ((MyWorld)getWorld()).stopped();
            }   
       }
       else if (lvl == 2)
       {
           if (getOneIntersectingObject(Hero.class)!=null && getWorld().getObjects(K.class).isEmpty() && getWorld().getObjects(A.class).isEmpty() && getWorld().getObjects(A2.class).isEmpty() && getWorld().getObjects(S.class).isEmpty())
           {
               Greenfoot.setWorld(new LevelCleared(pop));
               ((Testing)getWorld()).stopped();
           }
       }
       else if (lvl == 3)
       {
           if (getOneIntersectingObject(Hero.class)!=null && getWorld().getObjects(Knop.class).isEmpty() && getWorld().getObjects(R.class).isEmpty() && getWorld().getObjects(E.class).isEmpty() && getWorld().getObjects(G.class).isEmpty() && getWorld().getObjects(E2.class).isEmpty() && getWorld().getObjects(N.class).isEmpty())
           {
               Greenfoot.setWorld(new LevelCleared(pop));
               ((Level3)getWorld()).stopped();
           }
       }
       else if (lvl == 4)
       {
           if (getOneIntersectingObject(Hero.class)!=null && getWorld().getObjects(D.class).isEmpty() && getWorld().getObjects(R.class).isEmpty() && getWorld().getObjects(E.class).isEmpty() && getWorld().getObjects(U.class).isEmpty())
           {
               Greenfoot.setWorld(new LevelCleared(pop));
               ((Level4)getWorld()).stopped();
           }
       }
       else if (lvl == 5)
       {
           if (getOneIntersectingObject(Hero.class)!=null && getWorld().getObjects(L.class).isEmpty() && getWorld().getObjects(E.class).isEmpty() && getWorld().getObjects(T.class).isEmpty() && getWorld().getObjects(T2.class).isEmpty() && getWorld().getObjects(E2.class).isEmpty() && getWorld().getObjects(R.class).isEmpty())
           {
               Greenfoot.setWorld(new LevelCleared(pop));
               ((Level5)getWorld()).stopped();
           }
       }
       else if (lvl == 6)
       {
           if (getOneIntersectingObject(Hero.class)!=null && getWorld().getObjects(D.class).isEmpty() && getWorld().getObjects(R.class).isEmpty() && getWorld().getObjects(O.class).isEmpty() && getWorld().getObjects(N.class).isEmpty() && getWorld().getObjects(E.class).isEmpty())
           {
               Greenfoot.setWorld(new LevelCleared(pop));
               ((Level6)getWorld()).stopped();
           }
       }
            else{}
        
        applyVelocity();
    }    
}
