import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,23,6,0,12,123,6,5,1,99,3,4,1,2);

        List<Integer> list1= Collections.singletonList(list.stream().mapToInt((x) -> Integer.parseInt(x.toString())).sum());
        System.out.println("array sum : "+list1);

        System.out.print("Arithmetic mean : ");
        list.stream().mapToInt(i -> i).average().ifPresent(System.out::println);

        System.out.println(list.stream().collect(Collectors.groupingBy(Function.identity())));
    }
}