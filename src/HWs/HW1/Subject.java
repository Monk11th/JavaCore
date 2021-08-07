package HWs.HW1;

public interface Subject {
    default void winObst(Obstacle obstacle) {
        if (obstacle instanceof Wall) {
    Wall wall = (Wall) obstacle;
    this.jump(wall);
        } else if (obstacle instanceof Track) {
    Track track = (Track) obstacle;
    this.run(track);
        }
    }
        boolean getStatus();
        void run(Track track);
        void jump(Wall wall);
}
