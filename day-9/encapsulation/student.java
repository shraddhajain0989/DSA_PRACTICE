package encapsulation;
public class student {
    private String name;
    private int rollno;
    public void setName(String name) {
        if(name !=null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Invalid name");
        }
    }
    public  void setRollno(int rollno) {
        if(rollno > 0) {
            this.rollno = rollno;
        } else {
            System.out.println("Invalid roll number");
        }
    }
        public String getName() {
            return name;
        }
        public int getRollno() {
            return rollno;
        }
}
    class Main1 {
        public static void main(String[] args) {
            student s = new student();
            s.setName("John Doe");
            s.setRollno(12345);
            System.out.println("Name: " + s.getName());
            System.out.println("Roll No: " + s.getRollno());
        }
    }


