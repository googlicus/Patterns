package Filter;

import java.util.List;

/**
 * Created by Данил on 21.11.2016.
 */
public interface Criteria {
    List<Person> meetCriteria(List<Person> persons);
}
