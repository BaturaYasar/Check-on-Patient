package com.example.oopchallenge;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Patient patient = new Patient("Kebab",23,
                new Eye("Left Eye", "Short sighted","Hazel",true),
                new Eye("Right Eye", "Normal","Hazel", true),
                new Heart("Heart","Normal",65),
                new Stomach("Stomach", "PUD",true),
                new Skin("Skin","Burned","Pink", 20));
        System.out.println("Name: " + patient.getName());
        System.out.println("Age: " + patient.getAge());

        Scanner scanner = new Scanner(System.in);

        boolean shouldFinish = false;

        while (!shouldFinish){
            System.out.println("Choose an Organ:" +
                    "\n\t1. Left Eye" +
                    "\n\t2. Right Eye" +
                    "\n\t3. Heart" +
                    "\n\t4. Stomach" +
                    "\n\t5. Skin" +
                    "\n\t6. Quit");

            int userChoice = scanner.nextInt();

            switch (userChoice){
                case 1:
                    patient.getLeftEye().getDetails();
                    if (patient.getLeftEye().isOpened()){
                        System.out.println("\t\t1. Close the eye");
                        if (scanner.nextInt() == 1){
                            patient.getLeftEye().close();
                        }else{
                            continue;
                        }
                    }else{
                        System.out.println("\t\t1. Open the eye");
                        if (scanner.nextInt() == 1){
                            patient.getLeftEye().open();
                        }
                    }
                    break;
                case 2:
                    patient.getRightEye().getDetails();
                    if (patient.getRightEye().isOpened()){
                        System.out.println("\t\t1. Close the eye");
                        if (scanner.nextInt() == 1){
                            patient.getRightEye().close();
                        }else{
                            continue;
                        }
                    }else{
                        System.out.println("\t\t1. Open the eye");
                        if (scanner.nextInt() == 1){
                            patient.getRightEye().open();
                        }
                    }
                    break;
                case 3:
                    patient.getHeart().getDetails();
                    System.out.println("\t\t1. Change the heart rate");
                    if (scanner.nextInt() == 1){
                        System.out.println("Enter the new heart rate: ");
                        int newHeartRate = scanner.nextInt();
                        patient.getHeart().setRate(newHeartRate);
                        System.out.println("The new heart rate: " + newHeartRate);
                    }else{
                        continue;
                    }
                    break;
                case 4:
                    patient.getStomach().getDetails();
                    System.out.println("\t\t1. Digest");
                    if (scanner.nextInt() == 1){
                        patient.getStomach().digest();
                    }else{
                        continue;
                    }
                    break;
                case 5:
                    patient.getSkin().getDetails();
                    break;
                default:
                    shouldFinish = true;
                    break;
            }
        }
    }
}
