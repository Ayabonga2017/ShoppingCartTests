package methods;

public class ShoppingCart{

    public char itemColor ;
    public  String description;
    public  double cost;

    public ShoppingCart(String desc,double price,char color){

        this.itemColor = color;
        this.description = desc;
        this.cost =price;

    }
    public String setSize(String size){
        return  size;
    }

  
  

}
