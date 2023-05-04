package src;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class StudentGrade
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the number of students");
        int num = sc.nextInt();

        Student[] students = new Student[num];

        for(int i = 0; i < num ; i++)
        {
            System.out.println("Please enter student's name and score, separated by space");
            students[i] = new Student(sc.next(),sc.nextInt());
//            students[i].name = sc.next();
//            students[i].score = sc.nextInt();
        }

        System.out.println("\nInput: ");

        for(Student student : students)
        {
            student.speak();
        }

        Comparator<Student> comp = new Comparator<Student>()
        {
            @Override
            public int compare(Student o1, Student o2)
            {
                return o2.score - o1.score;
            }
        };

        Arrays.sort(students,comp);

        System.out.println("\nSorted: ");

        for(Student student : students)
        {
            student.speak();
        }

    }

}