public class MenuItem {
    private int ItemNumber;
    private String ItemName;
    private String Description;
    private double price;
    private double percentage;
    MenuItem()
    {	
        this.ItemNumber = 0;
        this.ItemName = "Unknown";
        this.Description = "Unknown";
        this.price = 0.00;
        this.percentage = 0.00;
    }
    
    //Initialize MenuItem
    MenuItem(int ItemNumber,String ItemName,String Description,double price, double percentage)
    {
        this.ItemNumber=ItemNumber;
        this.ItemName=ItemName;
        this.Description= Description;
        this.price=price;
        this.percentage=percentage;
    }
    
    public int getMenuNumber(){
    	return this.ItemNumber;
    }
    
    public String getMenuName(){
    	return this.ItemName;
    }
    
    public String getMenuDescription(){
    	return this.Description;
    }
    
    public double getMenuPrice(){
    	return this.price;
    }
    
    public double getPercentage(){
    	return this.percentage;
    }
    
    //Overriding toString method
    @Override
    public String toString() {
        return "MenuItem{" +
                "ItemNumber=" + ItemNumber +
                ", ItemName='" + ItemName + '\'' +
                ", Description='" + Description + '\'' +
                ", price=" + price +
                ", percentage=" + percentage +
                '}';
    }
}