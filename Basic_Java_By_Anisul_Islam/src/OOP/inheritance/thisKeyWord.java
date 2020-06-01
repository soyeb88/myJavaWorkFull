package OOP.inheritance;

public class thisKeyWord {

    public static class Person {

        String name;
        int age;
        String hairColor;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Person(String name, int age, String hairColor) {
            this(name, age);
            this.hairColor = hairColor;
        }

        void display() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Hair Color: " + hairColor);
            System.out.println();
        }

        void messageHi() {
            System.out.println("This is method messageHi");
        }

        void messageHello() {
            this.messageHi();
            System.out.println("This is method messageHello");
        }

    }

    public static void main(String[] args) {
        Person person = new Person("Nasir", 27);
        person.display();

        Person person2 = new Person("Soyeb", 26, "Black");
        person2.display();
        
        person2.messageHello();
    }
}
