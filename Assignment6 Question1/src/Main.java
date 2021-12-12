import java.util.ArrayList;
//import java.util.Collection;
import java.util.Collections;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Student studentA = new Student(001, "Pieter", 3.8, new Date(1998,1,21));
        Student studentB = new Student(002, "Min", 3.5, new Date(1999,3,26));
        Student studentC = new Student(003, "Rio", 3.6, new Date(1996,9,19));
        Student studentD = new Student(004, "Mike", 3.2, new Date(2000,8,14));
        Student studentE = new Student(005, "James", 3.4, new Date(2001,6,28));
        Student studentF = new Student(006, "Joy", 4.0, new Date(2003,5,17));

        ArrayList<Student> students = new ArrayList<Student>();
        students.add(studentA);
        students.add(studentB);
        students.add(studentC);
        students.add(studentD);
        students.add(studentE);
        students.add(studentF);

        System.out.println("====================");
        System.out.println("Sort by ascending order of name:");
        Collections.sort(students, new Student.NameComparator());
        for(Student s: students){
            System.out.println(s.toString());
        }

        System.out.println("====================");
        System.out.println("Sort by descending order of gpa:");
        Collections.sort(students, new Student.GpaComparator());
        for(Student s: students){
            System.out.println(s.toString());
        }


        System.out.println("====================");
        System.out.println("ort by ascending order of DateOfBirth:");
        Collections.sort(students, new Student.DateOfBirthComparator());
        for(Student s: students){
            System.out.println(s.toString());
        }





    }
}
