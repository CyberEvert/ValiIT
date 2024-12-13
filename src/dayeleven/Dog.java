package dayeleven;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }
    public void bark() {
        System.out.println(name + "bark bark");
    }
    @Override
    public void sound() {
        System.out.println("Sound: Bark");
    }
}
