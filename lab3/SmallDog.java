

public class SmallDog extends Dog {
    public String benefit;
    public int age;

    public SmallDog(String breed, String name, String typeOfWool, int age, String benefit)
    {
        super(breed, name, typeOfWool);
        this.age = age;
        this.benefit = benefit;
    }

    public int getAge() {
        return age;
    }

    public String getBenefit() {
        return benefit;
    }

    public void displayInfo()
    {
        System.out.println("\nDod's Name: " + getName() +
                           "\nBreed: " + getBreed() +
                           "\nType of wool: " + getTypeOfWool() +
                           "\nAge: " + age + "\nBenefit: " + benefit);
    }
}
