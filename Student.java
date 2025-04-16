import java.util.ArrayList;
import java.util.List;
public class Student {
    private int studentid;
    private String name;
    private List<Integer> grades;
    public Student(int studentid, String name) {
        this.studentid = studentid;
        this.name = name;
        this.grades = new ArrayList<>();
    }
    public int getstudentid() {
        return studentid;
    }
    public void setstudentid(int studentid) {
        this.studentid = studentid;
    }
    public String getname() {
        return name;
    }
    public void setname(String name) {
        this.name = name;
    }
    public void addgrade(int grade) {
        if (grade>=0 && grade<=100) {
            grades.add(grade);
            System.out.println("grade added: " + grade);
        } else {
            System.out.println("Invalid grade entered.");
        }
    }
    public void studentinfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + studentid);
        System.out.println("Grade: " + grades);
    }
    public static void main(String[]args) {
        System.out.println("NAME: G.HIMAJA");
        System.out.println("ROLL NO: AV.SC.U4CSE24111\n");

        Student s = new Student(766543, "Himaja" );
        s.addgrade(84);
        s.addgrade(98);
        s.addgrade(99);
        s.studentinfo();
        }
}
 