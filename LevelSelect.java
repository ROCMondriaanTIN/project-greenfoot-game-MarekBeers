import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LevelSelect here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelSelect extends World
{

    GreenfootSound music = new GreenfootSound("Super Mario Galaxy 2 - Starship Mario Medley.mp3");
    int popie;
    /**
     * Constructor for objects of class LevelSelect.
     * 
     */
    public LevelSelect(int pop)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1); 
        this.popie = pop;
        prepare(pop);
        
    }

    public void act()
    {
        if(!music.isPlaying())
        {
            music.play();
        }
        
        
        if (Greenfoot.isKeyDown("1"))
        {
            Greenfoot.setWorld(new MyWorldVraag(popie, 1));
            music.stop();
        }
        if (Greenfoot.isKeyDown("2"))
        {
            Greenfoot.setWorld(new TestingVraag(popie, 2));
            music.stop();
        }
        if (Greenfoot.isKeyDown("3"))
        {
            Greenfoot.setWorld(new DemoWorld());
        }
    }

    public void stopped()
    {
        music.stop();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare(int kop)
    {
        SelectLevelNummer l1 = new SelectLevelNummer(kop, 1);
        addObject(l1, 200,280);

        SelectLevelNummer l2 = new SelectLevelNummer(kop, 2);
        addObject(l2, 500,280);

        SelectLevelNummer l3 = new SelectLevelNummer(kop, 3);
        addObject(l3, 800,280);

        SelectLevelNummer l4 = new SelectLevelNummer(kop, 4);
        addObject(l4, 200,500);

        SelectLevelNummer l5 = new SelectLevelNummer(kop, 5);
        addObject(l5, 500,500);

        SelectLevelNummer l6 = new SelectLevelNummer(kop, 6);
        addObject(l6, 800,500);
        //Greenfoot.playSound("The Lost Luma - Super Mario Galaxy 2.mp3");
        /* Level1 level1 = new Level1(kop);
        addObject(level1,200,280);
        Level2 level2 = new Level2(kop);
        addObject(level2,500,280);
        Level3 level3 = new Level3(kop);
        addObject(level3,800,280);
        Level4 level4 = new Level4();
        addObject(level4,200,500);
        Level5 level5 = new Level5();
        addObject(level5,500,500);
        Level6 level6 = new Level6();
        addObject(level6,800,500);
         */
        Level_1Pic level_1Pic = new Level_1Pic(kop);
        addObject(level_1Pic,200,380);
        BlueBox blueBox = new BlueBox(kop);
        addObject(blueBox,500,750);
        BlauwHoofdje blauwHoofdje = new BlauwHoofdje(kop);
        addObject(blauwHoofdje,500,750);
        blueBox.setLocation(500,750);
        GroenHoofdje groenHoofdje = new GroenHoofdje(kop);
        addObject(groenHoofdje,450,750);
        RozeHoofdje rozeHoofdje = new RozeHoofdje(kop);
        addObject(rozeHoofdje,550,750);

        Level_2Pic level_2Pic = new Level_2Pic(kop);
        addObject(level_2Pic,500,380);
        Level_3Pic level_3Pic = new Level_3Pic(kop);
        addObject(level_3Pic,800,380);
    }
}
