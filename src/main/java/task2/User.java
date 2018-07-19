package task2;

import org.apache.log4j.Logger;

import java.util.*;

public class User {
    private Logger logger = Logger.getLogger(User.class.toString());

    private String name;

    private String surname;

    public User() {
        this(null, null);
    }

    public User(String name) {
        this(name, null);
    }

    public User(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Set<Hobby> getUserHobbies(DummyDao dao) {
        logger.debug("Get " + this.name + "'s hobbies from database");
        return new TreeSet<Hobby>(dao.getHobbies(this));
    }

    public Double calculateHobbyCosts(DummyDao dao) {
        logger.debug("Get " + this.name + "'s all hobbies costs from database");
        return dao.getHobbyCosts(this);
    }
}