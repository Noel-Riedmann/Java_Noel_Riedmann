package at.noel.OO.musicbox;

import java.util.ArrayList;
import java.util.List;

public class Magazine {
    private List<Record> records;

    public Magazine() {
        this.records = new ArrayList<Record>();
    }

    public void addRecord(Record record) {
        if (records.size() >= 50) {
            System.out.println("The Musicbox is full! No further record can be added at the moment. Remove records to get space available.");
        } else {
            records.add(record);
        }
    }

    public void removeRecord(Record record) {
        records.remove(record);
    }

    public void getSumOfRecords() {
        System.out.println("Sum of records: " + records.size());
    }

    public void search(String name) {
        for (int i = 0; i < records.size(); i++) {
            if (name.equalsIgnoreCase(records.get(i).getTitle())) {
                System.out.println("--------------------------------");
                System.out.println("Title: '" + records.get(i).getTitle() + "'");
                System.out.println("Artist: " + records.get(i).getArtist());
                System.out.println("Duration: " + records.get(i).getDuration() + "min");
                System.out.println("--------------------------------");
            }

        }
    }

    public void getSumOfPlaytime() {
        double sum = 0.0;

        for (int i = 0; i < records.size(); i++) {
            sum += records.get(i).getDuration();
        }
        System.out.println("Sum of Playtime: " + sum + "min");

    }

    public void play(int num) {
        if (records.size() >= num) {
            System.out.println("Now playing '" + records.get(num).getTitle() + "'");
        } else {
            System.out.println("Plate number " + num + " does not exist!");
        }
    }
}
