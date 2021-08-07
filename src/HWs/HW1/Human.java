package HWs.HW1;

public class Human implements Subject {
    public boolean lost;
    private final int runlim;
    private final int jumplim;
    public Human(int runlim, int jumplim) {
        this.runlim = runlim;
        this.jumplim = jumplim;
    }
    @Override
    public boolean getStatus() {return this.lost;}

    @Override
    public void run(Track track) {
        if (track.length <= runlim) {
            System.out.printf("Человек преодолел препятствие - %s\n", track);
        } else {
            System.out.printf("Человек не преодолел препятствие - %s\n", track);
            lost = true;
        }
    }
    @Override
    public void jump(Wall wall) {
        if (wall.height <= jumplim) {
    System.out.printf("Человек преодолел препятствие - %s\n", wall);
        } else {
    System.out.printf("Человек не преодолел препятствие - %s\n", wall);
    lost = true;
        }
    }
}
