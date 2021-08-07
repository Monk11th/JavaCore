package HWs.HW1;

public class Track implements Obstacle{
    public final int length;
    public Track(int length) {
        this.length = length;
    }
    @Override
    public String toString() {
        return String.format("Длина трека: %d", length);
    }
}
