import greenfoot.*;
import java.util.*;

/**
 * Write a description of class PlayNowMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayNowMenu extends StartMenuOption
{
    private GreenfootImage hoverImage;
    private GreenfootImage normalImage;    
    boolean isSelected;
    public PlayNowMenu () {
        hoverImage = new GreenfootImage("btn-playNow-hover.png");
        normalImage = new GreenfootImage("btn-playNow.png");
        isSelected = true;
    }
        
    /**
     * Act - do whatever the PlayNowMenu wants to do. This method is called whenever
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
        System.out.println("PlayNowMenu");
        this.updateSelection(false);
        World world = getWorld();
        
        List objectsList = getWorld().getObjects(Selector.class);
        System.out.println("*** size: "+objectsList);
        world.removeObjects(objectsList);
        
        objectsList = getWorld().getObjects(StartMenu.class);
        System.out.println("*** size: "+objectsList);
        world.removeObjects(objectsList);
        
        objectsList = getWorld().getObjects(StartMenuOption.class);
        System.out.println("*** size: "+objectsList);     
        world.removeObjects(objectsList);
     
        world.setBackground(new GreenfootImage("space1.jpg"));
        world.addObject(new Hero(null), 400, 100);
        world.addObject(new BaseTerrain(), 413, 566);
    }
    
    public void updateSelection(boolean selection) {
        this.isSelected = selection;
    }
    
    public boolean getSelection() {
        return isSelected;
    }
}
