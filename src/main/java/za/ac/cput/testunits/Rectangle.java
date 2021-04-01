
package za.ac.cput.testunits;

/**
 *
 * @author Lundi Mkhungwane - 216039746
 * 
 * The class calculates rectangle parameters and areas
 */

public class Rectangle {

    static double areaRectangle(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public double number1, number2, number3;
    
// GETTER METHODS
    public double getNumber1(){     // first variable getter
        return number1;
    }
    
    public double getNumber2(){     // second variable getter
        return number2;
    }
    
// SETTER METHODS
    public void setNumber1(double x){    // first setter
        this.number1 = x;
    }
    
    public void setNumber2(double y){
        this.number2 = y;
    }
    
// LOGIC FOR CALCULATING AN AREA AND PERIMETER OF A RECTANGLE
    public double areaRectangle(){
        double area = number1 * number2;   // area of a rectangle is length * width
        return area;
    }
    
    public double perimeterRectangle(){
        double perimeter = 2*(number1 + number2);   // a perimeter is the sum of all sides
        return perimeter;
    }

    @Override
    public String toString() {
        return "Calculate{" + "number1=" + number1 + ", number2=" + number2 + '}';
    }
}
