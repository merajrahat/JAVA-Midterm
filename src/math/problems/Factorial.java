package math.problems;



public class Factorial {

    static int factorial1(int n)
    {
        int res = 1, i;
        for (i = 2; i <= n; i++)
            res *= i;
        return res;
    }
    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        //Scanner object for capturing the user input
        int num = 5;
        System.out.println("Using Iteration Loop Factorial of " + num + " is " + factorial1(5));


    int factorial = fact(5);
        System.out.println("Using Recursion Factorial of 5 is: "+factorial);
    }
    static int fact(int n)
    {
        int output;
        if(n==1){
            return 1;
        }
        //Recursion: Function calling itself!!
        output = fact(n-1)* n;
        return output;

    }

}
