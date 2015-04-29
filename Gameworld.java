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
        
        HeroFactory heroFactory = new HeroFactory();
        addObject(heroFactory.getCharacter(CharacterCreator.CharacterType.Player1),400,100);
        
        EnemyFactory enemyFactory = new EnemyFactory();
        addObject(enemyFactory.getCharacter(CharacterCreator.CharacterType.Enemy1), 75, 58);
        
        CharacterController characterController = CharacterController.getInstance();
        addObject(characterController,0,0);
        
        /*
        Hero hero = new Hero();
        hero.setFloatBehaviour(new Descend());
        addObject(hero, 400, 100);
        */
        addObject(new BaseTerrain(), 413, 566);
        addObject(new SmallStage(), 625, 271);
        addObject(new SmallStage(), 234, 262);
   
    }
}
