import greenfoot.*;

/**
 * Write a description of class Gameworld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gameworld extends World
{

    /**
     * Constructor for objects of class Gameworld.
     * 
     */
    public Gameworld()
    {    
        // Create a new world with 800*600 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        
        //addObject(new Hero(null), 400, 100);
        //addObject(new BaseTerrain(), 413, 566);
        
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        PlayNowMenu playnowmenu = new PlayNowMenu();
        QuitMenu quitmenu = new QuitMenu();
        StartMenu startMenu = new StartMenu(playnowmenu, quitmenu);
        addObject(startMenu, 0, 0);
        addObject(playnowmenu, 418, 415);
        addObject(quitmenu, 408, 495);
        GreenfootImage image = new GreenfootImage("welcomePage.png");
        image.scale(800, 600);
        setBackground(image);
        Selector selector = new Selector(playnowmenu, quitmenu);
        addObject(selector, 258, 412);
    }
}
