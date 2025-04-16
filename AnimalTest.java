class Animal {
    public void eat() {
        System.out.println("Animals eat food");
    }
}

class Herbivores extends Animal {
    @Override
    public void eat() {
        System.out.println("Herbivores eat leaves");
    }
}

class Carnivores extends Animal {
    @Override
    public void eat() {
        System.out.println("Carnivores eat flesh");
    }
}

class Omnivores extends Animal {
    @Override
    public void eat() {
        System.out.println("Omnivores eat both leaves and flesh");
    }
}

public class AnimalTest {
    public static void main(String[] args) {
        System.out.println("NAME: G.HIMAJA");
        System.out.println("ROLL NO: AV.SC.U4CSE24111\n");

        Animal herb = new Herbivores();
        Animal carn = new Carnivores();
        Animal omni = new Omnivores();

        herb.eat();
        carn.eat();
        omni.eat();
    }
}
