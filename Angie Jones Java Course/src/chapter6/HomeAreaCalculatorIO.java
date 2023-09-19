package chapter6;

public class HomeAreaCalculatorIO {

    public static void main(String args[]){

        /*******************
         * Rectangle 1
         *******************/

        //Create instance of RectangleCAO class
        RectangleCAO room1 = new RectangleCAO();
        room1.setWidth(25);
        room1.setLength(50);
        double areaOfRoom1 = room1.calculateArea();

        /*******************
         * Rectangle 2
         *******************/

        //Create instance of RectangleCAO class
        RectangleCAO room2 = new RectangleCAO(30,75);
        double areaOfRoom2 = room2.calculateArea();

        double totalArea = areaOfRoom1 + areaOfRoom2;

        System.out.println("Area of both rooms: " + totalArea);
    }
}
