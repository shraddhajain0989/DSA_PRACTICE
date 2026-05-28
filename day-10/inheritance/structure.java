class shape {
    void draw(){
        System.out.println("Drawing shape");
    }
}
class circle extends shape{
    void draw(){
        System.out.println("Drawing circle");
    }
}
class rectangle extends shape{
    void draw(){
        System.out.println("Drawing rectangle");
    }
}

public class structure {
    public static void main(String[] args) {
        shape s = new shape();
        s.draw();

        circle c = new circle();
        c.draw();

        rectangle r = new rectangle();
        r.draw();
    }
}
