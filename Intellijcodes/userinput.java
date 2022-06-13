package Intellijcodes;
import java.util.Scanner;

public class userinput {
    public static void main(String[] args) {
        System.out.println("enter your name");
        Scanner sc=new Scanner (System.in);
        String name = sc.nextLine();
        System.out.println("my name is "+ name);
}}