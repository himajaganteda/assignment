abstract class Bird {
    public abstract void fly();  
    public abstract void makeSound(); 
}

class Eagle extends Bird {
    @Override
    public void fly() {  
        System.out.println("Eagle soars high in the sky with powerful wings.");
    }

    @Override
    public void makeSound() {  
        System.out.println("Eagle screeches loudly!");
    }
}

class Hawk extends Bird {
    @Override
    public void fly() {  
        System.out.println("Hawk glides swiftly and precisely through the air.");
    }

    @Override
    public void makeSound() { 
        System.out.println("Hawk gives a sharp 'kreeee' call.");
    }
}

public class BirdTest {
    public static void main(String[] args) {
        System.out.println("NAME: G.HIMAJA");
        System.out.println("ROLL NO: AV.SC.U4CSE24111\n");
        
        Bird eagle = new Eagle();  
        Bird hawk = new Hawk();  
        
        eagle.fly();
        eagle.makeSound();
        
        hawk.fly();
        hawk.makeSound();
    }
}
