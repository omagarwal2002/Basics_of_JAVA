package Lab2;

import java.util.Scanner;

public class CountingVowelsConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter your string:");
        Scanner sc=new Scanner (System.in);
        String s = sc.nextLine();
        s= s.toLowerCase();
        int vcount = 0, ccount = 0;
        
        for(int i=0; i<s.length(); i++) {
        	char ch= s.charAt(i);
        	if(ch=='a' || ch=='e' || ch=='i' ||ch=='o' ||ch=='u') {
        		vcount++;
              	}
        	else if((ch>='a' && ch<='z'))  {
        		ccount++;
        	}
        }
        System.out.println("No. of consonants= "+ ccount);
        System.out.println("No. of vowels ="+ vcount);
	}

}
