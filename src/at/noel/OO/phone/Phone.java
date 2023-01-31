package at.noel.OO.phone;

public class Phone {
    private String color;
    private Camera camera;
    private SIM sim;
    private SDCard sdCard;

    public Phone(String color, Camera camera, SIM sim, SDCard sdCard) {
        this.color = color;
        this.camera = camera;
        this.sim = sim;
        this.sdCard = sdCard;
    }

    public void takePicture(){

    }

    public void makeCall(String name){
        System.out.println("You're calling " + name + "....");
    }

    public void getFreeSpace(int amount){
        sdCard.getFreeSpace(amount);
    }
}
