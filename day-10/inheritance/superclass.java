import.java.util.Scanner;
class person_constructor{
    void emp_constructor(){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
class employee_constructor extends person_constructor{
    void emp_constructor(){
        super.emp_constructor();
        Scanner sc = new Scanner(System.in);
        String company = sc.nextLine();
        int salary = sc.nextInt();
        System.out.println("Company: " + company);
        System.out.println("Salary: " + salary);
    }
}

public class superclass {
    
}