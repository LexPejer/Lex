
package temperature;
import java.util.Scanner;


    class TempCon{
        private double num;
        private double celcius,fahrenheit ;
        
        void setCel(double c){
            this.num = c;
        }
        
        double getFah(){
            this.fahrenheit = (this.num * 9/5) + 32; 
            return (this.fahrenheit);
        }
        
        void setFah(double f){
            this.num = f;
        }
        
        double getCel(){
            this.celcius = (this.num - 32) * 5/9;
            return (this.celcius);
        }
}

public class Temperature {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TempCon tc = new TempCon();
        
        System.out.println("\t  Select what Conversion of Temperature\n"
                + "1 for Celcius to Fahrenheit \t  2 for Fahrenheit to Celcius\n");
        int con = input.nextInt();
        
        
        switch (con){
            case 1:
                System.out.print("\n\t  Celcius to Fahrenheit\n"
                        + "\nEnter Celcius: ");
                double c = input.nextDouble();
                tc.setCel(c);
                double result = tc.getFah();
                System.out.println("\n" + c + " Celcius is equal to " + result + " Fahrenheit\n");
                break;
                
            case 2:
                System.out.print("\n\t  Fahrenheit to Celcius\n"
                        + "\nEnter Fahrenheit: ");
                double f = input.nextDouble();
                tc.setCel(f);
                double result2 = tc.getCel();
                System.out.println("\n" + f + " Fahrenheit is equal to " + result2 + " Celcius\n");
                break;
                
            default:
                System.out.println("\n" + "Invalid Number\n");
                
        }
        
    }
    
}
