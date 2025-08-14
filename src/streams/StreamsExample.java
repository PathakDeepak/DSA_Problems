package streams;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;


public class StreamsExample {
    public static void main(String[] args) {

        //call methods
        longestString(); //1
        averageAge(); //2
        checkPrimeContains(); //3
        mergeSortedList(); //4
        findIntersection(); //5
        removeDuplicates(); //6
        sumTransaction(); //7
        nthSmallest(); //8
        frequency(); //9
        partitionGroup(); //10
    }

    //Extra thing needs
    record Person(String name, int age) {}
    record Transaction(String date, int amount){}

    //check prime number
    static Predicate<Integer> isPrime = (num) -> {
        if (num <= 1) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(num); i+=2) {
            if (num % i == 0) return false;
        }
        return true;
    };


    /**
     * Problems
     */

    //Find the longest string in a list of strings using Java streams
    public static void longestString() {
        List<String> list = Arrays.asList("apple", "banana", "cherry", "date", "grapefruit");

        //way - 1
        Optional<String> max = list.stream().max(String::compareTo);
        System.out.println(max.get());

        //way - 2
        Optional<String> max2 = list.stream().max(Comparator.comparing(String::length));
        System.out.println(max2.orElse("None"));
    }

    //Calculate the average age of a list of Person objects using Java streams
    static void averageAge(){
        List<Person> persons = Arrays.asList(
                new Person("Alice", 25),
                new Person("Bob", 30),
                new Person("Charlie", 35)
        );
        OptionalDouble avgAge = persons.stream().mapToInt(Person::age).average();
        System.out.println(avgAge.orElse(0));
    }

    //Check if a list of integers contains a prime number using Java streams
    static void checkPrimeContains() {
        List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10, 11, 12, 13, 14, 15);
        boolean result = numbers.parallelStream().anyMatch(isPrime);
        System.out.println(result);
    }

    //Merge two sorted lists into a single sorted list using Java streams

    /**
     * ✅ When to use .toList()
     *      You don't need to modify the resulting list
     *      <p>
     *      You're using Java 16 or higher
     *      <p>
     *      You're okay with immutability (adding/removing will throw UnsupportedOperationException)
     * <p>
     * ❌ When to keep Collectors.toList()
     *      You need a mutable list (e.g., add(), remove())
     *      <p>
     *      Your codebase targets Java 8–15
     *      <p>
     *      You want control over the type of list (e.g., Collectors.toCollection(LinkedList::new))
     */
    static void mergeSortedList() {
        List<Integer> list1 = Arrays.asList(1, 3, 5, 7, 9);
        List<Integer> list2 = Arrays.asList(2, 4, 6, 8, 10);
        List<Integer> mergeSorted = Stream.concat(list1.stream(), list2.stream())
                .sorted().toList();
        System.out.println(mergeSorted);
    }

    //Find the intersection of two lists using Java streams
    static void findIntersection() {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(3, 4, 5, 6, 7);
        List<Integer> intersectionResult = list1.stream().filter(list2::contains).toList();
        System.out.println(intersectionResult);

    }

    //Remove duplicates from a list while preserving the order using Java streams
    static void removeDuplicates() {
        List<Integer> numbersWithDuplicates = Arrays.asList(1, 2, 3, 2, 4, 1, 5, 6, 5);
        List<Integer> distinctElement = numbersWithDuplicates.stream().distinct().toList();
        System.out.println(distinctElement);
    }

    //Given a list of transactions, find the sum of transaction amounts for each day using Java streams
    static void sumTransaction() {
        List<Transaction> transactions = Arrays.asList(
                new Transaction("2022-01-01", 100),
                new Transaction("2022-01-01", 200),
                new Transaction("2022-01-02", 300),
                new Transaction("2022-01-02", 400),
                new Transaction("2022-01-03", 500)
        );
        Map<String, Integer> result = transactions.stream().collect(groupingBy(Transaction::date,
                summingInt(Transaction::amount)));
        System.out.println(result);
    }

    //Find the kth smallest element in an array using Java streams
    static void nthSmallest() {
        int[] array = {4, 2, 7, 1, 5, 3, 6};
        int k = 3; // Find the 3rd smallest element
        int result = Arrays.stream(array).sorted().skip(k-1).findFirst().orElse(-1);
        System.out.println(result);
    }

    //Given a list of strings, find the frequency of each word using Java streams
    static void frequency() {
        List<String> words = Arrays.asList("apple", "banana", "apple", "cherry",
                "banana", "apple");
        Map<String, Long> result = words.stream().collect(groupingBy(Function.identity(), counting()));
        System.out.println(result);
    }

    //Implement a method to partition a list into two groups based on a predicate using Java streams
    static void partitionGroup() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        Map<Boolean, List<Integer>> partition = numbers.stream().collect(groupingBy(n -> n%2 ==0));
        List<Integer> evenNumbers = partition.get(Boolean.TRUE);
        List<Integer> oddNumbers = partition.get(Boolean.FALSE);
        System.out.println(evenNumbers);
        System.out.println(oddNumbers);
    }


}
