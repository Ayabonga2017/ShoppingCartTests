package methods;

public class Painter{
public static void main(String[] args) {

    House housePaint = new House();
    
    final String white = "White";
    final String orange = "Orange";
    final int addressN = 2122;
    
    System.out.println("Before being painted :\n"+housePaint.color);   

    housePaint.addColor(white);
    housePaint.setAddress(addressN);

    System.out.println("After being painted : \n" +housePaint.color);   
    System.out.println("Address : \n" +housePaint.houseAddress);   
    
   // housePaint.Final(housePaint.addColor(white), housePaint.setAddress(addressN));

    }
}