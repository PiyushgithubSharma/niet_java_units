                // Introduction and feature of abstraction
// abstraction is a process of hiding the implementation details from the user 
// only the highlight set of services provided yo the user
                    //example=> we drive a car so we can see stearing gear break etc but not internal functions
                    //(  we dont se how they work)
                    // advantage of abstraction
// 1) Security                              2) Enhancement  (hide the internal code)
                    // implement of abstraction
// 1) abstract class            (2) interface => interface give 100% abstraction

                    // abstract class

// abstract method:- a method which don't have body(no implementtation)
// abstract method should be declared in side abstract class so we can say that a class which have abstract method
// the class should be abstract class
// abstract class cannot be instantiated so we can not creat it's object

                    // abstract class
/*
abstract class Vehicle{
    int no_f_tyres;
    abstract void start();      // in the abstract method we can not write body 
                                //the body should be written in extend class's method 
}
class Car extends Vehicle{
    void start(){
        System.out.println("car start with key");   // * if ragular class extends abstract class so class
                                                        // implement all abstract methods
    }

}
class Bike extends Vehicle{
    void start(){
        System.out.println("bike stat with kick");
    }
}

public class Unit1 {
    public static void main(String[]args){
        Bike b1 = new Bike();
        b1.start();
        Car c1 = new Car();
        c1.start();
    }
}
*/

                        // abstract class
/*
abstract class Animal{
    String animal_na;
    abstract void eat();
}
class monkey extends Animal{
    void eat(){
        System.out.println("monkey like banaba");
        System.out.println("elephent like banana");

    }
}
class elephent extends monkey{
    void eat(){}

}
public class Unit1{
    public static void main(String[]args){
        monkey m1 = new monkey();
        m1.eat();
        elephent E1 = new elephent();
        E1.eat();
    }
}
*/


                        // even odd and prime number
/*
import java.util.*;
abstract class Number{
    Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        abstract void check();
        }
class E_number extends Number{
    void check(){
        for(int i=2;i<=num/2;i++){
        if (num%i==0){
            System.out.println("number is not prime");
            System.out.println("the number should be even and odd");
        }
     if(num%i!=0){
            System.out.println("number is odd number");
            System.out.println("number is prime");
        }
    }
}
}
public class Unit1{
    public static void main(String[]args){
        Number n1 = new E_number();
        n1.check();

    }
}
*/

                    // Interface
// interface contain only abstract method not simple(concrete) method
// to achive interface java provides a keywords called implements
// (1) it is used to achive abstraction
// (2) it support multiple inheritance
// (3) it can be used to achive (loose coupling)

                            // Note:
// (1) interface methods are by default public & abstract
// (2) interface variable are by default public+static + final
// (3) interface method must be overriden inside the implement class

                    // input and output program for clint
/*
import java.util.*;

import javax.swing.plaf.synth.SynthToggleButtonUI;
interface client{
    void input();       // default public + abstract
    void outut();          // by default publilc and abstract

}
class programmer implements client{
    String name; double sal;
    //void input()        // here take by default "default" modifier which is smaller then public
    public void input()     // here necessury to use equal or bid modifier then interface
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter user name: ");
        name = sc.nextLine();
        System.out.println("Enter salary: ");
        sal = sc.nextDouble();
    }
    public void output(){       // same or greater modifier requare which is public
        System.out.println(name+" "+sal);
    }

    public static void main(String[]args){
        programmer c = new programmer();
        c.input();
        c.output();
    }
}
*/


/*
import java.util.*;
interface Animal{
    void live();       // by-default public and abstract method
    void food();    // by-default public and abstract method
    void info();
}
class Fish implements Animal{
        String name; String FoodType;
        Scanner sc = new Scanner (System.in);
public void live(){
    System.out.println("Fish is");
    name = sc.nextLine();
}
public void food(){
    System.out.println("food type is: ");
    FoodType = sc.nextLine();

        }

public void info(){
    System.out.println("fish is "+name+" and eat"+FoodType);
}
}
public class Unit1{
    public static void main(String[]args){
        Fish F1 = new Fish();
        F1.live();
        F1.food();
        F1.info();
    }
}
*/

                            // Encapsulations

// encapsulation is a mechnishm through which we can wrapping the data
// memeber and member methods of class in a single class

    // NOTE:- (1) Declare the class variables as a private
                // (2) Declare the class method as a public 


/*
class A{
    private int value;      // a private varible for hiding
//}
public void setValue(int x){     // a setter method and x is variable for store
value =x;
}
public int getValue(){
    //return ++value;        for updated value  `   
    return value;

}
}
public class Unit1{
    public static void main(String[] args){
        A obj = new A();
        //obj.value=100;      // set the value but not add becase this is out of class ("}" this sigh in class a)
        obj.setValue(1456);  // for set value we use setter method
        System.out.println(obj.getValue());  // for call we use getter method
    }
}
*/

                // Polymorphism

