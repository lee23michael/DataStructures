package src;

public class Student
{
    public String name;
    public int score;

    public void speak()
    {
        System.out.println(name + " : " + score);

    }
    public Student(String name, int score)
    {
        this.name = name;
        this.score = score;
    }
}
