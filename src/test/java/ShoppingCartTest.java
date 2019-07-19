import methods.Color;
import methods.ItemSizes;
import methods.ShoppingCart;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class ShoppingCartTest{

    @Test

    public  void validColor(){

        String desc="you bought a t-shirt";
        double cost = 10.99;
        char colorCode = 'G';

        Color color = new Color();
        ShoppingCart item1 = new ShoppingCart(desc,cost,color.setColor(colorCode));

        assertEquals(item1.description,"you bought a t-shirt");
        assertEquals(item1.itemColor,'G');

        System.out.println(item1.description);
        System.out.println(item1.itemColor);
        System.out.println(item1.cost);
    }

    @Test
    public  void addSize(){
        Color color = new Color();

        String desc="You bought a pair of shoes";
        double cost = 299.99;
        char colorCode = 'G';

        ShoppingCart item1 = new ShoppingCart(desc,cost,color.setColor(colorCode));

        assertEquals(item1.description,"You bought a pair of shoes");
        assertEquals(item1.itemColor,'G');
        assertEquals(item1.setSize(ItemSizes.mKids),"Kids medium ");

        
        StringBuilder print = new StringBuilder();
        print.append(item1.description);
        print.append(" for the price of ");
        print.append(item1.cost);
        print.append(".");
        print.append("\nYour color code is ");
        print.append(item1.itemColor);
        print.append(".");
        print.append("\nYour item size is ");
        print.append(item1.setSize(ItemSizes.mKids));

        System.out.println(print);

    }
}
