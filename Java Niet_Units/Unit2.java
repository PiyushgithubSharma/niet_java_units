                    //object refrence
//when we declare the variable of class. then it is treated as refrence in java
// in java refrence holds base address of an object and it refer to the object

                            //Constructor
// constructor is a block(similar to method)
                    //(1) having same name as of class name
                    //(2) constructor not have return type even void also
                    //(3) the only modifier applicable for constructor is public , protected , default and private
                    //(4) it execute automatically when we create object
    // default constructor

/*
class Student{
void detail(){
String name;       // refrence variable
int roll;       // and also make default constructor  and put ther default values
            

}
 public static void main(String[] args) {
        Student s1 = new Student();
        s1.detail();
        
        
    }
}
*/

                        // constructor have three types
            //(1) default constructor(no-arg constructor)       (2)non-arg constructor(by user define)              (3) parametrized cons


//(1) default constructor:- this constructor create by compiler (Jvm) here the all valeue are by-defaul set
/*
class A{
    int i;      // here compiler crete constructor by default and give value =0
    String name;         // here compiler crete constructor by default and give value =null
    public static void main(String[] args) {
        A obj=new A();
        System.out.println(obj.i);
        System.out.println(obj.name);
    }
}
*/


//(2) NOn-arg constructor:- when we crete constructor and dont pass any argument these type called  no argument define by user define
/*class Student{
    Student()     // no argument constructor by user define
     {
        System.out.println("no arg constructor by user define");
        }
        public static void main(String[]args){
            Student s1=new Student();
        }
}
*/

        // parametrazed constructor
// (3) constructor create by progrmmer

/*
class Student{
    int roll;
    String name;
    Student(String name,int roll){
        System.out.println("parameterized constructor");
        System.out.println(name+" "+ roll);
    }
    public static void main(String[] args) {
        Student s1 = new Student("piyush", 0224);
          
    }
}
*/


                    // abstract class
// in the abstraction the subclass take property of main class
// it is comparsally that every abstract class have abstract mathod



/*
abstract class Human{
    abstract void info();{}
}
class Student extends Human{
    void info(){
    String passion = "Student";
    String name="piyush";
    int roll = 224;
    System.out.println(passion);
    System.out.println(name);
    System.out.println(roll);
    }
}
public class Unit2{
    public static void main(String[]args){
        Human h1 = new Student();
        h1.info();
    }
}
*/



/*
abstract class man{
    abstract void body_parts();{}           // dont write body for this abstract method
}
class parts_name extends man{
    void body_parts(){          // write here body of abstract class (in extends or sub class)
    String t1="hand";
    String t2 = "ear";
    String t3 = "fingure"; 
    System.out.println("the bodyparts are: "+t1+" "+t2+" "+t3);
}
}
class num_parts extends man{
    void body_parts(){
    int t1 = 2;
    int t2= 2;
    int t3 = 10;
    System.out.println("the number of body parts: "+t1+" "+t2+" "+t3);
}
}
public class Unit2{
    public static void main(String[]args){
        man P_Name= new parts_name();
        P_Name.body_parts();
        man n_parts = new num_parts();
        n_parts.body_parts();

    }
}
*/



                // Interface
// in java multiple inheritance not allow so we use interface and for inherit other class we use implements
// it is used to achive total abstraction
// any class can extend 1 class but can any class implements to infinite number of interface
// it is also use to achive loose coupling


/*interface Animal{
    public void animalsound();
    public void sleep();
}
class cow implements Animal {
    public void animalsound(){
        System.out.println("cow say maaa");
    }
    public void sleep(){
        System.out.println("normally");

    }
}
class Dog implements Animal{
    public void animalsound(){
        System.out.println(" Dog say bhau bhau");

    }
    public void sleep(){
        System.out.println("dog sleep");
    }

}
class cow1 extends cow{
    void eat(){
        System.out.println("cow eat grass");
    }
}
public class Unit2{
    public static void main(String[]args){
        cow c1 = new cow();
        //c1.animalsound();
        //c1.sleep();
        cow1 obj_n = new cow1();
        obj_n.eat();
    }
}
*/


