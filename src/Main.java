port java.util.Scanner;

public class Main {public static void main(String[] args) {Scanner scnr = new Scanner(System.in); System.out.println("Input a number: "); int number = scnr.nextInt(); if (isEven(number)) {System.out.println("Your number is even!");} else {System.out.println("Your number is odd!");}}}
