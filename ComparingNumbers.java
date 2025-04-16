import java.util.Scanner; 

public class ComparingNumbers{
      public static  void main(String[] args){
      System.out.println("NAME: G.HIMAJA \nROLL.NO: AV.SC.U4CSE2411");
 
      Scanner input =  new Scanner(System.in);

      System.out.println("Input Float-point number: ");
      double num1 = input.nextDouble();
      System.out.println("Input Float-point another number: ");
      double num2 = input.nextDouble();

      num1 = Math.round(num1*1000)/1000.0;
      num2 = Math.round(num2*1000)/1000.0;

      if(num1 == num2){
      System.out.println("They are same up to three decimal places.");
      }
      else{
      System.out.println("They are different.");
      }
 
      input.close();
      }
}
       