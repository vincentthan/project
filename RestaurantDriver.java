import java.util.ArrayList;
import java.util.Scanner;

public class RestaurantDriver {
    public static void main(String args[])
    {
		//Initialize scanner for user input
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> orderlist = new ArrayList<Integer>();
		int choice;
		String name = "";
		int status = 0;
		int dinein_choice = 0;
		boolean dinein = true;
		int order_choice = 1;
		
        System.out.println("Welcome to Rendang Fried Chicken");
        
        //Initialize 10 standard menu
        StandardMenu standard = new StandardMenu();
        standard.addMenuItems(new MenuItem(1,"Original Fried Chicken","3 Pieces of chicken With our specialise sauce", 10.0, 0));	
        standard.addMenuItems(new MenuItem(2,"Fried rice with chicken","Stir fry rice with chicken chop", 12.0, 0));
        standard.addMenuItems(new MenuItem(3,"Wonton noodle with beef","Noodle soup with beef", 12.0, 0));	
        standard.addMenuItems(new MenuItem(4,"Stir fry noodle with vegies","Stir fry noodle with 3 kind of vegies", 12.0, 0));	
        standard.addMenuItems(new MenuItem(5,"Chicken snitzel","Deep fry chicken with chips on sides", 14.0, 0));	
        standard.addMenuItems(new MenuItem(6,"Beef stroganoff","Seared beef with mushroom sauce", 12.0, 0));	
        standard.addMenuItems(new MenuItem(7,"Cheeseburger","Beef burger with a cheese slice", 16.0, 0));	
        standard.addMenuItems(new MenuItem(8,"Chicken biryani","Fluffy yellow rice with curry chicken",14.0, 0));	
        standard.addMenuItems(new MenuItem(9,"Cashew chicken","Stir fry chicken with roasted cashew", 15.0, 0));	
        standard.addMenuItems(new MenuItem(10,"Korean fried chicken","4 pieces chicken with korean sauce", 10.0, 0));	
        //10 premium menu
        PremiumMenu premium = new PremiumMenu();
        premium.addMenuItems(new MenuItem(11,"Salisbury Steak","Ground beef with gravy sauce", 30.0, 5));	
        premium.addMenuItems(new MenuItem(12,"Pork ribs","Grilled full racked of pork ribs", 40.0, 3));	
        premium.addMenuItems(new MenuItem(13,"Beef ribs","Grill full racked of beef ribs", 50.0, 3));	
        premium.addMenuItems(new MenuItem(14,"Steak au poivre","Medium rare steak with mushroom sauce", 50.0, 3));	
        premium.addMenuItems(new MenuItem(15,"Steak tomahawk","Just a grilled tomahawk", 35.0, 5));	
        premium.addMenuItems(new MenuItem(16,"Smoked salmon with caviar","Smoked salmon with caviar and salads on side", 35.0, 5));	
        premium.addMenuItems(new MenuItem(17,"Dry aged beef","Grilled steak with your choices", 51.0, 2));	
        premium.addMenuItems(new MenuItem(18,"Beef wellington","Juicy beef tenderloin wrapped in a pastry shell", 28.0, 1));	
        premium.addMenuItems(new MenuItem(19,"Roast duck","Roasted duck glazed with honey and crispy skin", 31.0, 10));	
        premium.addMenuItems(new MenuItem(20,"Coq au vin","Slow cooked beef with red wine and mushroom sauce", 38.0, 10));
        //10 discount menu
        DiscountMenu discount = new DiscountMenu();
        discount.addMenuItems(new MenuItem(21,"Stir fry pork with rice","stir fry tender pork with rice ", 10.0, 5));	
        discount.addMenuItems(new MenuItem(22,"Pad thai","stir fry thailand noodle", 11.0, 5));	
        discount.addMenuItems(new MenuItem(23,"Fish and chips","Deep fried basa fillet with chips", 12.0, 5));	
        discount.addMenuItems(new MenuItem(24,"Tacos","Sort of toppings wrapped with round soft warp", 10.0, 5));	
        discount.addMenuItems(new MenuItem(25,"Pho","Noodle soup with beef and beansprout", 11.0, 5));	
        discount.addMenuItems(new MenuItem(26,"Thali","Many different dishes served with small bowls", 13.0, 5));	
        discount.addMenuItems(new MenuItem(27,"Curry chiken","Curry chicken with rice and potatoes", 11.0, 5));	
        discount.addMenuItems(new MenuItem(28,"Ramen","Japanese noodle with tonkotsu base with chasu", 15.0, 5));	
        discount.addMenuItems(new MenuItem(29,"Udon","Udon with shoyu base with chicken", 15.0, 5));	
        discount.addMenuItems(new MenuItem(30,"Vegetarian mixed","Stir fry vegies", 10.0, 5));
        //10 drinks menu
        DrinkMenu drink = new DrinkMenu();
        drink.addMenuItems(new MenuItem(31,"Mineral Water","500ml of mineral water", 2.0, 0));	
        drink.addMenuItems(new MenuItem(32,"Coca-cola","500ml of coca-cola water", 3.0, 0));	
        drink.addMenuItems(new MenuItem(33,"Sprite","500ml of sprite can", 3.0, 0));	
        drink.addMenuItems(new MenuItem(34,"Fanta","500ml of fanta can", 3.0, 0));	
        drink.addMenuItems(new MenuItem(35,"Orange juice","500ml of orange water", 5.0, 0));	
        drink.addMenuItems(new MenuItem(36,"Coconut Water","500ml of coconut water", 5.0, 0));	
        drink.addMenuItems(new MenuItem(37,"Watermelon juice","500ml of watermelon juice", 5.0, 0));	
        drink.addMenuItems(new MenuItem(38,"Thai milk tea","milk tea with condense milk ", 6.0, 0));	
        drink.addMenuItems(new MenuItem(39,"Bubble milk tea","Milk tea with tapioca balls", 7.0, 0));	
        drink.addMenuItems(new MenuItem(40,"Sparkling Water","500ml of sparkling water", 3.0, 0));
        //Display a welcome message to screen.
        System.out.println("This RMMS System developed by Vincent K210598, Bikram Shretsha K210437 and Manish Gautam K210436");
        System.out.println("Do you want to place your order now? Choose 1 to Order, Choose 2 Exit");
      //  d) Ask user if they want to place order. If yes, ask the name and status of customer and display the different menu names that you have in RMMS.
      //  e) Once user make a choice, display the items available in that particular menu and ask user to enter the items they want in their order. User will use the number to add the items and can add one item more than once. Keep asking the user until they wish to finish the order.
      //  f) When user wish to finish order, program should calculate the total of all items and deducting customer discount according to the status they entered.
      //  g) Display the total amount due with all the details of order.
        do{
			//Initialize scanner for user to input the menu
			choice = sc.nextInt();
			switch(choice) {
				case 1: {
					System.out.println("Please tell us your name");
					sc.nextLine();
					name = sc.nextLine();
					System.out.println("Have you ordered at our restaurant ?");
					System.out.println("1. I'm active customers and ordered at least one a week");
					System.out.println("2. I'm a VIP Member, Visited here for more than a year");
					System.out.println("3. First time here");
		    		status = sc.nextInt();
		    	    while(status < 1 || status > 3) {
		    	    	//Print error message when the user doesnt input positive number
		    	    	//And let user re-input
		    	    	System.err.println("Please choose valid number from 1-3!");
			    		status = sc.nextInt();
		    	    }
		    	    Customer customer = new Customer();
		    	    customer.setStatus(status);
		    	    customer.setName(name);
		    	    customer.setDiscount(status);
					System.out.println("Thankyou for your information ! How do you want your food?");
					System.out.println("1. Dine In");
					System.out.println("2. Take Away");
		    		dinein_choice = sc.nextInt();
		    	    while(dinein_choice < 1 || dinein_choice > 2) {
		    	    	System.err.println("Please choose valid number from 1-2!");
			    		dinein_choice = sc.nextInt();
		    	    }
		    	    if(dinein_choice != 1) {
		    	    	dinein = false;
		    	    }
			    	    System.out.println("Here's our menu list, Enter the number to add your food");
			            System.out.println("Standard Menu :");
			            printstars();
			    	    standard.displayMenuItems();
			    	    
			            System.out.println("Premium Menu :");
			            printstars();
			    	    premium.displayMenuItems();
			    	    
			            System.out.println("Discount Menu :");
			            printstars();
			    	    discount.displayMenuItems();
			    	    
			            System.out.println("Drink Menu :");
			            printstars();
			    	    drink.displayMenuItems();
			    	    
			    	    System.out.println("Enter 0 if you want to checkout");
			    	    order_choice = sc.nextInt();
			    	   
			    	    while(order_choice != 0) {
				    	    while(order_choice < 0 || order_choice > 40) {
				    	    	System.err.println("Please choose valid number");
					    		order_choice = sc.nextInt();
				    	    }
				    	    orderlist.add(order_choice);
			    	    	System.out.println("Item Added!");
				    	    System.out.println("Enter other food number (*Enter 0 if you want to checkout)");
				    	    System.out.println("");
				    		order_choice = sc.nextInt();
			    	    }
			    	    calculateTotal(standard,premium,discount,drink,orderlist,customer,dinein);
			    	    
		    	    
				}
			
				case 2: {
					//reset all the variable before exiting the system
					choice = 9999;
					break;
				}
				
		        default:
		        //Display error message when the user input menu outside from the main menu and let the user retry
		         System.out.println("Invalid Choice! Please enter valid choice");
		         break;	
					
		}

        }while(choice!=9999);
		//Display goodbye message when the user exit the system
		System.out.println("Goodbye! See you next time!");
    }
    
