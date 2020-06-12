import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        IntStream.rangeClosed(8, 1000)
                .filter(number -> number > 100)
                .filter(number -> number % 5 == 0)
                .map(number -> number * 3)
                .limit(10)
                .forEach(System.out::println);

    }

}
