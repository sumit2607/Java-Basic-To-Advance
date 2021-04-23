package Arithmaticandunaryoprrator;

public class CompoundInterest {
    public static void main(String[] args) {
        /* P = Principle , R= rateOfInterest, T= time*/

        double p = 100,t = 1, r=12.253;

        /* formula for compoundInterest principle * (Math.pow((1 + rate / 100), time));*/

        double compoundInterest =  p * (Math.pow((1 + r / 100), t));

        System.out.println("Your Compound Interest will be  " + compoundInterest);

    }
}
