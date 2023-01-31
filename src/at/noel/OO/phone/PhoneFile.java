package at.noel.OO.phone;

public class PhoneFile {
    private String extension;
    private Double size;
    private String name;

    public PhoneFile(String extension, Double size, String name) {
        this.extension = extension;
        this.size = size;
        this.name = name;
    }

    public void getInfo(){
        System.out.println("Name: " + name);
        System.out.println("Size: " + size + "mb");
        System.out.println("Extension" + extension);
    }

    public String getExtension() {
        return extension;
    }

    public Double getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    public void setName(String name) {
        this.name = name;
    }
}
