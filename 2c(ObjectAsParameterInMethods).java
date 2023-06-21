public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("John", 20);
        changeAge(person1, 40);
        System.out.println(person1.getName() + " age is: " + person1.getAge());
    }

    public static void changeAge(Person person, int newAge) {
        person.setAge(newAge);
    }

    static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}
