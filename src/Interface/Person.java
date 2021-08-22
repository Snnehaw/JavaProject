package Interface;

public class Person implements Interface {
    int id;
    String name ;

    public void pid(int id)
    {
        this.id =id;
        System.out.println("id of person is" +id);
    }
    public void pName(String name)
    {
        this.name=name;
        System.out.println("name of person is" +name);
    }

    public void ShowInfo()
    {
        System.out.println("Info is displayed");
    }
}