    //Method for printing star separator
    public static void printstars() {
	    for(int k=0; k<39; ++k) {
			System.out.print('*');
	    }
	    System.out.println("");
    }
    
    public static void calculateTotal(StandardMenu standard,PremiumMenu premium, DiscountMenu discount, 
    		DrinkMenu drink, ArrayList<Integer> orderlist, Customer customer, boolean dinein) {
    	int itemNumber = 0;
    	double baseTotal = 0.00;
    	double grandTotal = 0.00;
    	double customerDiscount = customer.getDiscount();
		double dinein_charge = 0;
		double foodprice = 0;
		double dinein_charge_total = 0;
		double customerDiscount_total = 0;
		
		System.out.println("Hi " + customer.getName());
		System.out.println("Below is the receipt for your order!");
		printstars();
    	 for (int counter = 0; counter < orderlist.size(); counter++) { 		
    		 itemNumber = orderlist.get(counter);
             if(itemNumber <= 10) {
            	 foodprice = standard.getMenuPrice(itemNumber-1);
            	 baseTotal += foodprice;
            	 standard.displayMenuPriceDetail(itemNumber-1);
            	 System.out.println("Price : $" + foodprice);
            	 System.out.println("");
             }
             else if(itemNumber <= 20) {
            	 foodprice = premium.getMenuPrice(itemNumber-11);
            	 baseTotal += foodprice;
            	 premium.displayMenuPriceDetail(itemNumber-11);
            	 System.out.println("Price : $" + foodprice);
            	 System.out.println("");
             }
             else if(itemNumber <= 30) {
            	 foodprice = discount.getMenuPrice(itemNumber-21);
            	 baseTotal += foodprice;
            	 discount.displayMenuPriceDetail(itemNumber-21);
            	 System.out.println("Price : $" + foodprice);
            	 System.out.println("");
             }
             else if(itemNumber <= 40) {
            	 foodprice = drink.getMenuPrice(itemNumber-31);
            	 baseTotal += foodprice;
            	 drink.displayMenuPriceDetail(itemNumber-31);
            	 System.out.println("Price : $" + foodprice);
            	 System.out.println("");
             }
         }
    	 
    	 System.out.println("Total food price : $" + baseTotal);
    	 
    	 if(customerDiscount != 0) {
    		 customerDiscount_total = baseTotal * (customerDiscount/100.0);
    		 System.out.println("("+ customerDiscount + "%) customer discount = $" + customerDiscount_total);
    	 }
    	 
     	if(dinein == true) {
    		dinein_charge = 2.5;
    		dinein_charge_total = (baseTotal * ((100.0 - customerDiscount)/100.0))*(dinein_charge/100.0);
    		System.out.println("("+ dinein_charge + "%) Dine-in Charge = $" + dinein_charge_total);
    	}
    	 
    	 grandTotal = baseTotal - customerDiscount_total + dinein_charge_total;
    	 System.out.println("Your grand total would be $" + grandTotal);
    }
}