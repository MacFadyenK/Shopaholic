package items.jewelry;

import items.Item;

public abstract class Jewelry extends Item {
    protected String metalType = "Gold";
    //returns the type of metal of the jewelry
    public String getMetalType(){
        return this.metalType;
    }

    //sets the type of metal the jewelry is made out of
    public void setMetalType(String metal){
        this.metalType = metal;
    }
}
