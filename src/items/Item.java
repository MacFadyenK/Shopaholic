package items;
import java.util.Random;

public abstract class Item {
    protected int ID;
    protected double price;
    protected String image;
    protected String description;
    protected String name;
    protected String size = "S";
    protected int quantity = 1;
    protected int percent;
    public boolean onSale = false;
    public boolean inCart = false;

    

    //adds an image path to the item for a representative image
    public void addImage(String imagePath){
        this.image = imagePath;
    }

    //returns the string for the image path
    public String getImage(){
        return this.image;
    }

    //generates a discount on an item from 5% to 50%
    //equal likelihood for all discounts
    public void discount(){
        //gets random discount from 5-50%
        this.percent = new Random().nextInt(5, 50);
        this.price = price - (percent*price)/100.0;
        this.onSale = true;
    }

    //returns the discount percent on the item
    public int getPercent(){
        return this.percent;
    }

    //returns the price of the item
    public double getPrice(){
        return this.price;
    }

    //returns the name of the object
    public String getName() {
        return this.name;
    }

    //gets the size of the item
    public String getSize(){
        return this.size;
    }

    //sets a new size for the item
    public void setSize(String newSize){
        this.size = newSize;
    }

    //returns a description of the product
    public String getDescription() {
        return this.description;
    }

    //returns the ID of the item
    public int getID(){
        return this.ID;
    }

    //returns the quantity of the item desired
    public int getQuantity(){
        return this.quantity;
    }

    //sets the quantity of the item desired
    public void setQuantity(int newQuantity){
        this.quantity = newQuantity;
    }
}
