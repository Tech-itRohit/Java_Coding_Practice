package data_structures.lists;

import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * created by ANEK on Monday 2/14/2022 at 10:45 AM
 */
@AllArgsConstructor
@ToString
@Setter
@Getter
class Employee
{
    public String name;
    public int roll;

}
public class StudentList
{
    public static void main(String[] args)
    {
        ArrayList<Employee> studentList = new ArrayList<>();
        studentList.add(new Employee("ramesh",22));
        studentList.add(new Employee("Anek",37));
        studentList.add(new Employee("Tutsi",38));
        studentList.add(new Employee("Anek2",32));
        studentList.add(new Employee("Sonu",31));
        System.out.println(studentList.size());

        studentList.forEach(e -> System.out.println(e.name));
        studentList
                .stream()
                .map(item ->item)
                .filter(item -> item.getName().contains("T") )
                .collect(Collectors.toList())
        .forEach(e-> System.out.println(e));
    }
}

