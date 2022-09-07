package com.bridgelabz;
import java.util.Scanner;


    public class FriendlyPair {
        static int sum1(int n1) //created method for sum of factors of number 1
        {
            int i, s1 = 0;
            for (i = 1; i < n1; i++)
            {
                if (n1 % i == 0)
                {
                    s1 = s1 + i;
                }

            } return s1;
        }

        static int sum2(int n2)  //created method for sum of factors of number 2
        {
            int j, s2 = 0;
            for (j = 1; j < n2; j++) {
                if (n2 % j == 0) {
                    s2 = s2 + j;
                }
            }
            return s2;
        }
        public static void main(String[] args) {
            System.out.println("********************************************");
            System.out.println(" Welcome to  Friendly Pair Program....");   //Printing Welcome Meassage
            System.out.println("********************************************");

            int n1, n2;
            System.out.println("Enter A First Number --->"); // taking input from user
            Scanner sc = new Scanner(System.in); // creating a scanner object
             n1 = sc.nextInt();
            System.out.println("Enter A Second Number --->"); // taking input from user

             n2 = sc.nextInt();


            if (  (sum1(n1)) / n1 ==  (sum2(n2)) /n2  )  //comparing ratio of sum of factors of both inputs
            {
                System.out.println(n1 + " And " + n2 + " Are Friendly Numbers.");
            }
            else {
                System.out.println(n1 + " And " + n2 + " Are Not Friendly Numbers.");
            }
        }
    }