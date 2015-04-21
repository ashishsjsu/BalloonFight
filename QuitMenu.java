import greenfoot.*;
import java.util.*;

/**
 * Write a description of class QuitMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class QuitMenu extends StartMenuOption
{
    private GreenfootImage hoverImage;
    private GreenfootImage normalImage;    
    boolean isSelected;

    public QuitMenu () {
        hoverImage = new GreenfootImage("btn-quit-hover.png");
        normalImage = new GreenfootImage("btn-quit.png");
        isSelected = false;
    }
    
    /**
     * Act - do whatever the QuitMenu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if (isSelected) {
            this.setImage(hoverImage);
        } else {
            this.setImage(normalImage);
        }
    }    
    
    public void select() {
        System.out.println("QuitMenu");
        this.updateSelection(false);
        //Greenfoot.stop();
        System.exit(0);
    }    
    
    public void updateSelection(boolean selection) {
        this.isSelected = selection;
    }  
    
    public boolean getSelection() {
        return isSelected;
    }    
}
