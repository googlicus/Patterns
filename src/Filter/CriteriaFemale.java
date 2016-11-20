package Filter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Данил on 21.11.2016.
 */
public class CriteriaFemale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<>();
        for (Person person : persons){
            if (person.getGender().equalsIgnoreCase("female")){
                femalePersons.add(person);
            }
        }

        return femalePersons;
    }
}
