public class Menu {
    private String Id;
    private String Name;
    private String Venue;
    private int Session;
    Menu()
    {}
    
    //Initialize Menu
    Menu(String Id,String Name,String Venue,int Session)
    {
        this.Id=Id;
        this.Name=Name;
        this.Venue=Venue;
        this.Session=Session;
    }
    
    //Overriding toString method
    @Override
    public String toString() {
        return "Menu{" +
                "Id='" + Id + '\'' +
                ", Name='" + Name + '\'' +
                ", Venue='" + Venue + '\'' +
                ", Session=" + Session +
                '}';
    }
}