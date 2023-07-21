public class Customer {
    public String name;
    public double discount;
    public int status;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(int status) {
    	if(status == 1) {
            this.discount = 10;
    	}
    	else if(status == 2){
            this.discount = 15;
    	}
    	else {
            this.discount = 0;
    	}
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", discount=" + discount +
                ", status=" + status +
                '}';
    }
    
}