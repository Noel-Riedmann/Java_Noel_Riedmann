package at.noel.OO.phone;

import java.util.ArrayList;
import java.util.List;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Camera {
    private int resolution;
    private List<PhoneFile> phoneFile;
    private int pictureCounter;

    public Camera(int resolution) {
        this.resolution = resolution;
        this.phoneFile = new ArrayList<>();
        this.pictureCounter = 1;
    }

    public void makePicture() {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        PhoneFile picture = new PhoneFile(".png", 0.145, "picture-" + pictureCounter + "-" + date);
        phoneFile.add(picture);
        pictureCounter++;
    }
}
