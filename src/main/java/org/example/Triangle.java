package org.example;

public class Triangle {

    public static double areaTriangle(int a, int b, int c){
        double s = (a + b + c)/2;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return area;
    }

    public static void main(String[] args) {
        System.out.println(areaTriangle(4,4,5));
    }

}
