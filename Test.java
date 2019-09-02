import java.util.Scanner;
import java.util.*;
import java.io.*;

public class Test {
static int safeDivide(int x,String y ) throws InputMismatchException{

	int result=0;

   /* if (y==0)
   {
  throw new ArithmeticException("Attempt to divide by zero.");
   }
   else if (y != 0) {
    
     result = x/y;
   }*/
   if(y.equals("a")){

    throw new InputMismatchException("Error!!!!!!! ock ");
        
       }
return result;
   }



   
public static void main(String[] args) {

int x=1, z=1;
String y="";
Scanner input = new Scanner(System.in);
System.out.print("Enter x and y : ");
  try{
   x=input.nextInt();
  y=input.nextLine();
  z = safeDivide(x,y);
  System.out.println("Result : "+z);
    }

     /*catch(ArithmeticException iem){

     System.out.println(""+iem.getMessage());
 }*/
  catch(InputMismatchException iem){

    System.out.println(""+iem.getMessage());
}
 
 }
}
