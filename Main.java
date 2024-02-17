package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите a:");
        int a = s.nextInt();
        System.out.println("Введите b:");
        int b = s.nextInt();
        System.out.println("Введите c:");
        int c = s.nextInt();
        if (a * a + b * b == c * c || b * b + c * c == a * a || c * c + a * a == b * b){
            System.out.println("a, b и c являются сторонами прямоугольного треугольника");
        }
        else if(a == b && b == c) {
            System.out.println("a, b и c являются сторонами равностороннего треугольника");
        }
        else if (a == b || b == c || c == a){
            System.out.println("a, b и c являются сторонами равнобедренного треугольника");
        }
        else if (a + b <= c || b + c <= a || c + a <= b) {
            System.out.println("a, b и c не являются сторонами треугольника");
        }
        else {
            System.out.println("a, b и c являются сторонами обычного треугольника");
        }
        s.close();
    }
}