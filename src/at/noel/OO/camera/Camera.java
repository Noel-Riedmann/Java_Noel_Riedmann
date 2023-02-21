package at.noel.OO.camera;

import java.util.Date;

public class Camera {
    private int pixel;
    private double weight;
    private String color;
    private Producer producer;
    private Lens lens;
    private SdCard sdCard;

    public Camera(int pixel, double weight, String color, Producer producer, Lens lens, SdCard sdCard) {
        this.pixel = pixel;
        this.weight = weight;
        this.color = color;
        this.producer = producer;
        this.lens = lens;
        this.sdCard = sdCard;
    }

    public void takePicture(){
        String name;
        Date date;
        int size;
        String sizeName;

        //size
        if (pixel <= 480){
            size = 2;
            sizeName = "small";
        }
            else if (pixel < 1080){
                size = 4;
                sizeName = "medium";
        }
            else {
                size = 6;
                sizeName = "big";
        }
            //check if enough capacity is available
            if (sdCard.getSize() >= size){
                //subtract size from sdcard
                sdCard.setSize(sdCard.getSize() - size);
                System.out.println("A " + sizeName + "(" + size + "gb)" + " picture has been created.");
            }
            else {
                System.out.println("Not enough capacity available to take a photo! Capacity available: " + sdCard.getSize() + "gb Capacity needed: " + size + "gb");
            }

            if (sdCard.getSize() >= 6){
                System.out.println("You are running out of capacity! Capacity remaining: " + sdCard.getSize() + "gb");
            }
    }
}
