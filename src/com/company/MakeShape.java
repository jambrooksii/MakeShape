package com.company;

import java.util.Scanner;

public class MakeShape {

    public static void main(String[] args) {


        // write your code here

        boolean again = false;
        do {
            Circle myCircle = new Circle();
            Triangle myTriangle = new Triangle();
            Square mySquare = new Square();
            Scanner shape = new Scanner(System.in);
            System.out.println("What Type of Shape would you like to make  " + "\n" + "Click [1] for Circle" + "\n" + "Click [2] for Triangle" +
                    "\n" + "Click [3] for Square");
            int userShape = shape.nextInt();
            if (userShape == 1) {
                System.out.println("Please enter Circle Diameter");
                double userDiameter = shape.nextInt();
                myCircle.setDiameter(userDiameter);
                System.out.println("Please enter Circle Radius");
                double userRadius = shape.nextDouble();
                myCircle.setRadius(userRadius);
                System.out.println("Please enter Circle Circumference");
                double userCircumference = shape.nextDouble();
                myCircle.setCircumference(userCircumference);

                System.out.println("Your Circle's Circumference is " + myCircle.getCircumference() + " radius is " + myCircle.getRadius() + " and the diameter is " + myCircle.getDiameter());
            } else if (userShape == 2) {
                System.out.println("Please enter Triangle side A length");
                double userHeight1 = shape.nextDouble();
                myTriangle.setHeight1(userHeight1);
                System.out.println("Please enter Triangle side B length");
                double userHeight2 = shape.nextDouble();
                myTriangle.setHeight2(userHeight2);
                System.out.println("Please Enter Triangle Base ");
                double userBase = shape.nextDouble();
                myTriangle.setBase(userBase);

                System.out.println("Your Triangle is " + myTriangle.getHeight1() + " by " + myTriangle.getHeight2() + " by " + myTriangle.getBase());
            } else if (userShape == 3) {
                System.out.println("Please enter the height of the Square ");
                double squareHeight = shape.nextDouble();
                mySquare.setHeight(squareHeight);
                System.out.println("Please enter Square length");
                double squareLength1 = shape.nextDouble();
                mySquare.setLength1(squareLength1);

                System.out.println("Your Square is " + mySquare.getHeight() + " by " + mySquare.getLength1());
            }

            System.out.println("Do you want to build another shape?" + "\n" + " Click [1] for yes " + "\n" + " Click [2] for No" );
            int playAgain = shape.nextInt();
                    if(playAgain == 1){
                        again = true;
                    }else if(playAgain == 2){
                        again = false;
                    }
        }while(again == true);
    }
}
