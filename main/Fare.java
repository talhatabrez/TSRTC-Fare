package main;

import java.util.Scanner;

public class Fare {
    // Updated getFare method to accept boarding and de-boarding points as parameters
    public static int getFare(String boardPt, String deboardPt){
        String arr[] = new String[10];
        arr[0] = "Gangaram";
        arr[1] = "Madinaguda";
        arr[2] = "St.Anns";
        arr[3] = "Allwyn X Roads";
        arr[4] = "Miyapur X Roads";
        arr[5] = "Miyapur Metro";
        arr[6] = "Hydernagar";
        arr[7] = "Nizampet X Roads";
        arr[8] = "JNTU College";
        arr[9] = "KPHB Colony";

        int boardInd = -1;
        int deboardInd = -1;

        for(int i=0; i<arr.length; i++){
            if(arr[i].equals(boardPt)){
                boardInd = i;
                break;
            }
        }

        for(int i=0; i<arr.length; i++){
            if(arr[i].equals(deboardPt)){
                deboardInd = i;
                break;
            }
        }

        if(boardInd != -1 && deboardInd != -1 && deboardInd > boardInd){
            return (deboardInd - boardInd)*5;
        }
        else{
            return -1;
        }
    }
    
    public static void main(String[] args) {
        System.out.println("\nWelcome to TSRTC City Services - Hyderabad");
        System.out.println("----------------------------------------------");
        System.out.println("  || We care for your transportation  ||");
        System.out.println("----------------------------------------------");
        System.out.println("This city bus starts from Gangaram and goes till KPHB Colony.");
        System.out.println("The bus halts at following bus stops:\n");
        System.out.println("1.Gangaram; 2.Madinaguda; 3.St.Anns; 4.Allwyn X Roads; 5.Miyapur X Roads;\n 6.Miyapur Metro; 7.Hydernagar; 8.Nizampet X Roads; 9.JNTU College; 10. KPHB Colony");

        System.out.println("Enter your sex: (either F or M)");
        Scanner s0 = new Scanner(System.in);
        String sex = s0.nextLine();

        if(sex.equals("M")){
            //taking input of boarding point
            System.out.println("\nEnter your boarding point: ");
            Scanner s1 = new Scanner(System.in);
            String boardPt = s1.nextLine();

            //taking input of de-boarding point
            System.out.println("\nEnter the de-boarding point: ");
            Scanner s2 = new Scanner(System.in);
            String deboardPt = s2.nextLine();

            int fare = getFare(boardPt, deboardPt);

            if(fare != -1){
                System.out.println("\nYour ticket price from " + boardPt + " to " + deboardPt + " is Rs." + fare);
                System.out.println("\nEnter your payment mode: ");
                System.out.println("1.Cash \n2.Bank Transfer \n3.UPI");
                Scanner s3 = new Scanner(System.in);
                int pay = s3.nextInt();
                if(pay == 1){
                    System.out.println("\nPlease pay in cash, to the respective bus conductor.");
                }
                else if(pay == 2){
                    System.out.println("\nThe bank details are: \nBank Name: HDFC Bank \nAccount Number: 212231325449 \nIFSC Code: HDF04668448");
                }
                else{
                    System.out.println("\nPlease pay on the UPI ID: sonata@googlepay.okhdfcbank");
                }
            }
            else{
                System.out.println("Please check your entry in boarding point and de-boarding point");
            }
        } else {
            //taking input of boarding point
            System.out.println("\nEnter your boarding point: ");
            Scanner s1 = new Scanner(System.in);
            String boardPt = s1.nextLine();

            //taking input of de-boarding point
            System.out.println("\nEnter the de-boarding point: ");
            Scanner s2 = new Scanner(System.in);
            String deboardPt = s2.nextLine();

            System.out.println("\nFemales are being offered free tickets.");
            System.out.println("Your ticket price from " + boardPt + " to " + deboardPt + " is Rs. 0");
        }
       System.out.println("\nThank you for choosing TSRTC");
       
    }
}
