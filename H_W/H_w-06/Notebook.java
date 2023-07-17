public class Notebook {
    private String brand;
    private String model;
    private String color;
    private String opSystem;
    private int ram;
    private String diskTipe;
    private int diskSize;

    public Notebook(String brand, String model, String color, String opSystem, int ram, String diskTipe, int diskSize) {
        
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.opSystem = opSystem;
        this.ram = ram;
        this.diskTipe = diskTipe;
        this.diskSize = diskSize;
    }

    public String printInfo(){
        System.out.printf("Бренд: %s, Модель: %s, Цвет: %s, Операционная система: %s, RAM: %d, Тип диска: %s, Размер диска: %s ", 
        brand, model, color, opSystem, ram, diskTipe, diskSize);
        return "";
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOpSystem() {
        return opSystem;
    }

    public void setOpSystem(String opSystem) {
        this.opSystem = opSystem;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getDiskTipe() {
        return diskTipe;
    }

    public void setDiskTipe(String diskTipe) {
        this.diskTipe = diskTipe;
    }

    public int getDiskSize() {
        return diskSize;
    }

    public void setDiskSize(int diskSize) {
        this.diskSize = diskSize;
    }
    
}
