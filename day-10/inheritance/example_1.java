/* Write a Java program to create a class known as Person 
with methods called getFirstName() and getLastName(). 

Create a subclass called Employee that adds 
a new method named getEmployeeId() and 
overrides the getLastName() method to include the employee's job title.
*/
class Person{
    protected String firstName;
    protected String lastName;  
    void setFirstName(String firstName){
        this.firstName = firstName;
    }
    void getFirstName(){
        System.out.println("First Name: "+ this.firstName);
    }

    void setLastName(String lastName){
        this.lastName = lastName;
    }
    void getLastName(){
        System.out.println("Last Name: "+ this.lastName);
    }
}
class Employee extends Person{
    private String id;
    void setEmployeeId(String id){
        this.id = id;
    }
    void getEmployeeId(){
        System.out.println("Employee ID: "+ this.id);
    }

    @Override
    void getLastName(){
        System.out.println("Last Name: "+this.lastName+", Job Title: Software Engineer");
    }
}

public class example_1 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("John");
        person.setLastName("Doe");

        Employee employee = new Employee();
        employee.setFirstName("Jane");
        employee.setLastName("Smith");
        employee.setEmployeeId("67890");
    }
}