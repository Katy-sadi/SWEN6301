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

    public Rectangle(double height, double lenght, int RectId, String color) {
        this.height = height;
        this.lenght = lenght;
        this.RectId = RectId;
        this.color = color;
    }

    public Rectangle(double height, double lenght, int RectId) {
        this.height = height;
        this.lenght = lenght;
        this.RectId = RectId;
        this.color = "RED";
    }

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

    public void setHeight(double height) {
        this.height = height;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public void setColor(String color) {
        this.color = color;
    }
   
    
    

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


