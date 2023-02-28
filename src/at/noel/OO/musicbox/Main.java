package at.noel.OO.musicbox;

public class Main {
    public static void main(String[] args) {
        Musicbox musicbox = new Musicbox();
        Magazine magazine = new Magazine();
        Record singForTheMoment = new Record("Sing for the moment", "Eminem", 5.39);
        Record stressedOut = new Record("Stressed out", "Twenty One Pilots", 3.22);

        magazine.addRecord(singForTheMoment);
        magazine.addRecord(stressedOut);
        magazine.search("sinG foR tHe MoMent");
        magazine.search("Stressed Out");
        magazine.getSumOfRecords();
        magazine.getSumOfPlaytime();
        magazine.play(0);

    }
}
