public class GroceryItem {

    String name;
    int price;
    
    public void showItemName() {

       System.out.println("This is a " + this.name);
    }
     
    public void showItemPrice() {
      
        System.out.println(" the price is  " + this.price);
    }
}