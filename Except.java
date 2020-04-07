//user defined exceptions are something which we want it to be considered
//as an exception so it will become a sub class of Exception class
class Superclass extends Exception{
     public Superclass(String s){
          super(s);
     }
}


public class Except{
     public static void main(String []args){
          try{
               throw new Superclass("this will be reported as Exception");
          

          }
          catch(Superclass e){
               System.out.println("caught");
               System.out.println(e.getMessage());
          }
     }
}