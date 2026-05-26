abstract class appliance{
    abstract void turnOn();
    public void turnOff() {
        System.out.println("Appliance stopped");
    }
}
class fan extends appliance{
    void turnOn(){
        System.out.println("Fan started");
    }
}
class light extends appliance{
    void turnOn(){
        System.out.println("Light turned on");
    }
}

public class appliance1 {
    public static void main(String[]args){
        fan f= new fan();
        light l= new light();
        f.turnOn();
        f.turnOff();
        l.turnOn();
        l.turnOff();
    }
}
