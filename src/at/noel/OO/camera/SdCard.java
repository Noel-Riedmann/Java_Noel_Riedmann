package at.noel.OO.camera;

public class SdCard {
    private int size;
    private Producer producer;

    public SdCard(int size, Producer producer) {
        this.size = size;
        this.producer = producer;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
