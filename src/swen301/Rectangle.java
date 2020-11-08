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

public class Rectangle extends TwoDimensionalShape implements ShapesOperations<Rectangle>{
    private double height,lenght;
    private int RectId;
    private String color;
    
    //The first constructor with values from the user, no default value

    public Rectangle(double height, double lenght, int RectId, String color) {
        this.height = height;
        this.lenght = lenght;
        this.RectId = RectId;
        this.color = color;
    }
    
    /*The second constructor there is one default value which is the color, the user can create object of rectangle by 
    entering the height, lenght and the ID */

    public Rectangle(double height, double lenght, int RectId) {
        this.height = height;
        this.lenght = lenght;
        this.RectId = RectId;
        this.color = "RED";
    }
    
    //getter methods

    public double getHeight() {
        return height;
    }

    public double getLenght() {
        return lenght;
    }

    public int getRectId() {
        return RectId;
    }

    public String getColor() {
        return color;
    }
    
    //Setter methods, But the ID can't be changed after the object is created

    public void setHeight(double height) {
        this.height = height;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public void setColor(String color) {
        this.color = color;
    }
   
    
    //Implementing the Methods from the base class
    //here we can see that the result will be differerent comparing it to the Triangle class
    //So each Class that is extended from the base class will implement the methods in a different way
    

    @Override
    public int getNumberOfSides() {
        return 4;
    }

    @Override
    public double getArea() {
        double res=this.getHeight()*this.getLenght();
        return res;
    }

    @Override
    public double getPerimeter() {
         double res=(2*this.getHeight())+(2*this.getLenght());
        return res;
    }

    @Override
    public String toString() {
        return "The Id of the Rectangle is:\t"+this.getRectId() +
                "\nThe Height & Length respectivly:\t"+this.getHeight()+" , "+this.getLenght()
                +"\nThe Color of the Rectangle is:\t"+this.getColor()+
                "\nFor more information you can use the methods\n";
    }
    
    
    //Implementing the Methods from the Interface that I've created

    @Override
    public int compareArea(Rectangle o) {
        double area1=this.getArea();
        double area2=o.getArea();
        int cmp;
        if(area1 > area2)
            cmp=1;
        else if(area1 == area2)
            cmp=0;
        else cmp=-1;
        return cmp;
    }

    @Override
    public int comparePerimeter(Rectangle o) {
        double per1=this.getPerimeter();
        double per2=o.getPerimeter();
        int cmp;
        if(per1 > per2)
            cmp=1;
        else if(per1 == per2)
            cmp=0;
        else cmp=-1;
        return cmp;
    }
    
    
    // In this Method I've compared the areas of two different objects, 
    //the first is Rectangle the other is Triangle
    public int compareAreaWithTriangle(Triangle Tr){
        double TriArea= Tr.getArea();
        double RecArea=this.getArea();
        int cmp;
        if(RecArea > TriArea)
            cmp=1;
        else if(RecArea == TriArea)
            cmp=0;
        else cmp=-1;
        return cmp;
    }
}


