
public class HerarichalIheritence {
  public static void main(String[] args) {
    Bird b1 = new Bird();
    b1.eat();
  }
}

class Animal {
  String color;

  void eat() {
    System.out.println("eats...");
  }

  void breathe() {
    System.out.println("breathes...");
  }
}

class Mammal extends Animal {
  void walk() {
    System.out.println("Walking..");
  }
}

class Fish extends Animal {
  void swim() {
    System.out.println("Swimming..");
  }
}

class Bird extends Animal {
  void fly() {
    System.out.println("Flying...");
  }
}
