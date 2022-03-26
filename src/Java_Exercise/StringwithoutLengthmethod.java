package Java_Exercise;

public class StringwithoutLengthmethod
{
    public static void main(String[] args) {
        String Name = "Snnehaw";

        int length = 0;
        for (char c : Name.toCharArray()) {
            length++;
        }
        System.out.println("length of String" + length);
    }
}