/*
import java.util.*;
interface num{
    final int a=10;
    void display();
}
class Testclass implements num{
    public void display(){
        System.out.println("piyush");
    }
    public static void main(String[]args){
        Testclass t = new Testclass();
        t.display();
        System.out.println(a);
    }
}
*/



/*import java.util.*;

import javax.annotation.processing.SupportedOptions;
import javax.sound.sampled.SourceDataLine;

import Device.mobile;
interface Device{
        abstract class mobile{
            abstract void app();{}
        }
        class Brand extends mobile{
            void app(){
                String app_name="whatsapp";
                int Number=9997543;
                System.out.println(app_name +" "+Number);
                System.out.println("mpbile brand is anroid");
            }
        }

}
class Laptop implements Device{
    void info(){
            String Brand = "hp";
            int Gen= 11;
            System.out.println("laptop implement device");
        }
    }

class Computer implement Device{
    void Details(){
        String Brand ="xyz";
        int year = 2023;
        System.out.println("this also implement Device");

    }

}
public class Unit2 {
    public static void main(String[]args){
    
    }

}
*/


                    // Methods 
//Methods:- method is a group of which take input from the user processed
// it & give output methods runs only when it called

                //Type of method => (1)predefined           (2) user defined

//(1) predefined :- print() , sort(), sqrt(), nextInt()
//(2) userDefined:- any method name is depend on user like add(), sub(), show() etc

//Syntex :- return_type functiom_name(...parameter...){statement}
// use of method:- (1) decrease line of code    (2) redability      (3) repeatation



/*class A{
    public static void main(String[]args){
    }
        void Disp();{       // here error comes because we know that method made inside the class
            System.out.println("hello world");
        }
    }
    */


                    // this keywords
// there can be lot of use of this keywords. this reference variable that refer to current object

/*class A{
    void show(){
        System.out.println(this);
        System.out.println("this in method");               // here for check we make a method and pass this keywords
    }
    public static void main(String[]args){
        A obj = new A();
        System.out.println("normally object's address");
        System.out.println(obj); // output same
        obj.show();                 // here output is same 

    }
}
*/

// (2)this keywords refer variable to instance variable
// whenever the name of instance and local variable are same then our runtime
// enviroment jvm gets confused that which is local variable & which one is instance variable 
// to avoid the problem we should use this keyword

class A{
    int a=12;
    A(int a){
        this.a=a;
    }
    void show(){
        System.out.println("from object to instance variable");
        System.out.println(a);
    }
}
public class Unit2{
    public static void main(String[]args){
        A obj =  new A(100);
        obj.show();
    }
}


//(3) it is used when we want ti call the default construcctor of its own class

/*class A{
    A(){
        System.out.println("lear coding");
    }
    A(int a){
        this();
        System.out.println(a);
    }
    public static void main(String[]args){
        A obj = new A(100);
    }
}
*/

//(4) it also called parametrized costractor of its own class

/*
class A{
    A(){
        this(10);
    }
    A(int a){
        System.out.println(a);
    }
    public static void main(String[] args) {
        A obj = new A();
    }
}
*/



                            //Super keyword
// Super keywords refer to the objects of super class it is used when 
// we want to call the super class variable method and constructor through sub classs

// Note:- (1) whenever the super class and sub class method variable name both same then it is use

/*
class A{
    int a = 10;  // variable a
}
class B extends A{
    int a = 120;   // same variable
    void show(){
       System.out.println("super class variable ="+super.a);         // super class variable a=10
       System.out.println("local variable a ="+a);     // call local class variable a=120
    }          
}
public class Unit2{
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }
}
*/

                                            // same method
//NOte:- (2) to avoid the confussion btween class and sub class variable, method that have same name
/*class parenets{
    void meth_P1(){
        System.out.println("method of parents class");
    }
    void meth_p2(){
        System.out.println("method of parent class but 2nd method");
    }
}
class Child extends parenets{
    
     void meth_P1(){            // NOte: for call parent class method super.meth_name in side method but just befor "Sout();""
        super.meth_P1();        // acess the method of parent class
        System.out.println("1st method of child class ");
    }
    void meth_P2(){
        super.meth_P1();        // here we caall parent classs diff method 
        System.out.println("2nd method of child class");
   }
}
public class Unit2{
    public static void main(String[] args) {
        Child obj_c= new Child();
        obj_c.meth_P1();
        obj_c.meth_P2();

    }
}
*/

                                    // garbage collection

