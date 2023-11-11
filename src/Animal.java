import java.util.Objects;

public abstract class Animal {
private String name;

public Animal(){}
public Animal(String name){
    this.name = name;
}

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
    return name;
    }

    public void outputName(){
    System.out.println("My name is " + name);
    }

    public void bark(){
    System.out.println("make sound");
}
    @Override
public boolean equals(Object obj){
    if(this == obj) return true;
    if(obj == null || getClass() != obj.getClass())
        return false;
    Animal animal = (Animal)obj;
    return Objects.equals(name,animal.name);
}
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}
