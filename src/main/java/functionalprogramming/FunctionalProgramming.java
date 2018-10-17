package functionalprogramming;

import io.vavr.control.Try;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FunctionalProgramming<T> {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 6, 7);
        Stream<Integer> integerStream = list.stream().filter(e -> e % 2 == 0);

        //System.out.println(integerStream.collect(Collectors.toList()));

        //list.stream().collect(Collectors.groupingBy(i -> i, Collectors.counting()));
        // System.out.println(test());
        //System.out.println(newMe());
    }

    static <T> FunctionalProgramming<T> hello(T test1) {
        return null;
    }

 /*   static <T> FunctionalProgramming<T> newMe() {

    }*/


    static Try<Object> test() {
        System.out.println("try demo");
        if (true) {
            return Try.failure(new Throwable());
        }
        return Try.success(new Object());
    }
}

/*

class Test<T> {





  */
/*  static <U> void doIt(U object) {
    }
*//*


}
*/
