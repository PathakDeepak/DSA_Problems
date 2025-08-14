package streams;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UsefulUtils {
    public static void main(String[] args) {
        String str = "Hello world";

        //convert to string stream
        Stream<String> stream = str.codePoints().mapToObj(String::valueOf);

        //convert to character stream
        Stream<Character> charStream = str.codePoints().mapToObj(c -> (char)c);
        List<Character> result = charStream.filter(s -> "aeiouAEIOU".indexOf(s)>=0).toList();
        System.out.println(result);

        Stream<Character> charStream2 = str.codePoints().mapToObj(c -> (char)c);
        Map<Character, Long> countResult = charStream2
                .filter(s -> "aeiouAEIOU".indexOf(s)>=0)
                        .collect(Collectors.groupingBy(Character::toLowerCase, Collectors.counting()));
        System.out.println(countResult);
    }
}
