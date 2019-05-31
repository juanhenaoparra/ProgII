package demofamilytree;

import demofamilytree.model.Person;
import java.util.ArrayList;

/**
 * @author parju
 */
public class DemoFamilyTree {

    public static void main(String[] args) {
        Person[] people = new Person[8];
        people[0] = new Person("Salome", "Henao Parra");
        people[1] = new Person("Juan", "Henao Parra");
        people[2] = new Person("Hugo", "Henao Posada");
        people[3] = new Person("Maria", "Parra Giraldo");
        people[4] = new Person("Alberto", "Henao Aguirre");
        people[5] = new Person("Elena", "Posada Londoño");
        people[6] = new Person("Noraldo", "Parra");
        people[7] = new Person("Limbania", "Giraldo Castillo");

        people[0].setFather(people[1]);
        people[0].setMother(people[2]);
        people[1].setFather(people[1]);
        people[1].setMother(people[2]);

        people[2].setFather(people[4]);
        people[2].setMother(people[5]);

        people[3].setFather(people[6]);
        people[3].setMother(people[7]);

        ArrayList<Person> Brothers;
        
        System.out.println("Brother: ");
        Brothers = getBrothers(people[0], people);
        
        for (Person brother : Brothers) {
            System.out.println(brother.getFirstName() + " " + brother.getLastName());
        }

        for (Person person : people) {
            System.out.println("First Name: " + person.getFirstName());
            System.out.println("Last Name: " + person.getLastName());
            
            if (person.getFather() != null) {
                System.out.println("    [Father] ");
                System.out.println("        First Name: " + person.getFather().getFirstName());
                System.out.println("        Last Name: " + person.getFather().getLastName());
                if (person.getPaternalGrandFather() != null) {
                    System.out.println("        [Paternal GrandFather]");
                    System.out.println("            First Name: " + person.getPaternalGrandFather().getFirstName());
                    System.out.println("            Last Name: " + person.getPaternalGrandFather().getLastName());
                }
                if (person.getPaternalGrandMother() != null) {
                    System.out.println("        [Paternal GrandMother]");
                    System.out.println("            First Name: " + person.getPaternalGrandMother().getFirstName());
                    System.out.println("            Last Name: " + person.getPaternalGrandMother().getLastName());
                }
            }

            if (person.getMother() != null) {
                System.out.println("    [Mother] ");
                System.out.println("        First Name: " + person.getMother().getFirstName());
                System.out.println("        Last Name: " + person.getMother().getLastName());
                if (person.getPaternalGrandFather() != null) {
                    System.out.println("        [Maternal GrandFather]");
                    System.out.println("            First Name: " + person.getMaternalGrandFather().getFirstName());
                    System.out.println("            Last Name: " + person.getMaternalGrandFather().getLastName());
                }
                if (person.getPaternalGrandMother() != null) {
                    System.out.println("        [Maternal GrandMother]");
                    System.out.println("            First Name: " + person.getMaternalGrandMother().getFirstName());
                    System.out.println("            Last Name: " + person.getMaternalGrandMother().getLastName());
                }
            }
            System.out.println("");
        }

    }
    
    public static ArrayList<Person> getBrothers(Person person, Person[] people){
        ArrayList<Person> Brothers = new ArrayList<>();
        Brothers.add(person);
        
        for (int i = 0; i < people.length - 1; i++) {
            if (people[i].getFather() == people[i + 1].getFather()) {
                Brothers.add(people[i + 1]);
            }
        }
        
        return Brothers;
    }

}
