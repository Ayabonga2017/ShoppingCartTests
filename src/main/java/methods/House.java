package methods;

public class House {

    //static methods & variables
static String color = "Blue";
static int houseAddress = 2123;


public static String addColor(String houseColor) {

    return color = houseColor;
    }
    public static int setAddress(int address){

        return address=houseAddress;
 
     }
    //overloaded a method:
    // public static void Final(String houseColor, int number) {

    //  System.out.println(houseColor + number);
    // }


}