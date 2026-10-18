import uulib.Console;

public class BMI {

    public static double calcBMI(double weight, double height) {
        if (weight <= 0 || height <= 0) {
            return 0.0;
        }

        return weight / (height * height);
    }

    public static String getBMIResult(double bmi) {
        if (bmi == 0.0) {
            return "invalid";
        } else if (bmi < 20.0) {
            return "underweight";
        } else if (bmi > 30.0) {
            return "overweight";
        } else {
            return "normal";
        }
    }


    public static void main(String[] args) {
        String continueChoice;
        do {
            // 1. Get user input
            double weight = Console.getDouble("Enter weight in kg");
            double height = Console.getDouble("Enter height in meters");

            // 2. Process the input
            double bmi = calcBMI(weight, height);
            String bmiResult = getBMIResult(bmi);

            // 3. Provide output
            if (bmiResult.equals("invalid")) {
                System.out.println("Error: Weight and height must be positive numbers. Try again.");
            } else {
                // Format output to one decimal place.
                System.out.printf("Your BMI is %.1f, which is considered %s.%n", bmi, bmiResult);
            }

            // 4. Continue input
            continueChoice = Console.getString("Calculate another BMI? (y/n)");

        } while (continueChoice.equalsIgnoreCase("y"));

        System.out.println("Thank you for using the BMI Calculator.");
    }
}