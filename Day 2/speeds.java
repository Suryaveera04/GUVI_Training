
class vehical {
    int speed = 30;
}

class car extends vehical{
    int speed = 50;
    void display(){
        System.out.println("car Speed"+ speed);
        System.out.println("Vehical speed"+ super.speed);
    }
}

public class speeds{
    public static void main(String[] args) {
        car c = new car();
        c.display();
    }
}