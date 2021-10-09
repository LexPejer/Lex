
package circle;
import java.util.Scanner;

class AreaCircle{
    private int num;
    private double area, pi;
    
    
    AreaCircle(double pi){
        this.pi = pi;
    }
    void setRadius(int n){
        this.num = n;
    }
    
    double getArea(){
        this.area = (this.num * this.num) * this.pi;
         
        return(this.area);
    }
}

public class Circle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        AreaCircle ac = new AreaCircle(3.14);
        
        System.out.print("Enter Circle Radius: ");
        int n = input.nextInt();
        ac.setRadius(n);

        double result = ac.getArea();
        
        System.out.println("The Area of the Circle is: " + result);

    }
    
}
