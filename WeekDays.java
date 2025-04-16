import java.util.Scanner;

class WeekDays{
    public  static void main(String[] args){
    System.out.println("NAME: G.HIMAJA \nROLL.NO: AV.SC.U4CSE2411");

    Scanner input = new Scanner(System.in);

    System.out.println("Input Number (1-7): ");
    int a = input.nextInt();
 
    if (a == 1){
         System.out.println("Day: Monday");
    }
    else if(a == 2){
         System.out.println("Day: Tuesday");
    }
    else if(a == 3){
         System.out.println("Day: Wednesday");
    }
    else if(a == 4){
         System.out.println("Day: Thursday");
    }
    else if(a == 5){
         System.out.println("Day: Friday");
    } 
    else if(a == 6){
         System.out.println("Day: Saturday");
    }
    else if(a == 7){
         System.out.println("Day: Sunday");
    }
    else{
         System.out.println("Invalid input! Please enter a number between 1 and 7");
    }
    input.close();
    }
}