import java.sql.Time;
import java.util.ArrayList;

public class DiscountMenu extends MenuItem {

    ArrayList<MenuItem> menuItems;
    
    DiscountMenu()
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
            System.out.println("Discount of " + menuItems.get(counter).getPercentage() + "%");
            System.out.println(menuItems.get(counter).getMenuDescription());
            System.out.println("");
        }   
    }
    
    public void displayMenuPriceDetail(int counter) {
        System.out.println("" + menuItems.get(counter).getMenuName() + " $" + menuItems.get(counter).getMenuPrice());
        System.out.println("Discount of " + menuItems.get(counter).getPercentage() + "%");
    }
    
    public double getMenuPrice(int MenuNumber) {
    	return (menuItems.get(MenuNumber).getMenuPrice() * ((1.0 - (menuItems.get(MenuNumber).getPercentage()/100.0))));
    }

    @Override
    public String toString() {
        return "DiscountMenu{" +
                 "menuItems=" + menuItems +
                '}';
    }
}