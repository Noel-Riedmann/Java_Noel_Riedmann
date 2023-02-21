package at.noel.OO.camera;

public class Lens {
    private double focalLength;
    private Producer producer;

    public Lens(double focalLength, Producer producer) {
        this.focalLength = focalLength;
        this.producer = producer;
    }
}
