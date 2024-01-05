package RlTask;

import java.util.*;
import java.util.stream.Collectors;

public class Person{
    String name;
    int age;

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

    public static void main(String[] args) {
        Person person01 = new Person();
        person01.name = "Niko";
        person01.age = 32;

        Person person02 = new Person();
        person02.name = "Tim";
        person02.age = 24;

        Person person03 = new Person();
        person03.name = "Alexa";
        person03.age = 36;

        Person person04 = new Person();
        person04.name = "Sandro";
        person04.age = 24;

        Person person05 = new Person();
        person05.name = "Gris";
        person05.age = 32;

        Person person06 = new Person();
        person06.name = "End";
        person06.age = 48;

        List<Person> peopleList = new ArrayList<>();
        peopleList.add(person01);
        peopleList.add(person02);
        peopleList.add(person03);
        peopleList.add(person04);
        peopleList.add(person05);
        peopleList.add(person06);
//        for (Person per:peopleList) {
//            System.out.println(per.name);
//        }

//        peopleList.stream().map(e -> String.format("%s-%s", e.age, e.name))
//                .collect(Collectors.toList());
//        System.out.println(peopleList);

        List<String> info = peopleList.stream()
                .map(person -> person.age + "__" + person.name)
                .sorted().toList();

        Map<Integer, List<Person>> peopleByAge = peopleList.stream()
                .collect(Collectors.groupingBy(Person::getAge));



        //Collectors.groupingBy();
        System.out.println(info);
       // System.out.println(peopleByAge);


        //System.out.println(retriedOb);
        //System.out.println(objectList);

//                Map<Integer, String> map = new HashMap<>();
//        map.put(person01.age, person01.name);
//        map.put(person02.age, person02.name);
//        map.put(person03.age, person03.name);
//        map.put(person04.age, person04.name);
//        map.put(person05.age, person05.name);
//        map.put(person06.age, person06.name);
//        System.out.println(map);



    }

}
