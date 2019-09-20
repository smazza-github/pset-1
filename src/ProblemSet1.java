/**
 * Problem Set 1.
 *
 * It's time to put your skills to the test. This problem set focuses on using
 * primitive data types, variables, and basic operators and functions.
 *
 * The specifications for each exercise are outlined below. Your output is
 * expected to meet requirements set forth in this section (as well as the
 * Deliverables section).
 *
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */

import java.text.NumberFormat;

public class ProblemSet1 {

    public static void main(String[] args) {

        /*
         * Exercise 1.
         *
         * What is the area (in square millimeters) of an 8.5-by-11-inch sheet of paper?
         */

         final double LENGTH = 8.5;
         final int WIDTH  = 11;
         final double MILLIMETERSCONVERSION = 25.4;
         double lengthMillimeters = LENGTH * MILLIMETERSCONVERSION;
         double widthMillimeters = WIDTH  * MILLIMETERSCONVERSION;
         double area = lengthMillimeters * widthMillimeters;
         double roundArea = Math.round(area * 100.0)/100.0;
         System.out.printf("\n%,.2f %s\n", roundArea, " square millimeters.");


        /*
         * Exercise 2.
         *
         * What is the perimeter (in centimeters) of an 8.5-by-11-inch sheet of paper?
         */

         final double CENTIMETERSCONVERSION = 2.54;
         double lengthCentimeters = LENGTH * CENTIMETERSCONVERSION;
         double widthCentimeters = WIDTH  * CENTIMETERSCONVERSION;
         double perimeter = (lengthCentimeters * 2) + (widthCentimeters * 2);
         double roundPerimeter = Math.round(perimeter * 100.0)/100.0;
         System.out.printf("\n%,.2f %s\n", roundPerimeter, " centimeters.");



        /*
         * Exercise 3.
         *
         * What is the length of the diagonal (in inches) between two corners on an 8.5-
         * by-11-inch sheet of paper?
         */

         double lengthSquared = LENGTH * LENGTH;
         double widthSquared = WIDTH  * WIDTH ;
         double hypotenuse = Math.round(java.lang.Math.sqrt(lengthSquared + widthSquared)*100.0)/100.0;
         System.out.printf("\n%,.2f %s\n", hypotenuse, " inches.");

        /*
         * Exercise 4.
         *
         * Given the grading policy and the homework, quiz, and test grades I received,
         * what marking period grade will I get?
         */

        final int HOMEWORK1 = 88;
        final int HOMEWORK2 = 91;
        final int HOMEWORK3 = 0;
        final int QUIZ1 = 84;
        final int QUIZ2 = 89;
        final int QUIZ3 = 93;
        final int TEST1 = 74;
        final int TEST2 = 87;
        final int TEST3 = 82;

        double homeAvg = HOMEWORK1 + HOMEWORK2 + HOMEWORK3;
        double homeAvg2 = homeAvg / 3;
        double homeAvg3 = homeAvg2 * 0.15;

        double quizAvg = QUIZ1 + QUIZ2 + QUIZ3;
        double quizAvg2 = quizAvg / 3;
        double quizAvg3 = quizAvg2 * 0.35;

        double testAvg = TEST1 + TEST2 + TEST3;
        double testAvg2 = testAvg / 3;
        double testAvg3 = testAvg2 * 0.5;

        double periodGrade = Math.round((homeAvg3 + quizAvg3 + testAvg3)*100.0)/100.0;
        System.out.println("\n" + periodGrade + "%.");

        /*
         * Exercise 5.
         *
         * I make $12.50/hour working as a cashier at a local supermarket. How much money
         * will I make this week?
         */

         final double HOURWAGE = 12.50;
         double m = 7.5 * HOURWAGE;
         double tu = 8 * HOURWAGE;
         double w = 10.5 * HOURWAGE;
         double th = 9.5 * HOURWAGE;
         double f = 6 * HOURWAGE;
         double sat = 11.5 * HOURWAGE;
         double sun = 0  * HOURWAGE;
         double payCheck = m + tu + w + th + f + sat + sun;
         double roundPayCheck = Math.round(payCheck * 100.0)/100.0;
         NumberFormat currencyformat = NumberFormat.getCurrencyInstance();
         System.out.println("\n" + currencyformat.format(roundPayCheck) + ".");

        /*
         * Exercise 6.
         *
         * What is my take-home pay each check?
         */

         // final double salary = 117000;
         // final double fedTax = 0.240;
         // final double incomeTax = 0.0637;
         // final double contribution = 0.07;
         //
         // final double fedTax1 = 0.240 *
         // final double incomeTax1 =
         // final double contribution1 =
         //
         // final double yearly = (((salary - contribution) - fedTax) - incomeTax);
         // final double monthly = yearly / 24;
         // System.out.println("\n" + currencyformat.format(monthly) + ".");


        /*
         * Exercise 7.
         *
         * I am planning a class trip next month. How many buses do I need, and how many
         * people will be on the last bus?
         */

         int students = 273;
         int teachers = 28;
         int passengerCapacity = 54;

         final double totalStudents = students + teachers;
         final double buses = totalStudents /  passengerCapacity;



        /*
         * Exercise 8.
         *
         * What is the surface area of a standard Cornhole board?
         */



        /*
         * Exercise 9.
         *
         * Are the years 2020, 2100, and 2400 leap years?
         */



        /*
         * Exercise 10.
         *
         * What is the wind chill?
         */

         final int TEMPERATURE = 30;

    }
}
