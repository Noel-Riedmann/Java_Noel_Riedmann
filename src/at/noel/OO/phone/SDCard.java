package at.noel.OO.phone;

import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.List;

public class SDCard {
    private double capacity;
    private List<PhoneFile> phoneFiles;

    public SDCard(double capacity) {
        this.capacity = capacity;
        this.phoneFiles = new ArrayList<>();
    }

    public void saveFile(PhoneFile savedFile){
        System.out.println(savedFile + " is saved!");
    }

    public void getAllFiles(){
        for (int i = 0; i < phoneFiles.size(); i++) {
            System.out.println(i+1 + " " + phoneFiles.get(i).getName()+phoneFiles.get(i).getExtension() + "     " + phoneFiles.get(i).getSize()+ "mb");
        }
    }

    public void getFreeSpace(double amount){
        System.out.println("You just cleared " + amount + "mb");
        capacity += amount;
        System.out.println("New capacity: " + capacity + "mb");
    }

    public double getCapacity() {
        return capacity;
    }

    public List<PhoneFile> getPhoneFiles() {
        return phoneFiles;
    }

    public void setPhoneFiles(List<PhoneFile> phoneFiles) {
        this.phoneFiles = phoneFiles;
    }
}
