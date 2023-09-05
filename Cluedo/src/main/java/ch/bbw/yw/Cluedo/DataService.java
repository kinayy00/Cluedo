package ch.bbw.yw.cluedo;

 

import java.util.ArrayList;

import java.util.List;

 

public class DataService {

    private List<Person> persons;

 

 

    public DataService() {

        this.persons = new ArrayList<>();

    }

 

    public void addPerson(Person person) {

        this.persons.add(person);

    }

 

    public List<Person> getPersons() {

        return persons;

    }

 

}