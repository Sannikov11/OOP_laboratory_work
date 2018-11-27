

public abstract class Dog {
    public String breed;
    public String name;
    public String typeOfWool;

    Dog(String breed, String name, String typeOfWool)
    {
        this.breed = breed;
        this.name = name;
        this.typeOfWool = typeOfWool;
    }

    public String getName(){return name;}
    public String getBreed(){return breed;}
    public String getTypeOfWool(){return typeOfWool;}

    public abstract void displayInfo();

}

