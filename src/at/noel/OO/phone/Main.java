package at.noel.OO.phone;

public class Main {
    public static void main(String[] args) {

        Camera camera = new Camera(16);
        SIM sim = new SIM(109240, "+43 660 445546443");
        SDCard sdCard = new SDCard(128000);
        PhoneFile phoneFile = new PhoneFile(".docx", 2.0, "01-Java-Coding");
        Phone myPhone = new Phone("Black", camera, sim, sdCard);

        camera.makePicture();
        camera.makePicture();
        camera.makePicture();

        myPhone.makeCall("0660 309534095");
        sim.getInfo();
        phoneFile.getInfo();
        sdCard.getAllFiles();

    }


}
