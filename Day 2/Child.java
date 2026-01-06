
class GrandParents {
    void sound() {
        System.out.println("Grand paaa");
    }
}
class parent extends GrandParents{
    void call() {
        System.out.println("Mummy");
    }
}
class Child extends parent {
    void sound() {
        super.sound();
        super.call();
        System.out.println("Ewwww");
    }

    public static void main(String[] args) {
        Child ch = new Child();
        ch.sound();
    }
}
