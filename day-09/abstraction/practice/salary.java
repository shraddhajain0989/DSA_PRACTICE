/*Write a Java program to create an abstract class Employee with abstract methods 
calculateSalary() and displayInfo(). Create subclasses Manager and Programmer that 
extend the Employee class and implement the respective methods 
to calculate salary and display information for each role. */
import java.util.Scanner;
interface employee{
    void calculateSalary();
    void displayInfo();
}

class Manager implements employee{
    private double Salary = 5000;
    public void calculateSalary(){
        System.out.println("Manager Salary: " + Salary);
    }
    public void displayInfo(){
        System.out.println("Role: Manager");
    }

}
class Programmer implements employee{
    private double Salary = 3000;
    public void calculateSalary(){
        System.out.println("Programmer Salary: " + Salary);
    }
    public void displayInfo(){
        System.out.println("Role: Programmer");
    }
}
public class salary {
    public static void main(String[] args){
        Manager m = new Manager();
        m.displayInfo();
        m.calculateSalary();
        Programmer p = new Programmer();
        p.displayInfo();
        p.calculateSalary();
    }
}
