                                                        // exception vs errors

//(1)exception and error both are pre-define class in java which is throwable
            // exception:- 
 // an exception is caused by our program
// exception are recoverable by the help of catch throws and try
// in java exception are classified as checked or unchecked type

        // Error:-
// an erroe are not caused by our program
// error are not recoverable
// error are only unchecked type in java


                                                    // exception hendling
// throwable is a super classs which contain two sub class (1)exception  (2) error
// an exception is unexpected , unwanted situation that occured at runtime.
// we handling exception to run all code without any error

// the object oriented mechanism has provided the following techniques to work with exception:
// (1) try  (2) catch   (3) throw   (4) throws  (5) FINALLY
// for pre-define exception we use  =try , catch
// for user define exception we use throw and dthrows
// if exception occurs but we want output so use finally

/*public class Unit3{
        public static void main(String[] args) {
                System.out.println("main method started");
                int a=10,b=0,c;
                try{
                c=a/b;
                System.out.println(c);
                }
                catch(Exception e){
                        System.out.println(e);
                }
        }
}
*/
                                                        
                        //try catch block

// the main purpose of cathch block is to handle the exception which are throw by try block
// Note:- catch block will not be excecuted if their is no exception in side the try block


/*public class Unit3{
        public static void main(String[] args) {
                //String str ="123";
                String str ="piyush";
                try{
                        int a = Integer.parseInt(str);
                        System.out.println(a);
                        System.out.println("String number formate exception");
                }
                catch(NumberFormatException n){
                        System.out.println("String "+str+" cant be converted to integer");
                
                }
        }
}
*/


                        // try catch and finally
//
/*public class Unit3{
        public static void main(String[] args) {
                try{
                        System.out.println("lear coding");
                        //int a =30,b=4,c;
                        int a=20,b=0,c;
                        c=a/b;
                        System.out.println(c);
                        System.out.println("hello world");
                        
                }catch(ArithmeticException Ae){
                        System.out.println("Arthmethic exception occurrs  can not divide by zero");

                }finally{
                        System.out.println("finally block");
                }
                System.out.println("main method ended");
        }
}
*/

                        // throw keyword
// throw keyword is used to throw the user define or costomized exception object to the jvm               

/*public class Unit3{
        public static void main(String[] args) {
                //System.out.println(10/0);       // here exception throw by jvm
                throw new ArithmeticException("/ by zero");            // here exception create by us
         }
}
*/



                        // throws keywords
// throws keyword is used when we does't want to handle the excepption and try to send the exception to the jvm 

/*public class Unit3{
        public static void main(String[] args) 
        throws InterruptedException {
                        // here we dont want to handle exception so we use throws for inform the exception to compiler
                for (int i=0;i<=10;i++){
                        System.out.println(i);
                        Thread.sleep(1000);
                }
        }
}
*/

//  nut best approch to hendle exception is try and catch block
/*
public class Unit3{
        public static void main(String[] args) {
                for(int i=0;i<10;i++){
                try{ System.out.println(i);
                        Thread.sleep(1000);

                        }catch(InterruptedException e){
                                System.out.println(e);
                        }
        }
        }
}
*/


                                // nested try block
// a try block which contain inside another try block

/*public class Unit3{
        public static void main(String[] args) {
                try{

                        try{
                                int a[] ={10,20,30};
                                System.out.println(a[2]);

                        }catch(ArrayIndexOutOfBoundsException a){
                                System.out.println(a);
                        }
                        System.out.println(10/0);
                }
                catch(ArithmeticException e){
                        System.out.println(e);
                        }
                        System.out.println("lear coding");
        }
}
*/

                        // multiple catch block
//while working with multipm=le catch block the super class exception catch block must be at the last ocf block
/*public class Unit3{
        public static void main(String[] args) {
                try{
                        int a=10,b=2,c;
                        c=a/b;
                        System.out.println(c);

                        int arr[] = {10,20,30};
                        System.out.println(arr[0]);

                        String str ="piyush";
                        System.out.println(str.toUpperCase());

                }catch(ArrayIndexOutOfBoundsException a){
                        System.out.println("array exception");

                }
                catch(ArithmeticException e){
                        System.out.println("arithmetic exception");

                }
                catch(NumberFormatException n){
                        System.out.println("number exception");
                }
                catch(Exception x){
                        System.out.println("all type exception");
                }
        }
}
*/


                                        // Token 
