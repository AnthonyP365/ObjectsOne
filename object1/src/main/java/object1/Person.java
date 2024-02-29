
package object1;
public class Person {
    // Define Instance Variables
    // different for each object!
    private String name;
    private int age = 0;
    public int height; //units are centimeters

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.height = 0;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }

}
