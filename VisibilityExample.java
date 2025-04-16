class VisibilityExample{
    public int a = 10;
    private int b = 20;

public void publicMethod(){
     System.out.println("This is public method");
}

public void privateMethod(){
     System.out.println("This is private method");
}

public class Visibility{
public static void main(String[] args){
    System.out.println("NAME: G.HIMAJA \nROLL.NO: AV.SC.U4CSE2411");

VisibilityExample obj = new VisibilityExample();
 
System.out.println("Public Variable: " + obj.a);
obj.publicMethod();
System.out.println("Private Variable: " + obj.b);
obj.privateMethod();

}
}
}