// polymorphism  made by 'poly' and 'morphism'
// poly means many and morphism means form = many form
//  polymorphishm has two type
// (1) compile time polymorphism                (2) run time polymorphism


//(1) compile time polymorphism:- A polymorphism which exit at the time of compilation
// example :- method overloading
//when a class has same name of method but diff type of parameters 
// Syntex:- return_type_name(par1)
//         :-return_type_name(para1,para2)


/*
class A{
    void add(){
        int a=10,b=40,c;
        c=a+b;
        System.out.println("user define varible "+c);
    }
    void add(int x,int y){   // diff name 
        int c;
        c = x+y;
        System.out.println("method with diff variable a and b"+c);
    }
    void add(int a,double b){
        double c;
        c=a+b;
        System.out.println("method with diff type of variable "+c);

    }
}
public class Unit1{
    public static void main(String[]args){
    A obj = new A();
    obj.add(2,3);
    obj.add();
    obj.add(10,5.6);
 }
}
*/

                        // overriding

// Rintime Polymorphism:-   A polymorphism which exists at the time of execution of program
//ex:- method overriding
// whenever we write method in super and sub class in such a way
// that method name and parameter same so this called method overriding
//example:- 

/*
class A{
            void show(){
                System.out.println("in method of class A");
            }
}
class B extends A{
    void show(){
        System.out.println("in method of class B");

    }
}
public class Unit1{
public static void main(String[]args){
    A obj_A=new A();
    B obj_B=new B();
    obj_A.show();
    obj_B.show();

}
}
*/

                        // Decision making (conditions statements)
// we have two type of statment     (1) if              (2) switch statement


// (1) simple if statment:- it is used when we want to check a condition
// Syntex: if(condition) {}

/*
import java.util.*;
public class Unit1{
    public static void main(String[]args){
        int age;
        System.out.println("Enter your age");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        if(age>=18){
            System.out.println("eligible for votes");
        }
        System.out.println("thanks you");
    }
}
*/

            // if else
// it is used to execute two statment either if or else
// Syntex:- if(condition){}
            // else(condition){}

/*
import java.util.*;
public class Unit1{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int age;
        age = sc.nextInt();
        if(age>18){
            System.out.println("eligible for vote");
        }
        else{
            System.out.println("not eligible for vote");}
    }
}
*/

                // else if ladder

/*                 import java.util.*;
public class Unit1{
    public static void main(String[]args){
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        if(num%2==0){
            System.out.println("number is even and divide by two:");
        }
        else if(num%3==0){
            System.out.println("number is divide by 3");
        }
        else if(num%5==0){
            System.out.println("number is divide by 5");
        }
        else{
            System.out.println("number is not divide by 2,3,and 4");
        }

    }
}
*/

                    // nested loop
/*
import java.util.*;

import javax.sound.midi.Soundbank;
public class Unit1{
    public static void main(String[]args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number ");
        n = sc.nextInt();
        if (n%2==0){
            if(n%5==0){
                System.out.println("the number shout be divide by 2 AND 5 so also divide by 10");
            }
            else{
                System.out.println("divide by only 2");
            }
        }
        else{
            System.out.println("number is not divide by 2 and 5 so number is odd");
        }

    }
}
*/


                    // switch loop

/*
import java.util.*;
public class Unit1{
    public static void main(String[]args){
        Scanner sc  = new Scanner(System.in);
        int button = sc.nextInt();
        switch(button){
        case 1:     System.out.println("hello: on click 1");
        break;
        
        case 2:
         System.out.println("on click 2");
         break;
         
        
        case 3:  System.out.println("on click 3");
        break;
        
        default:    System.out.println("on click other than 1,2,3");
        break;
    }
    }
}
*/

                    //looping

// whenever we have to repeat certain statement saveral time

/*
import java.util.*;
public class Unit1{
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.println("print number of row");
        int R = sc.nextInt();
        for(int i=0;i<=R-1;i++){
            for (int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
*/


                                // ARgument passing
//for call many parameter we use  function_name(int ... a)
// insort we use overloading 


/*class A{
    void add(int ... a){        // array variable
        int sum=0;
        for(int x: a){          // here we use for each loop for add this
            sum =sum+x;     
        }
        System.out.println("sum of number "+sum);

    }
}
public class Unit1{
    public static void main(String[]args){
        A obj_A= new A();
        obj_A.add(2);
        obj_A.add(3,4);
        obj_A.add(3,4,5);
    }
}
*/


                    // command line argument

  // command line argument are argument that is pass at the time of running of code 
  // command line argument are pass by the concole and recive by the code as the input 

  // example:=\  taking only one argment for running
/*
public class Unit1{
    public static void main(String[] args) {
        System.out.println("arguments "+args[1]);
    }
}
*/


/*
class CommandLineExample{  
public static void main(String args[]){  
System.out.println("Your first argument is: "+args[0]);  
}  
}  
*/

                    // many argument

class manyArg{
    public static void main(String[] args) {
        for(int i=0;i<args.length;i++)
        {
        System.out.println("many argument "+args[i]);
    }
    }
}












