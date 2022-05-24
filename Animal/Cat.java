package Animal;

public class Cat extends Animal implements NoiseCapable{

    public Cat(String name){
        super(name);
    }

    public Cat(){
        super("Cat");
    }

    public void purr(){
        System.out.println(name + " purrs.");
    }

    public void eat(){
        System.out.println(name + " eats.");
    }

    public void sleep(){
        System.out.println(name + " sleeps.");
    }

    @Override
    public void makeNoise() {
        System.out.println(name + " purrs.");
    }


}
