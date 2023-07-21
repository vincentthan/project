import java.sql.Time;
import java.util.ArrayList;

public class StandardMenu extends MenuItem {

    ArrayList<MenuItem> menuItems;
    
    StandardMenu()
    {
        this.menuItems = new ArrayList<MenuItem>();
    }

    public void addMenuItems(MenuItem menuItem)
    {
        menuItems.add(menuItem);
    }
    
    public void deleteMenuItems(MenuItem menuItem)
    {
        menuItems.remove(menuItem);
    }
    
    public void displayMenuItems()
    {
        for (int counter = 0; counter < menuItems.size(); counter++) { 		      
            System.out.println("" + menuItems.get(counter).getMenuNumber() + ". " + menuItems.get(counter).getMenuName() + " $" + menuItems.get(counter).getMenuPrice());
            System.out.println(menuItems.get(counter).getMenuDescription());
            System.out.println("");
        }   
    }
    
    public double getMenuPrice(int MenuNumber) {
    	return menuItems.get(MenuNumber).getMenuPrice();
    }
    
    public void displayMenuPriceDetail(int counter) {
    	System.out.println("" + menuItems.get(counter).getMenuName() + " $" + menuItems.get(counter).getMenuPrice());
    }

    @Override
    public String toString() {
        return "StandardMenu{" +
                 "menuItems=" + menuItems +
                '}';
    }
}