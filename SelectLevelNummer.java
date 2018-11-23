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
            switch(this.level){
            case 1: Greenfoot.setWorld(new MyWorldVraag(pop, this.level));break;
            case 2: Greenfoot.setWorld(new Testing(pop));break;
            case 3: break;
            case 4: break;
            case 5: break;
            case 6: break;
        }
          
        }
    }    
}
