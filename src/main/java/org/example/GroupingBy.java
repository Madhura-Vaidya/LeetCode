package org.example;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupingBy {

    public static void main(String[] args){
        /*List<EmployeeGroup> eg = List.of(new EmployeeGroup("Madhura", 42),
                new EmployeeGroup("Amar", 42),
                new EmployeeGroup("Arya", 9),
                new EmployeeGroup("Hrihan", 7));
        Map<Integer, Long> employees = eg.stream()
                .collect(Collectors
                        .groupingBy(e -> e.getAge(), Collectors.counting()));
        //Stream.iterate(0, n-> n+2).limit(10).forEach(System.out::println);
        Stream.iterate(new int[]{0,1}, f -> new int[]{f[1],f[0] + f[1]})
                .limit(10)
                .mapToInt( n -> n[0])
                .forEach(System.out::println);
        System.out.println(employees);*/
        List <Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        list.remove(list.indexOf(1));
       list.size();
        System.out.println(list);

    }

}

class EmployeeGroup{
    private String name;
    private int age;



    public EmployeeGroup(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof EmployeeGroup employeeGroup)) return false;
        return age == employeeGroup.age && Objects.equals(name, employeeGroup.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
