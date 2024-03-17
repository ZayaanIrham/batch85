public class Student {
    // Private variables
    private String name;
    private int age;
    private double grade;

    // Constructor
    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // Method to display student info
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }

    // Getter and setter methods
    String getName() {
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

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }



    public static void main(String[] args) {
        // Creating a Student object
        Student student1 = new Student("Alice", 20, 85.5);

        // Displaying student info
        student1.displayInfo();

        // Modifying student info
        student1.setGrade(90.0);

        // Displaying updated info
        System.out.println("\nAfter update:");
        student1.displayInfo();
    }
}