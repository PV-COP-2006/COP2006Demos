import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

class Main {
  
  public static Scanner scan = new Scanner(System.in);
 
  
  public static void main(String[] args) throws java.lang.Exception {  
    
	  System.out.println("Enter the module you would like to run");
    
	  Module01Process.do1(scan); // Hello World
    //Module02Elements.do2(scan); // Data Types, Input, Variables, Strings basics
    //Module03Branching.do3(scan); // Operators, Condition Statements and Branching
    //Module04Methods.do4(scan); // Classes and Methods
    //Module05Classes.do5(scan); // Classes and Objects
    //Module06Loops.do6(scan); // Loops
    //Module07Arrays.do7(scan); // Arrays
    //Module08Strings.do8(scan); // More Strings
    //Module09TwoD.do9(scan); // 2d Arrays, ArrayLists, Generics, & Linked Lists
    //Module10Oop.do10(scan); // Inheritance and Polymorphism
    //Module11Exceptions.do11(scan); // Exceptions
    Module12DataStructures.do12(scan); // Dictionaries, Maps, Stacks, Recursion
    //Module13Quality.do13(scan); // Javadoc, SpotBugs, Checkstyle
    Java8Tester.java8demo();
    //scan.close();
  }

}
