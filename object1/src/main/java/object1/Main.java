package object1;

import java.util.logging.Logger;

public class Main {

    public static void main(String... args) {
        Logger logger = Logger.getLogger(Main.class.getName());
        logger.info("This is a module-using Hello World!");

    Person person1 = new Person("John", 30);
        System.out.println(person1.height);

    Person[] people = new Person[10];
        Person person2 = new Person("Alice", 25);
        Person person3 = new Person("Bob", 30);
        Person person4 = new Person("Anthony", 33);
        Person person5 = new Person("Tony", 41);
        Person person6 = new Person("James", 22);
        Person person7 = new Person("Jasmine", 28);
        Person person8 = new Person("Kyle", 45);
        Person person9 = new Person("Brittany", 25);
        Person person10 = new Person("Percy", 24);
        Person person11 = new Person("Dan", 39);

        people[0] = person2;
        people[1] = person3;
        people[2] = person4;
        people[3] = person5;
        people[4] = person6;
        people[5] = person7;
        people[6] = person8;
        people[7] = person9;
        people[8] = person10;
        people[9] = person11;

    Car[] carType = new Car[3];
        Car car1 = new Car("Honda","Accord", 2019, 100000);
        Car car2 = new Car("Honda", "Civic", 2004, 150000);
        Car car3 = new Car("Nissan", "Sentra", 2015, 90000);

        carType[0] = car1;
        carType[1] = car2;
        carType[2] = car3;

    Chair[] chairType = new Chair[3];
        Chair chair1 = new Chair("Leather", "Brown", 4);
        Chair chair2 = new Chair("Suede", "Black", 4);
        Chair chair3 = new Chair("Cloth", "Blue", 4);

        chairType[0] = chair1;
        chairType[1] = chair2;
        chairType[2] = chair3;

    Dog[] dogType = new Dog[3];
        Dog dog1 = new Dog("Duece", 2, "Pitbull");
        Dog dog2 = new Dog("Spot", 8, "Dalmation");
        Dog dog3 = new Dog("Tommie", 6, "Shih Tzu");

        dogType[0] = dog1;
        dogType[1] = dog2;
        dogType[2] = dog3;

    }

}
