import java.util.List;

import static java.util.Comparator.*;

public class Main {

    static final String STAFF_TXT = "AdvancedOOPFeatures/homework_1/data/staff.txt";

    public static void main(String[] args) {
        List<Employee> staff = Employee.loadStaffFromFile(STAFF_TXT);
        sortBySalaryAndAlphabet(staff);
        staff.forEach(System.out::println);
    }

    public static void sortBySalaryAndAlphabet(List<Employee> staff) {

        //        Данный метод отработал не правильно, не могу понять почему.
        //        staff.sort((o1, o2) -> o1.getName().compareTo(o2.getName()) );
        // а вот этот уже сортирует как надо
        staff.sort(comparing(Employee::getName));

        staff.sort((o1, o2) -> Integer.compare(o1.getSalary(), o2.getSalary()));



    }
}