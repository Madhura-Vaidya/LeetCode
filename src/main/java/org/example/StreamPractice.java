package org.example;

import java.util.*;

import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StreamPractice {

    public static void main(String[] args){
        //find duplicate in a list
        List<Integer> nums = Arrays.asList(10,10,25,20,30,35,30);
        Set<Integer> set = nums.stream()
                .filter(n ->Collections.frequency(nums, n)>1)
                .collect(Collectors.toSet());
        System.out.println(set);

        //Calculate factorial of a number

        /*List<Integer> nums = Arrays.asList(15,10,30);
        int min = nums.stream().min(Comparator.comparingInt(num -> num)).orElse(0);
        System.out.println(min);
       /*OptionalDouble max = nums.stream().mapToInt(n -> n).average().;
        System.out.println(max.getAsDouble());
        String sum = nums.stream().collect(Collectors.joining(" "));
        sum);*/
        /*Stream.iterate(new int[]{0,1}, f ->new int[]{f[1], f[0]+f[1]} )
                .limit(10)
                .mapToInt(n -> n[0]).forEach(System.out::print);*/

        /*List<Employee> employees = Arrays.asList(new Employee("Madhura", 100000),
                new Employee("Hrihan", 50000),
                new Employee("Arya", 50000));
        Map<Long, List<Employee>> map  = employees.stream()
                .collect(Collectors
                        .groupingBy(e -> e.getSalary()));
        System.out.println(map);*/
        // Generate even numbers
        //Stream.iterate(0, n -> n+2).limit(10).forEach( System.out::print);
        //Generated Random numbers
       /*Stream.generate(Math::random)
                .limit(10)
                .toList()
                .forEach(System.out::println);*/


    }
}

 class Employee{
    private String name;
    private long salary;

    public Employee(){

    }
    public Employee(String name, long salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(long salary){
        this.salary = salary;
    }

    public long getSalary(){
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Employee employee)) return false;
        return salary == employee.salary && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary);
    }
}

