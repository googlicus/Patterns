package Filter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Данил on 21.11.2016.
 */
public class FilterDemo {
    public static void main(String[] args){
        List<Person> persons = new ArrayList<Person>();

        persons.add(new Person("Robert","Male", "Single"));
        persons.add(new Person("John", "Male", "Married"));
        persons.add(new Person("Laura", "Female", "Married"));
        persons.add(new Person("Diana", "Female", "Single"));
        persons.add(new Person("Mike", "Male", "Single"));
        persons.add(new Person("Bobby", "Male", "Single"));

        Criteria male = new CriteriaMale();
        Criteria female = new CriteriaFemale();
        Criteria single = new CriteriaSingle();
        Criteria maleSingle = new AndCriteria(male, single);
        Criteria femaleOrSingle = new OrCriteria(female, single);

        System.out.println("Males:");
        printPersons(male.meetCriteria(persons));
        System.out.println("Females");
        printPersons(female.meetCriteria(persons));
        System.out.println("Single");
        printPersons(single.meetCriteria(persons));
        System.out.println("And");
        printPersons(maleSingle.meetCriteria(persons));
        System.out.println("Or");
        printPersons(femaleOrSingle.meetCriteria(persons));
    }

    public static void printPersons(List<Person> persons){
        for (Person person : persons){
            System.out.println(String.format("Person; name:%s, gender:%s, marr: %s", person.getName(),
                    person.getGender(), person.getMaritalStatus()));
        }
    }
}
