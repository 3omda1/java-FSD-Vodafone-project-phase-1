import java.util.Scanner;

 class Ahmed_Program {
    public static void main(String[] args) {

        Welcome.welcomeMessage();
        Menu.mainMenu();


    }
}

class Welcome {
    public static void welcomeMessage() {

        System.out.println("Welcome to my program ");
        System.out.println("Developed by Ahmed EamdEldin :) \n");
        System.out.println("Enter your directory");
        Scanner read = new Scanner(System.in);
        String dir = read.nextLine(); 


        System.out.println("Your current working directory is "+dir  + "\n"  ) ;

    }

}

class Menu {
    public static void mainMenu() {
        System.out.println("1 - Create file");
        System.out.println("2 - Delete file");
        System.out.println("3 - Search between files");
        System.out.println("4 - Change directory");
        System.out.println("5 - Exit");

        
    }

}















// normal one
// *important
// ! not to do so
// ? how to solve this
// TODO: refactor the code

// class Converter {
// public static String toBinary(int num) {
// String binary = "";
// while(num > 0) {
// binary = (num % 2) + binary;
// num /= 2;
// }
// return binary;
// }
// }

// CTRL + SHIFT + I ---> TO ARRANGE YOUR CODE

// Good ideas
// public class Program
// {
// public static void main(String[] args) {
// int day = 2;
// String dayType = switch(day) {
// case 1, 2, 3, 4, 5 -> "Working day";
// case 6, 7 -> "Weekend";
// default -> "Invalid day";
// };
// System.out.println(dayType);
// }
// }
// -----------------------------------------------------------
// Switch statement without using break
// int day = 2;
// String dayType = switch(day) {
// case 1, 2, 3, 4, 5 -> "Working day";
// case 6, 7 -> "Weekend";
// default -> "Invalid day";
// };
// System.out.println(dayType);
// -----------------------------------------------------------
// Scanner scanner = new Scanner(System.in);
// int number = scanner.nextInt();
// int fact =1;
// //your code goes here
// while(number>0){
// fact=fact*number--;
// }
// System.out.println(fact);
// }
// -----------------------------------------------------------
// MY FIRST FOR LOOP
// Scanner scanner = new Scanner(System.in);
// int n = scanner.nextInt();
// int y = 0 ;
// for(y=0;y<n;y++){
// System.out.println("Welcome");
// }
// -----------------------------------------------------------
// public static void main(String[] args) {
// Scanner read = new Scanner(System.in);
// int right_password = 8819;
// int password;
// do{

// System.out.println("Please Enter your passwrod") ;
// // Scanner pass = new Scanner(System.in);
// password = read.nextInt();

// } while(password!=right_password);
// }
// ------------------------------------------------------------------------------------------------------------------------------
// Loan Calculator
// You take a loan from a friend and need to calculate how much you will owe him
// after 3 months.
// You are going to pay him back 10% of the remaining loan amount each month.
// Create a program that takes the loan amount as input, calculates and outputs
// the remaining amount after 3 months.

// Sample Input:
// 20000

// Sample Output:
// 14580

// Here is the monthly payment schedule:
// Month 1
// Payment: 10% of 20000 = 2000
// Remaining amount: 18000
// Month 2
// Payment: 10% of 18000 = 1800
// Remaining amount: 16200
// Month 3:
// Payment: 10% of 16200 = 1620
// Remaining amount: 14580

// System.out.println("Please Enter your desired loan amount");
// Scanner scanner = new Scanner(System.in);
// int amount = scanner.nextInt();

// //your code goes here
// int remaining=0;
// int remaining2=0;
// int remaining3=0;
// int x= 0;
// for(x=0;x<3;x++){
// remaining = amount -( amount*10/100);
// remaining2 = remaining - (remaining*10/100);
// remaining3 = remaining2 - (remaining2*10/100);
// // System.out.println("Your Remaining amount after 3 months is " +
// remaining);
// // System.out.println("Your Remaining amount after 3 months is " +
// remaining2);
// // System.out.println("Your Remaining amount after 3 months is " +
// remaining3);
// } System.out.println("Your Remaining amount after 3 months is " +
// remaining3);
// // do {
// // remaining = amount -( amount*10/100);
// // x++;

// // } while(x<3);
// // System.out.println("Your Remaining amount after 3 months is " +
// remaining);

// // for (int x=0;x<3;x++){
// // remaining = amount*10/100;
// // }
// // System.out.println("Your Remaining amount after 3 months is " +
// remaining);
// ------------------------------------------------------------------------------------------------------------------------------
// You are given a program that takes the length of the array as the first
// input, creates it, and then takes the next inputs as elements of the array.

// Complete the program to go through the array and calculate the sum of the
// numbers that are multiples of 4.

