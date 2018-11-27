
public class Notebook implements Priceble {
    private int notePr;
    private String brand;
    private String processor;
    private int ram;

    Notebook(int notePr, String brand, String color, int ram) {
        this.brand = brand;
        this.notePr = notePr;
        this.processor = processor;
        this.ram = ram;
    }

    public void getPrice() {
        System.out.println("Price of notebook " + brand + " : " + notePr + " $ ;\nCharacteristics\n" +
                "Processor : " + processor + "\nRAM : " + ram + "GB");
    }
}
