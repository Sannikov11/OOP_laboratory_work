
public class Car implements Priceble {
    private int carPr;
    private String brand;
    private String color;
    private int kilometre;

    Car(int carPr, String brand, String color, int kilometre)
    {
        this.brand = brand;
        this.carPr = carPr;
        this.color = color;
        this.kilometre = kilometre;
    }

    public void getPrice(){
        System.out.println("Price of car " + brand + " : " + carPr + " $ ;\nAppropriate bargaining");
    }
}
