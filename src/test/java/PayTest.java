import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import methods.ItemSizes;
import methods.Pay;

import static org.junit.Assert.assertEquals;

public class PayTest{

    @Test
    @DisplayName("Buy small sized items");
    public void SmallSizes (){
        ItemSizes itemSize = new ItemSizes();
        Pay purchase = new Pay();

        purchase.buySkids(itemSize.sKidsPrice);
        purchase.buySmen(itemSize.sMenPrice);
    }
}