package HWs.HW1;

public class HW1 {
    public static void main(String[] args) {
        Obstacle[] obstacles = {
                new Track(250),
                new Wall(2),
                new Track(500),
                new Wall(3),
                new Track(750),
                new Wall(4),
        };
        Subject[] subjects = {
                new Human(600, 3),
                new Human(800, 4),
                new Cat(350, 6),
                new Robot(700, 5),
        };

        for (Subject subject : subjects) {
            for (Obstacle obstacle : obstacles) {
                if (!subject.getStatus()) {
                    subject.winObst(obstacle);
                }
            }
            System.out.print("\n");
        }
    }
}
