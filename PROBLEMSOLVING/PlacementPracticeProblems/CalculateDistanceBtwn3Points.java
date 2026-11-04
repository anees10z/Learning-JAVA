package PROBLEMSOLVING.PlacementPracticeProblems;

// Coding Question 14
// Instructions: You are required to write the code. You can click on compile & run anytime to check the compilation/ execution status of the program. The submitted code should be logically/syntactically correct and pass all the test cases.

// Ques: The program is supposed to calculate the distance between three points.
// For,

// x1 = 1,  y1 = 1
// x2 = 2 , y2 = 4
// x3 = 3,  y3 = 6

// Distance is calculated as : sqrt(x2-x1)2 + (y2-y1)2

public class CalculateDistanceBtwn3Points {
    public static void main(String[] args) {
        int x1 = 1, y1 = 1;
        int x2 = 2, y2 = 4;
        int x3 = 3, y3 = 6;

        int atob = (int) Math.sqrt (Math.pow (x2 - x1, 2) + Math.pow (y2 - y1, 2));
        int btoc = (int) Math.sqrt (Math.pow (x3 - x2, 2) + Math.pow (y3 - y2, 2));
        int atoc = (int) Math.sqrt (Math.pow (x3 - x1, 2) + Math.pow (y3 - y1, 2));

        System.out.println("A to B: " + atob);
        System.out.println("B to C: " + btoc);
        System.out.println("A to C: " + atoc);
    }
}
