public class Student extends Person{
    private double gpa;
    private String classLevel;

    public String getClassLevel() {
        return classLevel;
    }

    public void setClassLevel(String classLevel) {
        this.classLevel = classLevel;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public Student() {
        gpa = 0.0;
        classLevel = "Freshman";
    }

    public Student(String name, int age, double gpa, String classLevel) {
        super(name, age);
        this.gpa = gpa;
        this.classLevel = classLevel;
    }

    @Override
    public String toString() {
        //return getName() + " is " + getAge() + " years old and has a gpa of " + gpa;
        return super.toString() + " and has a GPA of " + gpa + " and they are a " + classLevel;
    }
}
