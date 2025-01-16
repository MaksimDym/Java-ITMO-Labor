
//Ex3

package L6;

public class Truck extends Car {
    private int numberOfWheels;
    private int maxWeight;

    public Truck(int w, String m, char c, float s, int wheels, int maxW) {
        super(w, m, c, s);
        this.numberOfWheels = wheels;
        this.maxWeight = maxW;
    }

    public void newWheels(int wheels) {
        this.numberOfWheels = wheels;
        System.out.println("Новое количество колес: " + numberOfWheels);
    }

    @Override
    public void outPut() {
        super.outPut();  // Вызов метода вывода из родительского класса
        System.out.println("Количество колес: " + numberOfWheels);
        System.out.println("Максимальный вес: " + maxWeight + " кг.");
    }

    public void displayTruckInfo() {
        outPut();  // Вызов метода вывода из родительского класса
        System.out.println("Количество колес: " + numberOfWheels);
        System.out.println("Максимальный вес: " + maxWeight + " кг.");
    }
}

