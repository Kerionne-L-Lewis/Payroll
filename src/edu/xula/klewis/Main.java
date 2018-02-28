package edu.xula.klewis;

public class Main {

    public static void main(String[] args) {
        System.out.println("\nHello Class! \n");


        Employee kerionne = new Employee();
        System.out.println("Here's the employee info: " + kerionne);

        Employee Sally = new Employee("Sally", 5699,17.22,40);
        System.out.println("Here's the employee info: " + Sally);

        double maxPay =Sally.maxPay();
        System.out.println("Sally maxpay "+ maxPay);


    }
}
