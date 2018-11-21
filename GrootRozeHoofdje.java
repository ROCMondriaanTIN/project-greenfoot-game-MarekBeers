import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GrootRozeHoofdje here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GrootRozeHoofdje extends Actor
{
    public int pop = 3;
    int level;
    public GrootRozeHoofdje(int level)
    {
        this.level = level;
    }
    /**
     * Act - do whatever the GrootBlauwHoofdje wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
            
        if (Greenfoot.mouseClicked(this))
        {
            pop = 3;
            MyWorld myworld = new MyWorld(pop);
            LevelSelect levelselect = new LevelSelect(pop);
            StartButtons startbuttons  = new StartButtons(pop);
            PopSelect popselct = new PopSelect(pop);
            //StartScherm start = new StartScherm(pop);
            LDG ldg = new LDG(pop);
            Testing test = new Testing(pop);
            BlauwHoofdje hofbl = new BlauwHoofdje(pop);
            GroenHoofdje hofgr = new GroenHoofdje(pop);
            RozeHoofdje hofro = new RozeHoofdje(pop);
            Cross cross = new Cross(pop);
            Restart restart = new Restart(level, pop);
            BlueBox blue = new BlueBox(pop);
            Level2 lv2 = new Level2(pop);
            Level3 lv3 = new Level3(pop);
            Level1 lv1 = new Level1(pop);
            Level_1Pic pic1 = new Level_1Pic(pop);
            Greenfoot.setWorld(new LevelSelect(pop));
        }
    }   
}
