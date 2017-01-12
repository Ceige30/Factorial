package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        boolean loop = true;
        int num = 0;
        int factorial = num;
        int fNum = num;

        while(loop){
            System.out.println("Input a number to be number to be calculator into a factorial");
            try{
                num = sc.nextInt();
                if(num > 16){
                    System.out.println("Your number will lead to an error pick something better mate");
                }else
                    loop = false;
            }catch(InputMismatchException ime){
                System.out.println("Input a better number");
            }
        }
        while(num !=0){
            if(num == 1)
                break;
            else{
                factorial *= num - 1;
                num -= 1;
            }
        }
        System.out.println(factorial + " is the  factorial of " + fNum);
    }
}
