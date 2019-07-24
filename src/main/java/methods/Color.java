package methods;

public class Color{

    public  char color;

    public void setColor( char colorCode){

        if (colorCode == 'G'){
         color = colorCode;

        }else if (colorCode == 'R'){
         color = colorCode;

        }else if(colorCode == 'B'){
         color = colorCode;

        }else{
        System.out.println(colorCode +" is a Wrong color code : Use G, B or R");
    }
}

    public char getItemColor() {
        System.out.println(this.color);

        return this.color;
    }

        public static void main(String[] args){
 
                char valid = 'G';
                char invalid = 'T';

                System.out.println(".............Valid Color ........");

                Color newColor = new Color();
                newColor.setColor(valid);
                newColor.getItemColor();

                System.out.println(".............Invalid Color ........");
                newColor.setColor(invalid);
            }
        }
    
