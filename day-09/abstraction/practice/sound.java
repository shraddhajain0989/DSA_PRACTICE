/*  Write a Java program to create an abstract class Animal
  with an abstract method called sound(). 
 Create subclasses Lion and Tiger that extend the Animal
  class and implement the sound() method to 
 make a specific sound for each animal.
*/

abstract class Animal{
    abstract void sound();

}
class Lion extends Animal{
    void sound(){
        System.out.println("Roar");
    }
}
class tiger extends Animal{
    void sound(){
        System.out.println("Growl");
    }
}

public class sound {
public static void main(String[]args){
    Lion lion = new Lion();
    lion.sound();

    tiger tiger = new tiger();
    tiger.sound();
}
}