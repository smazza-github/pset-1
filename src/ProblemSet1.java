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

         final double length = 8.5;
         final double width = 11;
         final double millimetersConversion = 25.4;
         final double lengthMillimeters = length * millimetersConversion;
         final double widthMillimeters = width * millimetersConversion;
         final double area = lengthMillimeters * widthMillimeters;
         final double roundArea = Math.round(area * 100.0)/100.0;
         System.out.printf("\n%,.2f %s\n", roundArea, " square millimeters.");


        /*
         * Exercise 2.
         *
         * What is the perimeter (in centimeters) of an 8.5-by-11-inch sheet of paper?
         */

         final double centimetersConversion = 2.54;
         final double lengthCentimeters = length * centimetersConversion;
         final double widthCentimeters = width * centimetersConversion;
         final double perimeter = (lengthCentimeters * 2) + (widthCentimeters * 2);
         final double roundPerimeter = Math.round(perimeter * 100.0)/100.0;
         System.out.printf("\n%,.2f %s\n", roundPerimeter, " centimeters.");



        /*
         * Exercise 3.
         *
         * What is the length of the diagonal (in inches) between two corners on an 8.5-
         * by-11-inch sheet of paper?
         */

         final double lengthSquared = length * length;
         final double widthSquared = width * width;
         final double hypotenuse = Math.round(java.lang.Math.sqrt(lengthSquared + widthSquared)*100.0)/100.0;
         System.out.printf("\n%,.2f %s\n", hypotenuse, " inches.");

        /*
         * Exercise 4.
         *
         * Given the grading policy and the homework, quiz, and test grades I received,
         * what marking period grade will I get?
         */

        int homework1 = 88;
        int homework2 = 91;
        int homework3 = 0;
        int quiz1 = 84;
        int quiz2 = 89;
        int quiz3 = 93;
        int test1 = 74;
        int test2 = 87;
        int test3 = 82;

        final double homeAvg = (((88 + 91 + 0)/3)*0.15);
        final double quizAvg = (((84 + 89 +93)/3)*0.35);
        final double testAvg = (((74 + 87 + 82)/3)*0.5);
        final double periodGrade = (homeAvg + quizAvg + testAvg);
        System.out.println("\n" + mpGrade + "%.");

        /*
         * Exercise 5.
         *
         * I make $12.50/hour working as a cashier at a local supermarket. How much money
         * will I make this week?
         */

         final double hourWage = 12.50;
         final double m = 7.5 * hourWage;
         final double tu = 8 * hourWage;
         final double w = 10.5 * hourWage;
         final double th = 9.5 * hourWage;
         final double f = 6 * hourWage;
         final double sat = 11.5 * hourWage;
         final double sun = 0  * hourWage;
         final double payCheck = m + tu + w + th + f + sat + sun;
         final double roundPayCheck = Math.round(payCheck * 100.0)/100.0;
         NumberFormat currencyformat = NumberFormat.getCurrencyInstance();
         System.out.println("\n" + currencyformat.format(roundPayCheck) + ".");

        /*
         * Exercise 6.
         *
         * What is my take-home pay each check?
         */

         final double salary = 117000;
         final double fedTax = 0.240;
         final double incomeTax = 0.0637;
         final double contribution = 0.07;

         final double fedTax1 = 0.240 *
         final double incomeTax1 =
         final double contribution1 =

         final double yearly = (((salary - contribution) - fedTax) - incomeTax);
         final double monthly = yearly / 24;
         System.out.println("\n" + currencyformat.format(monthly) + ".");


        /*
         * Exercise 7.
         *
         * I am planning a class trip next month. How many buses do I need, and how many
         * people will be on the last bus?
         */



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



    }
}
