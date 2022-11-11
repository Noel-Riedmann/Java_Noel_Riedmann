package at.noel.OO.car_refactored;

public class RearMirror {
    private int size;
    private int position; // 0 neutral -+ 10 adjustable

    public RearMirror(int size, int position){
        this.size = size;
        this.position = position;
    }

    public int getSize() {
        return size;
    }

    public int getPosition() {
        return position;
    }
}
