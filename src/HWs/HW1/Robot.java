package HWs.HW1;

public class Robot implements Subject {
    public boolean lost = false;
    private final int runLim;
    private final int jumplim;

    public Robot (int runLim, int jumplim) {
        this.runLim = runLim;
        this.jumplim = jumplim;
    }
    @Override
    public boolean getStatus() {
        return this.lost;
    }
    @Override
    public void run(Track track) {
        if (track.length <= runLim) {
            System.out.printf("Робот преодолел препятствие -%s\n", track);
        } else {
            System.out.printf("Робот не преодолел препятствие -%s\n", track);
                lost = true;
        }
    }
            @Override
            public void jump(Wall wall) {
                if (wall.height <= jumplim) {
                    System.out.printf("Робот преодолел препятствие -%s\n", wall);
                } else {
                    System.out.printf("Робот не преодолел препятствие -%s\n", wall);
                            lost = true;
                }
            }
}