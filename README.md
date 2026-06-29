class Student {
    private int id;
    private String name;
    private double marks;

    public Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }

    public void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

class CollegeStudent extends Student {
    private String course;

    public CollegeStudent(int id, String name, double marks, String course) {
        super(id, name, marks);
        this.course = course;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Course: " + course);
    }
}

public class Main {
    public static void main(String[] args) {

        CollegeStudent s1 = new CollegeStudent(101, "Arushi", 89.5, "BCA");

        System.out.println("Student Details:");
        s1.displayDetails();

        int[] marksArray = {80, 85, 90, 95, 88};

        int sum = 0;
        for (int mark : marksArray) {
            sum += mark;
        }

        double average = (double) sum / marksArray.length;

        if (average >= 90) {
            System.out.println("Grade: A");
        } else if (average >= 75) {
            System.out.println("Grade: B");
        } else {
            System.out.println("Grade: C");
        }
    }
}
