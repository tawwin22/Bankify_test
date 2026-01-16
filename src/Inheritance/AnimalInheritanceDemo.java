package Inheritance;



//Base class
class Animal {
 // Method in the base class
 void eat() {
     System.out.println("This animal eats food.");
 }
}

//Derived class
class Dog extends Animal {
 // Method in the derived class
 void bark() {
     System.out.println("The dog barks.");
 }
}

public class AnimalInheritanceDemo {
 public static void main(String[] args) {
     // Creating an object of the derived class
     Dog myDog = new Dog();
     
     // Calling methods from both the base and derived class
     myDog.eat();  // Method from the base class
     myDog.bark(); // Method from the derived class
 }
}