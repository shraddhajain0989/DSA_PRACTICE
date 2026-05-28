class ParentsTree {
    
    void grandparents() {
        System.out.println("Grandparents");
    }
}

class Parents extends ParentsTree {

    void parents() {
        System.out.println("Parents");
    }
}

class Child extends ParentsTree {

    void child() {
        System.out.println("Child");
    }
}

public class parents1 {

    public static void main(String[] args) {
        ParentsTree gp = new ParentsTree();
        gp.grandparents();
        Parents p = new Parents();
        p.parents();

        Child c = new Child();
        c.child();
    }
}