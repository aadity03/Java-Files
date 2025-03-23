/*Full Name: Adity Adity
Student Number: 251272751
Date: 03 February 2023
Brief description of the task: Writing a program that asks user to input three grade and based on each
course's weightage, a final grade is outputted to the user.
*******************************************************************************************************
*/
package Q3; //Defining the package name
import java.util.Scanner; // importing a pre-existing library to allow user input
public class GradeCalculator { // creating a public class named GradeCalculator
    public static void main(String[] args) { //creating the driver method main()
        Double GRD1_WGT = 0.2, GRD2_WGT = 0.3, GRD3_WGT = 0.5; // initializing three variable each counting the weightage of the courses
        Scanner input = new Scanner (System.in); // initializing 'input' as user input variable
        Double grade1, grade2, grade3; //initializing the three variables: one for each grade

        System.out.print("Input the first grade:"); // prompting user to put in the first grade
        grade1 = input.nextDouble(); // assigning the user inputted value to grade 1

        System.out.print("Input the second grade:"); // prompting user to put in the second grade
        grade2 = input.nextDouble(); // assigning the user inputted value to grade 2

        System.out.print("Input the third grade:"); // prompting user to put in the third grade
        grade3 = input.nextDouble(); // assigning the user inputted value to grade 3

        Double finalGrade = (grade1* GRD1_WGT) + (grade2 * GRD2_WGT) + (grade3 * GRD3_WGT); // assigning value to variable finalGrade that calculates the grade based on the assigned weightage
        System.out.printf("The course grade is: %.2f",finalGrade); // outputting the calculated final grade

    } // closing main()
} // closing the class GradeCalculator
