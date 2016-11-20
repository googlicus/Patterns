package Filter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Данил on 21.11.2016.
 */
public class CriteriaSingle implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<>();
        for (Person person : persons){
            if (person.getMaritalStatus().equalsIgnoreCase("single")){
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}
