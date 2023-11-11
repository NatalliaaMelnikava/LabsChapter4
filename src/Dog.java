import java.util.Objects;

public class Dog extends Animal{
public Dog(String name){
    super(name);
}
public void bark(){
System.out.println("Woof-woof!");
}
public void run(){
    System.out.println("I'm running");
}
public void jump(){
    System.out.println("I'm jumping");
}
public void bite(){
    System.out.println("*bite you gently*");
}
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        Dog dog = (Dog) obj;
        return Objects.equals(getName(),dog.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getName());
    }

    @Override
    public String toString() {
        return "Собака{" +
                "имя='" + getName() + '\'' +
                '}';
    }
}
