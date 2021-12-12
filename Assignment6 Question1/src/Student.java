import java.util.Comparator;
import java.util.Date;

public class Student {
    private int id;
    private String name;
    private double gpa;
    private Date dateOfBirth;

    public Student(int id, String name, double gpa, Date dateOfBirthd){
        this.id = id;
        this.name = name;
        this.gpa = gpa;
        this.dateOfBirth = dateOfBirthd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }


    static class NameComparator implements Comparator<Student> {
        public int compare(Student a, Student b){
            return a.getName().compareTo(b.getName());
        }
    }


    static class DateOfBirthComparator implements Comparator<Student> {
        public int compare(Student a, Student b) {
            return a.getDateOfBirth().compareTo(b.getDateOfBirth());
        }
    }


    static class GpaComparator implements Comparator<Student> {
            public int compare(Student a, Student b) {
                return Double.compare(b.getGpa(), a.getGpa());
            }
    }

    @Override
    public String toString() {
        return "Name:" + this.name + "||" + "ID:" + this.id + "||" +"Gpa:" + this.gpa + "||" + "DateOfBirth:" + this.dateOfBirth;
    }




}
