package Arithmaticandunaryoprrator;

public class ArithmaticAndUnary {
    /*Problem
Take a variable named a , assign it a value of 10, and perform the following operations on it.

Add 2 to the same variable
Subtract 3 from the same variable
Divide the same variable by 6
Multiply the same variable by 11
take a remainder by 7 of the same variable*/
    
    public static void main(String[] args){
        int a = 10;
        //Add 2 to the same variable
        a+=2;
        //Subtract 3 from the same variable
        a-=3;
        //Divide the same variable by 6
        a/=6;
        //Multiply the same variable by 11
        a*=11;
        //take a remainder by 7 of the same variable
        a%=7;
        System.out.println(a);
    }
}
