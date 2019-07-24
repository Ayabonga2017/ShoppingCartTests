package methods;

public class Pay{

    double myBalance = 120.99;

    public void buyMkids ( double sizePrice){

        double total = myBalance - sizePrice;
        System.out.println("Mediumm size for Kids will cost you : \n"+ "R " +total);
    }
    public void buySkids (double sizePrice){

        double total = myBalance - sizePrice;
        System.out.println("Small size for Kids will cost you : \n"+ "R " +total);
    }
    public void buyMmen (double sizePrice){

        double total = myBalance - sizePrice;
        System.out.println("Mediumm size for Men will cost you : \n"+ "R " +total);
    } 
    public void buySmen (double sizePrice){

        double total = myBalance - sizePrice;
        System.out.println("Small size for Men will cost you : \n"+ "R " +total);
    }

    public static void main(String[] args) {
        
        ItemSizes itemSize = new ItemSizes();
        Pay purchase = new Pay();

       // Small Sized
        purchase.buySkids(itemSize.sKidsPrice);
        purchase.buySmen(itemSize.sMenPrice);
        
        //Medium Sized
        purchase.buyMkids(itemSize.mKidsPrice);
        purchase.buyMmen(itemSize.mMenPrice);
    }
}