// Sample Input
// 5
// 4
// 9
// 16
// 2
// 7

// Sample Output
// 20

// Scanner scanner = new Scanner(System.in);
// int length = scanner.nextInt();
// int[] array = new int[length];
// for (int i = 0; i < length; i++) {
// array[i] = scanner.nextInt();
// }
// int x = 0;
// int sum = 0;
// for (x=0;x<array.length;x++) {
// if (array[x]%4==0)
// {
// sum = sum + array[x];

// }
// }
// System.out.println(sum);
// ------------------------------------------------------------------------------------------------------------------------------
// Your company is writing a program for a geometry course.
// The program takes the number of squares as the first input, creates an array,
// and then takes the sides of squares as its elements.
// Write the part of the program that receives a list of square sides and prints
// the area of those squares for the user.

// Sample Input
// 2
// 3
// 4

// Output
// 9
// 16

// Scanner scanner = new Scanner(System.in);
// int length = scanner.nextInt();
// int[] sides = new int[length];
// for (int i = 0; i < length; i++) {
// sides[i] = scanner.nextInt();
// }
// for(int t: sides){
// System.out.println(t*t);
// }
// ------------------------------------------------------------------------------------------------------------------------------
// public class Main {
// public static void main(String[] args) {
// // char myVar1 = 60, myVar2 = 6, myVar3 = 67;
// // System.out.println(myVar1);
// // System.out.println(myVar2);
// // System.out.println(myVar3);

// for (char x=0; x<200;x++)
// {
// System.out.print(x+0 + " - ") ;
// System.out.println(x) ;

// }
// }
// }
// ------------------------------------------------------------------------------------------------------------------------------
// public class Main {
// public static void main(String[] args) {
// // Outer loop.
// for (int i = 1; i <= 2; i++) {
// System.out.println("Outer: " + i); // Executes 2 times

// // Inner loop
// for (int j = 1; j <= 3; j++) {
// System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
// }
// }
// }
// }
// ------------------------------------------------------------------------------------------------------------------------------
// int[][] matrix = {
// {8, 1, 6},
// {3, 5, 7},
// {4, 9, 0},
// };
// for (int x=0;x<matrix.length;x++){

// for(int y=0;y<matrix[x].length;y++){
// System.out.println(matrix[x][y]);
// }

// }
// ------------------------------------------------------------------------------------------------------------------------------
// Scanner scanner = new Scanner(System.in);
// String text = scanner.nextLine();
// char[] arr = text.toCharArray();

// //your code goes here
// for(int i=arr.length-1;i>=0;i--){
// System.out.println(arr[i]);
// };
// ------------------------------------------------------------------------------------------------------------------------------
// OOP
// class Main {
// public static void main(String[] args) {
// // create a Loading object
// // Loading obj = new Loading();
// // obj.LoadingMessage();
// // System.out.println(obj.x);
// //------------------------------------------
// // Test testObj = new Test();
// // testObj.TestMethod();
// // System.out.println(testObj.test);
// }
// }

// class Test{
// String test = "this is the test string";
// public void TestMethod(){
// System.out.println("this is the test method");
// }
// }
// class Loading {
// //complete the class, add LoadingMessage() method
// int x = 10;
// public void LoadingMessage(){

// System.out.println("Loading");
// }
// }
// ------------------------------------------------------------------------------------------------------------------------------
// BINARY CONVENTOR PROJECT
// import java.util.Scanner;

// class Program {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int x = sc.nextInt();

// System.out.print(Converter.toBinary(x));
// }
// }

// class Converter {

// public static String toBinary(int x){

// String binary="";
// int num = x;
// while(num > 0) {
// binary = (num%2)+binary;
// num /= 2;
// }

// return binary;
// }

// }
// ------------------------------------------------------------------------------------------------------------------------------
// Polymorphism
// class Main {
// public static void main(String[] args) {
// Vehicle vehicle = new Vehicle();
// Vehicle electric = new ElectricVehicle();
// Vehicle hybrid = new HybridVehicle();

// //calls
// vehicle.start();
// vehicle.resource();
// electric.start();
// electric.resource();
// hybrid.start();
// hybrid.resource();
// }
// }
// class Vehicle{
// public void start(){
// System.out.println("Starting");
// }
// public void resource(){
// System.out.println("I use petrol");
// }}
// class ElectricVehicle extends Vehicle{
// /*reimplement resource() method
// to output "I use electricity"*/
// public void resource(){
// System.out.println("I use electricity");
// }}
// class HybridVehicle extends Vehicle{
// /*reimplement resource() method
// to output "I use both petrol and electricity"*/
// public void resource(){
// System.out.println("I use both petrol and electricity"); }}

// ------------------------------------------------------------------------------------------------------------------------------
