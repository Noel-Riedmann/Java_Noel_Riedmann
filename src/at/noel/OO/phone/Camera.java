package at.noel.OO.phone;

import java.util.ArrayList;
import java.util.List;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Camera {
    private int resolution;
    private List<PhoneFile> phoneFile; // add files to sdcard instead of new array list next time!
    private int pictureCounter;
    private SDCard sdCard;

    public Camera(int resolution) {
        this.resolution = resolution;
        this.phoneFile = new ArrayList<>();
        this.pictureCounter = 1;
        this.sdCard = new SDCard(128000);
    }

    public void makePicture() {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-ddHH:mm:ss");
        Date date = new Date();
        PhoneFile picture = new PhoneFile(".png", 0.145, "picture-" + pictureCounter + "-" + date);
        phoneFile.add(picture);
        sdCard.setPhoneFiles(phoneFile);
        sdCard.getAllFiles();
        pictureCounter++;
    }
}
