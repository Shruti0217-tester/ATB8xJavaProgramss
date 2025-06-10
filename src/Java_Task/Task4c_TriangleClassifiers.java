package Java_Task;

public class Task4c_TriangleClassifiers {
    public static void main(String[] args) {
        // Write a program that classifies a triangle based on its side lengths.
        // Given three input values  representing the length of the sides, determine.
        // If the triangle is equilateral (all sides are equal).
        // If the triangle is isosceles (exactly two sides are equal).
        // If the triangle is scalene (no sides are equal).
        // Use an if -else statement to classify the triangle.
        // side1, side2, side3 ->

        int side1 = 25;
        int side2 = 25;
        int side3 = 25;

        if(side1 == side2 && side1 == side3){
            System.out.println("This triangle is an Equilateral Triangle");
        } else if (side1 == side2 && side1 != side3) {
            System.out.println("This triangle is an Isosceles Triangle");
        } else if (side1 != side2 && side1 == side3) {
            System.out.println("This triangle is an Isosceles Triangle");
        } else {
            System.out.println("This triangle is an Scalene Triangle");
        }
    }
}