// in ava gaarbage means unreferenced objects
// Garbage collection:- garbage collection is process of reclaming the runtime unused memory automatically
// in other words it is a way to destroy the unused object

//Note:- the garbage collector in JVM collect only those object they are created by new keyword.
// So if you have created any object without new , you can use finalize method to perform cleanup processing
// a object of class which dont have refrence is called garbaze collection
// example a class name =A and it object is => new A() so this object can not have refrence so this is part of garbaze collector
// garbsge collector delete that object but before deleting they check the obje could not connet to any file 



                //finalize method
// finalize is a method which is available in object super class
//the purpose of finalize method that is to release the resource that is allocated by unused object by garbaze collector

                                // lambda expresion

                    // by default java should not supprt functional programmin
//(1) the reason of add lambda expresion i java is to work with functional programing feature
//(2) code optimisition 

//in the object orianted programing the data store in object and work in class
// but in functional programing data should store in function and variable


        // lamda expression is an anonymaous function which don't hava name, don't have return type, and don't have acess modifier
        // Syntex :- ()->Sout("");

// example:- public void main(int a, int b){Sout(a+b)}
    // not a lambda expression because we that in lambda expression 
    // not name, not return type,not acess modifier
    // (int a, int b)->sout(a+b);       // and lambda exoression we dont need to wrtite data type of variable
    // lambda expression automatical take it
    // now => (a,b)->Sout(a+b);
// FUNCTIONAL INTERFACE:-  the interface which have only one abstract method but you can have may default method and static method
// we can not acces interface's abstract method directly.for acess class and implemetn for acees method which is lengthy.

/*@FunctionalInterface
interface Cab{
    public void bookCab();      // thiscalled functional interface because there are only one abstract method in interface
    
    }
class Ola implements Cab{
    public void bookCab(){
        System.out.println("ola cab is book");
    }
}
public class Unit2{
    public static void main(String[] args) {
        Ola obj = new Ola();
        obj.bookCab();
    }
}*/

// for time saving and acees the method of interface's abstract method we use lambda expression for example:

/*interface Cab{
     public void bookCab();  // by default compiler make abstract class
}
public class Unit2{
    public static void main(String[]args){
        Cab obj_cab =()->System.out.println("Ola cab is booked");
        obj_cab.bookCab();
    }
}
*/

/*interface Cab{
    public void bookCab(String source, String destination);         // by default abstract method
}
class Ola implements Cab{
    public void bookCab(String source, String destination){
        System.out.println("ola cab is booked "+source+" to "+ destination);
    }
}
public class Unit2{
    public static void main(String[] args) {
        Cab obj_cab = new Ola();
        obj_cab.bookCab("bsr","khurja");
    }
}
*/
        // lambda expressio


/*interface Cab{
    public void bookCab(String source, String destination);
}
public class Unit2{
    public static void main(String[] args){
        Cab obj_cab=(source , destination)-> System.out.println("ola cab is booked from"+source+" to "+destination);
        obj_cab.bookCab("hyd","mumbai");
    }
}*/


                            //Array (1) single dimension array      (2) multidimension array
// Array is a object in java , which contain similar type of data in a contiguous memory  location
// Syntex:- (1) dataype [] var_name

            //dynamic array
/*public class Unit2{
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        System.out.println(arr[3]);
    }
}
*/


            // fix sized array
/*public class Unit2{
    public static void main(String[] args) {
        int arr1[] = new int[5];
        arr1[0]=23;
        arr1[3]=90;
        arr1[1]=45;
        arr1[4]=56;
        for(int i=0;i<5;i++){
            System.out.println(arr1[i]);  // by default arr1[2]=0
        } 
    }
}
*/

                        //dynamic array

/*import java.util.*;
 public class Unit2{
    public static void main(String[] args) {
        int size ,i;
        Scanner sc = new Scanner (System.in);
        System.out.println("enter size of array ");
        size = sc.nextInt();
        int arr1[] = new  int[size];
        for(i =0;i<size;i++){
        {arr1[i]=sc.nextInt();
            }
        }
        for (i=0;i<size;i++){
            System.out.print(arr1[i]);
        }
    }
}
*












