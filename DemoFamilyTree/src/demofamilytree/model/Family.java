package demofamilytree.model;

import java.util.ArrayList;

/**
 * @author parju
 */
public class Family {
    private ArrayList<Person> people = new ArrayList<>();

    public ArrayList<Person> getPeople() {
        return people;
    }
    
    public void addPerson(Person newPerson){
        this.people.add(newPerson);
    }
    
    public Person getPerson(int anId){
        for (Person person : people) {
            if(person.getId() == anId){
                return person;
            }
        }
        
        return null;
    }
}
