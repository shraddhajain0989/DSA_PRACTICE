abstract class vehicle {
    abstract void start();
    public void stop() {
        System.out.println("Vehicle stopped");
    }
}
class car extends vehicle {
    void start() {
        System.out.println("Car started");
    }
}
class bike extends vehicle {
    void start() {
        System.out.println("Bike started with kick");
    }
}

public class vehicle_abstract1 {
     public static void main(String[] args) {
        car c = new car();
        c.start();
        c.stop();
        bike b = new bike();
        b.start();
        b.stop();
     }
}