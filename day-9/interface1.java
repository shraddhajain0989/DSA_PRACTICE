interface Animal{
    void sound();
}
class dog implements   Animal{
    public void sound(){
        System.out.println("Dog barks");
    }
}
class cat implements Animal{
    public void sound(){
        System.out.println("Cat meows");
    }
}
class bird implements Animal{
    public void sound(){
        System.out.println("Bird chirps");
    }
}

public class interface1 {
    public static void main(String[]args){
        Animal d= new dog();
        Animal c= new cat();
        Animal b= new bird();
        d.sound();
        c.sound();
        b.sound();
    }
}
