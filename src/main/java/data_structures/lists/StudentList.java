package data_structures.lists;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * created by ANEK on Monday 2/14/2022 at 10:45 AM
 */
@AllArgsConstructor
@ToString
class MyList
{
    public String name;
    public int roll;

}
public class StudentList
{
    public static void main(String[] args)
    {
        ArrayList<MyList> studentList = new ArrayList<>();
        studentList.add(new MyList("ramesh",22));
        studentList.add(new MyList("Anek",37));
        System.out.println(studentList.size());

        studentList.forEach(e -> System.out.println(e.name));
        List<String> studentList2 = studentList.stream().map(item ->item.name.toUpperCase()).collect(Collectors.toList());
        studentList2.forEach(e-> System.out.println(e));
    }
}

