package Kindrick;

public class DataTypesExample {

    public static void main(String[] args) {
        // Integer Data Type
        int age = 19;

        // Double Data Type 
        double height = (5.0 * 0.305); // height in feet converted to meters

        // Character Data Type
        char initial = 'K';

        // Boolean Data Type
        boolean isStudent = true;

        // String Data Type
        String name = "Kindrick";

        // Displaying the variables
        System.out.println("Name: " + name);
        System.out.println("Initial: " + initial);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + " meters");
        System.out.println("isStudent: " + isStudent);

        // Arithmetic operation with integer and double
        double weight = 47; // weight in kilos
        double bmi = weight / (height * height); // Calculating BMI

        System.out.printf("BMI: %.2f%n", bmi);

        if (bmi >= 18.5 && bmi <= 24.9) { 
            System.out.println("Normal BMI");
        }
        else if (bmi >= 25 && bmi <= 29.9) {
            System.out.println("Overweight");
        } 
        else if (bmi >= 30) {
            System.out.println("Obese");
        }
        else if (bmi < 18.5) {
            System.out.println("Underweight");
        }
    }
}
