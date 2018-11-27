

public class BigDog extends Dog {
    private String workType;
    private String size;

    public BigDog(String breed, String name, String typeOfWool, String size, String workType)
    {
        super(breed, name, typeOfWool);
        this.size = size;
        this.workType = workType;
    }

    public String getSize() {
        return size;
    }

    public String getWorkType() {
        return workType;
    }

    public void displayInfo()
    {
        System.out.println("Dod's Name: " + getName() +
                "\nBreed: " + getBreed() +
                "\nType of wool: " + getTypeOfWool() +
                "\nSize: " + size + "\nWork type: " + workType);
    }
}
