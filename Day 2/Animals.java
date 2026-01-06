
class Animal {
    public void Sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    public void Sound() {
        System.out.println("Dog barks");
        super.Sound();
    }
}

public class Animals {
    public static void main(String[] args){
        Dog a = new Dog();
        a.Sound();
    }}