// token is the smallest element of a program that is identified by aa compiler
// Some tokens :- Keywords , identifier ,operater,separator,litaral

/*public class Unit3{
        public static void main(String[] args) {
                int a= 10;
                int b=90;
                System.out.println(a+b);
        }
}
*/

// for write this code we use 
// keywords= class ,String ,int  etc
// identifier= unit3 , main , a,b 
//operators=+ ,= etc
//sepaarator={},() etc


                        // String tokenizer
// breaks a sentance or a bigger String into words

//(1) String tokenizer st = new String Tokenizer (s);
//(2) nexrToken()=> gives the words one by one
//(3) hasMoreTokens()=> used to check if more words exists


/*import java.util.StringTokenizer;
public class Unit3{
        public static void main(String[]args){
                String s="my name is piyush";
                StringTokenizer st = new StringTokenizer(s);
                while(st.hasMoreTokens()){
                        System.out.println(st.nextToken());
                }
        }
}
*/

                                        // String hendling
                        //String creat by 
                        // ##String class     ## string buffer        ## string builder
        //String class
// in java String are object that allows us to store sequance of ch which may contain alpha numeric value => ("piyush224")
// (1) String are immutable in java
// it contains methods that can perform certain operations on string like (equal,length() etc)
// there are two type to create string
//(1) String literal    (2) new keywords


// if we create a object with helap of string litral so they store inside the heap's string constant pool
// (1) string literal:- if two string are same like a= piyush and b = piyush so jvm give same adddress in heap memory
                //  string are immutable because if we want to change in a like a.concat("sharma") so a should be  
                //now piyushsharma but b also change by default 
                // for this resion string are immutable in java'
        
/*public class Unit3{
        public static void main(String[] args) {
                String a ="piyush";             // create a object of String which has variable a
                System.out.println(a);

                String b = "piyush";            // create another object for same string but jvm check that.  
                System.out.println(b);           //dont allow to create two object for same string so jvm give same object for both string

                a.concat(" sharma");             //cchange in a
                System.out.println(a);  
                                        // here change is notallow because same string also refer to b if we change on a. 
        
                                                //so  b also change sp for thsi resion string are immutable

                // but if we want to change so
                a=a.concat("sharma");
                System.out.println(a);
                System.out.println(b);          // but b dont change
        
        }                                              
}
*/



//(2) new keywords:-String a = new String("piyush")   here "String" is class 
// here also string is immutable 

// all same as string litral
// if object create by string litral so data store in heap's  string constant pool 
//but if we create object with help new keywords so data store inside the heap but outside string constant pool 

/*
public class Unit3{
        public static void main(String[] args) {
                String a = new String("piyush");
                System.out.println(a);

                String b = new String("piyush");
                System.out.println(b);
        }
}
*/


                // String Buffer class
// store in heap area 
// create mutable object
// consume less memory
// all method are synchronized & all method thread safe
// fast as compare to string
// if data data is chage friquently we use string buffer

/*public class Unit3{
        public static void main(String[] args) {
                //StringBuffer sb = new StringBuffer();
                StringBuffer sb = new StringBuffer("Piyush");
                //System.out.println(sb.capacity());      // capacity to stroe string
                System.out.println(sb.capacity());
        }
} 
*/



                // String Bulder
// store in the heap
// create mutable object
//consume less memory
// not syncronized method so not thread safe
//fast as strin buffer
// if data change friquently we use string builder

/*public class Unit3{
        public static void main(String[] args) {
        StringBuilder sb1= new StringBuilder("piyush");
        sb1.append(" sharma");
        System.out.println(sb1);
       // System.out.println(sb1.capacity());
        }
}
*/



