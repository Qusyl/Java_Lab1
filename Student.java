package Pckg;

public class Student {

    private String name;
    private String group;
    private int course;
    private int[] marks = null;
    private double AverMark;
    //Констркутор
    public Student(String Name, String Group, int Course, int[] Marks)
    {
        this.marks = Marks;
        this.name = Name;
        this.group = Group;
        this.course = Course;
    }
    public String getName() {
        return name;
    }

    private int SumFinder()
    {
        int k = 0;
        for(int x : marks)
        {
            k += x;
        }
        return k;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public double getAver()
    {
        FindAver();
        return this.AverMark;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }


   public void  FindAver()
    {
        this.AverMark = SumFinder()/marks.length;
    }

    public void PrintInfo()
    {

        System.out.println("Name : " + this.name);
        System.out.println("Course : " + this.course);
        System.out.println("Group : " + this.group);
        System.out.print("Marks : ");
        for(int x : marks)
        {
            System.out.print(x + " ");
        }
        FindAver();
        System.out.println(" ");
        System.out.println("Average mark : " + this.AverMark);
    }
}
