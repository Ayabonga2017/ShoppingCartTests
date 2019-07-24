package methods;

public class Painter{
public static void main(String[] args) {

    House housePaint = new House();
    
    final String white = "White";
    final String orange = "Orange";
    int addressN = 100;
    
    System.out.println("Before being painted :\n"+housePaint.color+ "\n");   

    housePaint.addColor(white);
   int address =  housePaint.setAddress(addressN);

    System.out.println("After being painted : \n" +housePaint.color);   
    System.out.println("Address : \n" +address);   
    
   // housePaint.Final(housePaint.addColor(white), housePaint.setAddress(addressN));

    }
}