import greenfoot.*;

/**
 * Write a description of class Selector here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Selector extends Actor
{
    StartMenuOption playMenu;
    StartMenuOption quitMenu;
    
    public Selector(StartMenuOption playMenu, StartMenuOption quitMenu) {
        this.playMenu = playMenu;
        this.quitMenu = quitMenu;
    }
    
    /**
     * Act - do whatever the Selector wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if (Greenfoot.isKeyDown("down")) {
            this.setLocation(314, 496);
            this.playMenu.updateSelection(false);
            this.quitMenu.updateSelection(true);
        }
        
        if (Greenfoot.isKeyDown("up")) {
            this.setLocation(258, 412);
            this.playMenu.updateSelection(true);
            this.quitMenu.updateSelection(false);            
        }
    }    
}
