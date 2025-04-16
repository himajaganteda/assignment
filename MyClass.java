class MyClass{
    static int count = 0;
    final static double PI = 3.14;
    
public MyClass(){
     count++;
}

public static void main(String[] args){
     System.out.println("NAME: G.HIMAJA \n ROLL.NO: AV.SC.U4CSE2411");
        MyClass a = new MyClass();
        MyClass b = new MyClass();
        MyClass c = new MyClass();

     System.out.println("Count: " + count);
     System.out.println("Value of PI: " +a.PI);
     System.out.println("Value of PI: " +b.PI);
     System.out.println("Value of PI: " +c.PI);
     System.out.println("PI: " + PI);
}
} 