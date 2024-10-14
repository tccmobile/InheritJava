public class Person {
    private String name;
    private int age;


    public Person() {
        name = "unknown";
        age = 0;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return name + " is " + age + " years old";
    }

    public void haveBirthday(){
        age++;
    }
}
