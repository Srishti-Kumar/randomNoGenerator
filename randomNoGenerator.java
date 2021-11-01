package java5thsemprojects;

import java.util.Scanner;

public class randomNoGenerator {
    public static void main(String[] args) {
        //MINI PROJECT
        Scanner sc = new Scanner(System.in);
        int myNum = (int) (Math.random()*100);
        int userNum;
        do {
            System.out.println("Enter any number(1 - 100) : ");
            userNum = sc.nextInt();

            if (userNum == myNum) {
                System.out.println("WOOHOO ! Correct Answer");
            } else if (userNum > myNum){
                System.out.println("too large");
            } else {
                System.out.println("too small");
            }
        } while (userNum > 0);

        System.out.println("The num is " + myNum);
    }
}


