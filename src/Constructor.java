public class Constructor {

    public static void main (String[] args)
    {
        Student student1= new Student();
        student1.showInfo();
    }
}

class Student {
    String name;
    int Age;
    void showInfo()
    {
        System.out.println("hi");
    }
}
