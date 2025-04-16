interface Playable {
    public void play();
}

class Football implements Playable {
    public void play() {
        System.out.println("Playing football: Kick the ball and score goals!");
    }
}

class Volleyball implements Playable {
    public void play() {
        System.out.println("Playing volleyball: Serve, set, and spike!");
    }
}

class Basketball implements Playable {
    public void play() {
        System.out.println("Playing basketball: Dribble, shoot, and slam dunk!");
    }
}

public class SportTest {
    public static void main(String[] args) {
        System.out.println("NAME: G.HIMAJA");
        System.out.println("ROLL NO: AV.SC.U4CSE24111\n");

        Playable football = new Football();
        Playable volleyball = new Volleyball();
        Playable basketball = new Basketball();

        football.play();
        volleyball.play();
        basketball.play();
    }
}
