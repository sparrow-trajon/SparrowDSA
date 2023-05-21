package models;

import java.io.InputStream;
import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo {

    public static void main(String[] args) {

        // creating the stream
        //     averageDemo();

        //   getStringWIthLength(5);
        //  multiplyBy(3);
        //  concatTwoStreams();

        //   removeDuplicate();

        // performCubeAndFilter(50);

        //   filterStringWithSpecialCharacter();
        // sortOnAge();

       // stringToNumber();
       // flatStreamsOfStream();

        fetchEven();

    }

    private static void fetchEven() {
        IntStream.range(10,200).boxed().forEach(x->{
            if(x%2==0){
                System.out.println(x);
            }
        });


    }

    private static void flatStreamsOfStream() {

        List<List<Integer>> list = Arrays.asList(
                Arrays.asList(11, 2, 3),
                Arrays.asList(4, 51, 6),
                Arrays.asList(7, 18, 9)
        );
       List<Integer> s= list.stream().flatMap(Collection::stream).collect(Collectors.toList());
        System.out.println(s);
    }

    private static void stringToNumber() {

        List<String> s = Arrays.asList("1", "2", "3", "4", "5", "6", "7");
        System.out.println((s.stream().mapToInt(Integer::valueOf).sum()));

    }

    private static void sortOnAge() {
        models.Employee e = new Employee(1, "manish", 1000, "man@gmail.com");
        models.Employee e1 = new Employee(2, "kunal", 2000, "kunal@gmail.com");
        models.Employee e2 = new Employee(3, "lokesh", 33000, "lokesh@gmail.com");
        Employee e3 = new Employee(4, "pritesh", 4000, "pritesh@gmail.com");
        models.Employee e4 = new Employee(5, "shivam", 5000, "shivam@gmail.com");
        Employee e5 = new Employee(6, "alok", 6000, "alok@gmail.com");
        models.Employee e6 = new Employee(7, "saurabh", 7000, "saurabh@gmail.com");
        Employee e7 = new Employee(8, "chandan", 8000, "chandan@gmail.com");
        Employee e8 = new Employee(9, "yogesh", 91000, "yogesh@gmail.com");
        Employee e9 = new Employee(10, "brijesh", 51000, "brijesh@gmail.com");

        List<Employee> list = new ArrayList();
        list.add(e9);
        list.add(e8);
        list.add(e7);
        list.add(e6);
        list.add(e5);
        list.add(e4);
        list.add(e3);
        list.add(e2);
        list.add(e1);
        list.add(e);

        //   list.sort((o1, o2) -> o1.getSalary()- o2.getSalary());
        ;
        System.out.println(Arrays.toString(list.stream().sorted((o1, o2) -> o1.getSalary() - o2.getSalary()).collect(Collectors.toList()).toArray()));
    }

    private static void filterStringWithSpecialCharacter() {

        List<String> list = Arrays.asList("Manish", "ish", "Egg", "great", "man", "brown", "email");

        List<String> newList = list.stream().filter(x -> !x.contains("e")).collect(Collectors.toList());
        System.out.println(Arrays.toString(newList.toArray()));
    }

    private static void performCubeAndFilter(int i) {

        IntStream s = IntStream.of(2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> c = s.map(x -> {
            x = x * x * x;
            return x;
        }).filter(x -> x > 50).boxed().collect(Collectors.toList());
        System.out.println(Arrays.toString(c.toArray()));
    }

    private static void removeDuplicate() {

        List<Integer> li = Arrays.asList(1, 2, 3, 4, 5, 1, 2, 2, 4, 5, 7, 77, 8, 8, 9, 10);
        // Set<Integer>ss= li.stream().collect(Collectors.toSet());
        List<Integer> ss = li.stream().distinct().collect(Collectors.toList());
        System.out.println(Arrays.toString(ss.toArray()));
    }

    private static void concatTwoStreams() {

        List<Integer> integerList1 = Arrays.asList(1, 5, 3, 4);
        List<Integer> integerList2 = Arrays.asList(2, 6, 7);
        List<Integer> ss = Stream.concat(integerList1.stream(), integerList2.stream()).collect(Collectors.toList());
        System.out.println(Arrays.toString(ss.toArray()));
    }

    private static void multiplyBy(int i) {
        int[] arr = {1, 2, 3, 4, 5, 5, 6, 7, 7, 9, 8, 10};

        List<Integer> ll = Arrays.stream(arr).map(x -> {
            x = x * i;
            return x;
        }).boxed().collect(Collectors.toList());
        System.out.println(Arrays.toString(ll.toArray()));
    }

    private static void getStringWIthLength(int l) {

        List<String> strings = Arrays.asList("manish", "kunal", "prajapati", "afadsf", "eqrasds", "davastr", "eqwurhjkx");

        List<String> filteredList = strings.stream().filter(x -> x.length() > l).collect(Collectors.toList());
        System.out.println(Arrays.toString(filteredList.toArray()));
    }

    public static void averageDemo() {
        IntStream stream = IntStream.of(1, 2, 3, -14, 5, 6, 7, 8);

        OptionalDouble obj = stream.average();
        IntStream stream1 = IntStream.of(1, 2, 3, -14, 5, 6, 7, 8);
        long totalItems = stream1.count();
        System.out.println(totalItems);

        IntStream s1 = IntStream.of(1, 2, 3, 4, 5, 6, 7, 7, 8, 9, 12);

        //System.out.println(s1.max().orElse(-1));
        System.out.println(s1.sum());

        // System.out.println(s1.distinct());

// If a value is present, isPresent() will
        // return true and getAsDouble() will
        // return the value
        if (obj.isPresent()) {
            System.out.println(obj.getAsDouble());
        } else {
            System.out.println("-1");
        }

    }

    public static void boxedDemo() {
        models.Employee e = new Employee(1, "manish", 1000, "man@gmail.com");
        models.Employee e1 = new Employee(2, "kunal", 2000, "kunal@gmail.com");
        models.Employee e2 = new Employee(3, "lokesh", 33000, "lokesh@gmail.com");
        Employee e3 = new Employee(4, "pritesh", 4000, "pritesh@gmail.com");
        models.Employee e4 = new Employee(5, "shivam", 5000, "shivam@gmail.com");
        Employee e5 = new Employee(6, "alok", 6000, "alok@gmail.com");
        models.Employee e6 = new Employee(7, "saurabh", 7000, "saurabh@gmail.com");
        Employee e7 = new Employee(8, "chandan", 8000, "chandan@gmail.com");
        Employee e8 = new Employee(9, "yogesh", 91000, "yogesh@gmail.com");
        Employee e9 = new Employee(10, "brijesh", 51000, "brijesh@gmail.com");

        List<Employee> list = new ArrayList();
        list.add(e9);
        list.add(e8);
        list.add(e7);
        list.add(e6);
        list.add(e5);
        list.add(e4);
        list.add(e3);
        list.add(e2);
        list.add(e1);
        list.add(e);


        boxedExample();

    }

    /**
     * In Java stream, the boxed() method is used
     * to convert a stream of primitive types (such as int, long, double, etc.)
     * to a stream of boxed types (such as Integer, Long, Double, etc.).
     * This is necessary because many of the stream operations, such as filter(),
     * map(), reduce(), etc.,
     * work only with streams of reference types.
     */
    public static void boxedExample() {


        double[] f = {100.212, 34.132, 314.46, 98.242, 3141.56, 95.34143};

        double sum = Arrays.stream(f).boxed().filter(x -> {
            return x > 10.22;
        }).mapToDouble(Double::doubleValue).sum();

        System.out.println(sum);
    }




}
