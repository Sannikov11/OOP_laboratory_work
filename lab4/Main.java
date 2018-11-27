

public class Main {

    public static void main(String[] args) {
	Car myCar = new Car(4500000,"BatCar", "Dark", 4000 );
	Priceble pr = new Notebook(999, "ACER", "Metallic", 16);
	pr.getPrice();
	System.out.println();
	myCar.getPrice();
    }
}
