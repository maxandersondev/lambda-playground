import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Comparator<String> stringComparitor = ( s1,  s2)->  s1.compareTo(s2);

        System.out.println(stringComparitor.compare ("Hello", "World"));
    }
}
