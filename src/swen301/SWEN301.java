/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swen301;

/**
 *
 * @author Katy
 */
public class SWEN301 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int Id=0;
        double sum1,sum2,area1,area2,area3,area4,area5;
        //Triangles Declaration
        Triangle T1= new Triangle(3.0,4.0, 5.0,Id++);
        Triangle T2= new Triangle(6.0,8.0,10.0,Id++,"RED");
        Triangle T3= new Triangle(5.0,12.0, 13.0,Id++,"PINK");
        //Rectangle Declaration
        Rectangle Rec1=new Rectangle(3.0, 5.0, Id++);
        Rectangle Rec2=new Rectangle(5.0, 8.0, Id++, "WHITE");
        //Display basic Information for Triangles
        System.out.println("The Information for each Triangle:");
        System.out.println(T1.toString()+"\n");
        System.out.println(T2.toString()+"\n");
        System.out.println(T3.toString()+"\n");
        System.out.println("*******************************");
        //Display basic Information for Rectangles
        //Display basic Information for Triangles
        System.out.println("The Information for each Rectangle:");
        System.out.println(Rec1.toString()+"\n");
        System.out.println(Rec2.toString()+"\n");
        System.out.println("*******************************");
        //Calculate Area for each Shape
        area1=T1.getArea();
        area2=T2.getArea();
        area3=T3.getArea();
        area4=Rec1.getArea();
        area5= Rec2.getArea();
        //Printing the Area for each Shape
        System.out.println("The Area of T1 is:\t"+area1);
        System.out.println("The Area of T2 is:\t"+area2);
        System.out.println("The Area of T3 is:\t"+area3);
        System.out.println("The Area of Rec1 is:\t"+area4);
        System.out.println("The Area of Rec2 is:\t"+area5);
        System.out.println("*******************************");
        //Using Compare Methods
        System.out.println("\nComparing Between T3 & T2\t"+T3.compareTo(T2)+"\n *******************************\n");
        System.out.println("Compare between the area of Rec2 and T2\t"+ Rec2.compareAreaWithTriangle(T2));
        //Use Sum of two areas from Triangle        
        System.out.println("*******************************");
        sum1=T1.findSumOfAreasForTwoTriangles(T3);
        sum2=T3.findSumOfAreasForTwoTriangles(area2);
        System.out.println("The First Result Using Instance of Object\t"+sum1);
        System.out.println("The First Result Using the value from the object\t"+sum2);
      
    }
    
}
