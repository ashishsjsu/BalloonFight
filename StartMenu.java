import greenfoot.*;
import java.util.*;

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartMenu extends Actor
{
    private StartMenuOption playMenu;
    private StartMenuOption quitMenu;
    private SelectCommand playMenuSelect;
    private SelectCommand quitMenuSelect;
    
    public StartMenu(StartMenuOption playMenu, StartMenuOption quitMenu) {
        this.playMenu = playMenu;
        playMenuSelect = new SelectCommand(playMenu);
                
        this.quitMenu = quitMenu;
        quitMenuSelect = new SelectCommand(quitMenu);              
    }
    
    /**
     * Act - do whatever the Menu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        String keyPressed = Greenfoot.getKey();
        if (keyPressed != null) {
            if (Greenfoot.isKeyDown("enter") && playMenu.getSelection()) {    
                playMenuSelect.execute();
            }
            
            if (Greenfoot.isKeyDown("enter") && quitMenu.getSelection()) {
                quitMenuSelect.execute();
            } 
        }
    }    
}
