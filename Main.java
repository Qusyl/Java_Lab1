package Pckg;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    //Отсеивает тех, у кого средний бал ниже 3
    public static void RemoveLowSkill(List<Student> students){
        Iterator<Student> iterator = students.iterator();//создал итератор, для прохода по списку
        while(iterator.hasNext())
        {
            Student CurrentStudent = iterator.next();
            if(CurrentStudent.getAver() < 3)
            {
                iterator.remove();
            }
            if(CurrentStudent.getAver() >= 3)
            {
                CurrentStudent.setCourse(CurrentStudent.getCourse() + 1);// курс увеличивается
            }
        }
    }
    //Вывод имен студентов, которые учатся на этом же курсе
    public static void PrintStundetsNames(List<Student> students, int course){
        int index = 1;
        for(Student student : students)
        {
            if(student.getCourse() == course)
            {
                System.out.println(index + "." + student.getName());
                index++;
            }
        }
    }
    //Поиск длины списка
    public static int FindListLen(List<Student> students)
    {
                int k = 0;
                for(Student student : students)
                {
                    k++;
                }
                return k;
    }
    //Вывод информации обо всех студентах
    public static void PrintStudents(List<Student> students)
    {
        System.out.println("NAME     GROUP    COURSE          MARKS");
        for(Student student : students)
        {
            student.PrintInfo();
            System.out.println("-------------------------------");
        }
    }

    public static void main(String[] args) {
        int[] Marks1 = { 4,5,2,3,4,5,5,5};
        int[] Marks2 = { 2,5,3,3,4,3,5,2};
        int[] Marks3 = { 5,5,5,5,4,4,3,5};
        int[] Marks4 = { 2,2,2,3,4,3,5,5};
        int[] Marks5 = { 2,2,2,2,3,3,2,3};
        List<Student> students = new ArrayList<>();
        students.add(new Student("Denis","IVT-1",2, Marks1));
        students.add(new Student("Vlad","PRI-2",1, Marks2));
        students.add(new Student("Tailer","IVT-2",1, Marks3));
        students.add(new Student("Bill","MOA-1",2, Marks4));
        students.add(new Student("Vasya","SPIS-2",4, Marks5));
        System.out.println("-----------Studets list before----------");
        PrintStudents(students);
        System.out.println("-----------Studets list after filter----------");
        RemoveLowSkill(students);
        PrintStudents(students);
        System.out.println("-----------Studets, who have same course----------");
        PrintStundetsNames(students,2);
    }
}
