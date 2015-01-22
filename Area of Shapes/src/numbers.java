/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
@author Thomas Thompson
 */
import java.util.*;
class numbers{
public static void main(String args[]){
cube();
sphere();
circle();

}
public static void cube(){
Scanner input = new Scanner(System.in);
    System.out.printf("\nEnter length of cube: \n");
double length = input.nextDouble();
double volumeCube=length*length*length;
System.out.printf("Area of Cube is: \n" +volumeCube);
}
public static void sphere(){
Scanner input = new Scanner(System.in);
System.out.printf("\nEnter radius of circle: \n");
double radius = input.nextDouble();
double volumeSphere=radius*radius*radius*3.14*(4.0/3.0);
System.out.printf("Area of Sphere is: \n" +volumeSphere);
}
public static void circle(){
    Scanner input = new Scanner(System.in);
System.out.printf("\nEnter radius of circle: \n");
double radius = input.nextDouble();
double areaCircle=radius*radius*3.14;
System.out.printf("\nArea of a circle is: \n" +areaCircle);
}
}