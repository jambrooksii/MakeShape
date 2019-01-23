package com.company;

import java.util.Scanner;

public class MakeShape {

    public static void main(String[] args) {
        // write your code here
        Circle myCircle = new Circle();
        Triangle myTriangle = new Triangle();
        Scanner shape = new Scanner(System.in);
        System.out.println("What Type of Shape would you like to make  " + "\n" + "Click [1] for Circle" + "\n" + "Click [2] for Triangle" +
                "\n" + "Click [3] for Square");
        int userShape = shape.nextInt();
        if (userShape == 1) {
            System.out.println("Please enter Circle Diameter");
            double userDiameter = shape.nextInt();
            myCircle.setDiameter(userDiameter);
            double userRadius = shape.nextDouble();
            myCircle.setRadius(userRadius);
            double userCircumference = shape.nextDouble();
            myCircle.setCircumference(userCircumference);

            System.out.println("Your Circle's Circumference is " + myCircle.getCircumference() + " radius is " + myCircle.getRadius() + " and the diameter is " + myCircle.getDiameter());
        }else if(userShape == 2) {
            System.out.println("Please enter Circle Triangle");
            double userheight1 = shape.nextDouble();
            myTriangle.getHeight1(userheight1);
            double userRadius = shape.nextDouble();
            myCircle.setRadius(userRadius);
            double userCircumference = shape.nextDouble();
            myCircle.setCircumference(userCircumference);
    }
}
