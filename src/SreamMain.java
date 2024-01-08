import java.util.Comparator;

public class SreamMain {
      .filter(x -> x > 0)
            .filter(x -> x % 2 == 0)
            .sorted(Comparator.naturalOrder())
            .forEach(System.out::println);
}

