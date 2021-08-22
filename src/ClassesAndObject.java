public class ClassesAndObject {


    public static void main(String[] args)
    {
      Person name1= new Person();
      name1.Age=10;
      name1.Name="preeti";

      Person name2= new Person();
      name2.Name="Iyer";
      name2.Age =34;

        name1.speak();

    }
    static class Person{
        String Name;
        int Age;

        void speak()
        {
            System.out.println("hello");
        }

    }
}
