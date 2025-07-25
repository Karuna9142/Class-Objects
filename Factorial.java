package com;

public class Factorial {

   void fact(int n) {
       int fact = 1;
       for (int i = 1;i<=n; i++) {
           fact =fact*i;
       }
       System.out.println("Factorial of "+n+ " is:- "+fact);
   }
    public static void main(String[] args) {
        Factorial f1 = new Factorial();
        f1.fact(5);
    }
}
