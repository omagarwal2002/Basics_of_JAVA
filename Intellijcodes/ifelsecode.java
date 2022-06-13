package Intellijcodes;


import java.util.Scanner;
public class ifelsecode {
    public static void main(String[] args) {
        System.out.println("give your age:");
        Scanner sc=new Scanner (System.in);
        int age = sc.nextInt();
        if(age>40) {
            System.out.println("u r eligible");
        }
        else if(age<20){
            System.out.println("u r underage");
            }
        else if(age>60){
            System.out.println("submit your eyesight test report first");
        }
        else{
            System.out.println("perfecto!!");
        }
    }
}