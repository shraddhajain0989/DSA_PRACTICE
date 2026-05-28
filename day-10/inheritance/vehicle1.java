class vehicle {
    String brand="Generic ";
    void honk(){
        System.out.println("Tuut, tuut!");
    }
}
class car extends vehicle{
    String modelName="Mustang";
    void displayInfo(){
        System.out.println("Brand: "+ brand + "Model: "+ modelName);
    }
}


public class vehicle1 {
  public static void main(String[] args) {
    car c= new car();
    c.honk();
    c.displayInfo();
  }  
}
