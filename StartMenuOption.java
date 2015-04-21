import greenfoot.*;

/**
 * this is receiver class for command pattern
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class StartMenuOption extends Actor
{
    /**
     * Act - do whatever the StartMenuOption wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        System.out.println("StartMenuOption");
    }    
    
    public abstract void select() ;
    
    public abstract void updateSelection(boolean selection) ;
    
    public abstract boolean getSelection() ;
}
