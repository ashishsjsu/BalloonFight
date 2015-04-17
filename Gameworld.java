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
        addObject(new Hero(null), 400, 100);
        addObject(new BaseTerrain(), 413, 566);
    }
}
