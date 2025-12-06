class Student {
    String name;
    int age;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class OOPLab {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Hania Tahir";
        s1.age = 20;
        s1.display();
    }
}
