                    // thread
//thread is a pre define class which is available in java.lang package.
// thread is a basic unit of cpu and it is well known for inndependent execution



                // multiple threading
// 




            //create thread
// by extending thread class
// by implementing runnable interface



// multitasking:- in multitasking we have two progrma so 1st step execute in progrmae 1 and also 2nd but next step are waiting for run in both programe


// multithreading:- we have single programe but multiple task for perform


                // create thread
// we can create thread by (1) extending thread class   (2) by implementing runnable interface 

            // crete thread by extending thread class

/*class A extends Thread{
    public void run(){      // creat main thread class's method
        for(int i=1;i<5; i++){
            System.out.println("piyush");
        }
    }
}

public class Unit4{
    public static void main(String[] args) {
        A obj_A=new A();
        obj_A.start();      // display main thread output
        for(int i=1; i<5;i++){    // create user define thread
            System.out.println("sharma");
        }
        
    }
}
*/


                //create threacd by runnsble class

/*class A implements Runnable{
    public void run(){
        for(int i=1;i<5;i++){
            System.out.println("my child thread");
        }
    }
}
public class Unit4{
    public static void main(String[] args) {
        A obj_A = new A();
        Thread obj_thread=new Thread();
        obj_thread.start();
        for(int i;i<5;i++){
            System.out.println("main thread");
        }
    }
}*/


                // life cycle of thread
// As we know a thread is well know as independent execution .
// during the life cycle of a threa can move from diff states

//(1) new State (Born)
// (2) runnable state(ready)
//(3)running state (excecution)
//(4) waiting state(blocked)
//(5)dead state (exit)


// boarn ----> ready------>running state------>exit



                //thread priority

// in java it is possible to assign the priority of threed
// to set these priority java thread class has provide two predefined method

// Set priority()    //(2) get priority
// te thread class has also provided three predefine final static variable and it valiue lie b/t 1 to 10
//thread.min_priority--->1
//THread.NORm_priority--->5
//thread.MAX_PRIORITY----->10


// priority set by jvm
/*
class A extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
    }
}
class B{
    public static void main(String[] args) {
        A t1 = new A();
        A t2 = new A();
        A t3 = new A();
        t1.setName("t1 thraead");
        t2.setName("t2 thread");
        t3.setName("t3 thread");
        t1.start();
        t2.start();
        t3.start();


    }
}
*/

        // priority set  by user
/*class A extends Thread{
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());


    }
}
class B{
    public static void main(String[] args) {
        A t1 = new A();
        A t2 = new A();
        A t3 = new A();
        
        t1.setName("t1 thread");
        t2.setName("t2 thread");
        t3.setName("t3 thread");

        t1.setPriority(2);
        t2.setPriority(7);
        t3.setPriority(4);

        t1.start();
        t2.start();
        t3.start();


    }
}
*/


                    //Synchronization
//synchronization is a technique through which we can control miltiple threading among the no of thread
// only one thread will enter inside one synchronize area


// the main pupose of synchronization is to overcome the problem of multithread 
//when multiple thread trying to access same resouce at same time on that situation it may provis=de some wrong result

//sychronization classified in two categories
//(1) method level synchronization
//(2) block level synchronization

/*
class Table{
    //public void PrintTable(int n){  // alll thrad execute same time
    public synchronized void PrintTable(int n){         // now one thread run at a time
for(int i=1;i<5;i++){
    System.out.println(n*i);
}
    }
}
class thread1 extends Thread{
    Table t;
    thread1(Table t){
        this.t=t;
    }
    public void run(){
        t.PrintTable(5);
    }
}
class thread2 extends Thread{
    Table t;
    thread2(Table t){
        this.t=t;
    }
    public void run(){
        t.PrintTable(7);
    }
}
public class Unit4{
    public static void main(String[] args) {
        Table obj =new Table();
        thread1 t1 = new thread1(obj);
        thread2 t2 = new thread2(obj);
        t1.start();
        t2.start();
    }
}
*/


                //I/O stream(input output stream)

//(1) Input(Scanner class):= Scanner is a predefine class in java which is ac=vailabel in java.util package
//which is used to get user input

//Rule:-
//(1):- if we use Scanner class ,must have to create object of scanner classs
// Syntex Scanner sc= new Scaner(Syste.in)


                    //Anotation
/*class A{
    public void show(){
        System.out.println("in A show");
    }
}
class B extends A{
    public void show(){
        System.out.println("in b show");
    }
}

public class Unit4{
    public static void main(String[] args) {
        B obj_B=new B();
        obj_B.show();
    }
}
*/




