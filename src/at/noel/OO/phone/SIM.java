package at.noel.OO.phone;

public class SIM {
    private int id;
    private String number;

    public SIM(int id, String number) {
        this.id = id;
        this.number = number;
    }

    public void getInfo(){
        System.out.println("id: " + id);
        System.out.println("number: " + number);
    }
}
