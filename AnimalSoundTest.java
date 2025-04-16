abstract class Animal {
    public abstract void sound();
}

class Lion extends Animal {
    @Override
    public void sound() {
        System.out.println("Lion roars");
    }
}

class Tiger extends Animal {
    @Override
    public void sound() {
        System.out.println("Tiger growls");
    }
}

public class AnimalSoundTest {
    public static void main(String[] args) {
        System.out.println("NAME: G.HIMAJA");
        System.out.println("ROLL NO: AV.SC.U4CSE24111\n");

        Animal lion = new Lion();
        Animal tiger = new Tiger();

        lion.sound();
        tiger.sound();
    }
}
