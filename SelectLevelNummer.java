import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SelectLevelNummer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SelectLevelNummer extends Actor
{
    int pop;
    int level;
    public SelectLevelNummer(int pop, int lvl)
    {
        this.pop = pop;
        this.level = lvl;
        switch(this.level){
            case 1: setImage("hud_1.png");break;
            case 2: setImage("hud_2.png");break;
            case 3: setImage("hud_3.png");break;
            case 4: setImage("hud_4.png");break;
            case 5: setImage("hud_5.png");break;
            case 6: setImage("hud_6.png");break;
        }
    }
    public void act() 
    {
        if (Greenfoot.mouseClicked(this))
        {
            ((LevelSelect)getWorld()).stopped();
            switch(this.level){
            case 1: Greenfoot.setWorld(new MyWorldVraag(pop, this.level));break;
            case 2: Greenfoot.setWorld(new TestingVraag(pop, level));break;
            case 3: Greenfoot.setWorld(new Level3Vraag(pop));break;
            case 4: Greenfoot.setWorld(new Level4Vraag(pop));break;
            case 5: Greenfoot.setWorld(new Level5Vraag(pop));break;
            case 6: Greenfoot.setWorld(new Level6Vraag(pop));break;
        }
          
        }
    }    
}
