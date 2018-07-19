package task2;

import java.util.List;

public interface DummyDao {

    List<Hobby> getHobbies(User user);

    Double getHobbyAverageCost(Hobby hobby);

    Double getHobbyCosts(User user);
}