package Animal;

public class Dog extends Animal implements NoiseCapable{

    public Dog(String name) {
        super(name);
    }

    public Dog(){
        super("Dog");
    }

    public void bark(){
        System.out.println(super.name + " barks");
    }

    public void eat(){
        System.out.println(name + " eats.");
    }

    public void sleep(){
        System.out.println(name + " sleeps.");
    }

    @Override
    public void makeNoise() {
        System.out.println(name + " barks.");
    }
}
