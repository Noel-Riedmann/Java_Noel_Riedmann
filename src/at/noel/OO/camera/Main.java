package at.noel.OO.camera;

public class Main {
    public static void main(String[] args) {
        Producer canon = new Producer("canon", "japan");
        Lens rf1200 = new Lens(1200, canon);
        SdCard s1 = new SdCard(32, canon);
        Camera r7 = new Camera(720, 2540, "black", canon, rf1200, s1);

        for (int i = 0; i < 10; i++) {
            r7.takePicture();
        }
    }
}
