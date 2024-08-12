package Starting_Java_Code.Oops;

/**
 * Animal
 */
class Animal {
    int legs;
    void eat(){
        System.out.println("Eating...");
    }
}

// Encapsulation class

class Employee {
    private int empId;
    private String name;

    int getempId(){
        return empId;
    }
    void setempId(int id){
        empId = id;
    }
}

// Main Class

public class Lecture1 {
    public static void main(String[] args) {
        Animal cat = new Animal();
        cat.legs = 4;
        System.out.println("Legs = "+cat.legs);
        cat.eat();
    }
}
