package demofamilytree;

import demofamilytree.model.Person;
import demofamilytree.model.Family;
import java.util.ArrayList;
import cafsoft.foundation.Data;

/**
 * @author parju
 */
public class DemoFamilyTree {

    public static void main(String[] args) {
        Family family = new Family();
        ArrayList<Person> people = new ArrayList<>();
        Person person1 = null;
        Person father = null;
        Person mother = null;
        
        Data data = null;
        String path = "C:\\Users\\parju\\Google Drive\\Prog 2\\ProgII\\Family.txt";
        String text = "";
        
        family.addPerson(new Person(family, 100, "Salome", "Henao Parra", Person.SEX_FEMALE));
        family.addPerson(new Person(family, 101, "Juan", "Henao Parra", Person.SEX_MALE));
        family.addPerson(new Person(family, 102, "Hugo", "Henao Posada", Person.SEX_MALE));
        family.addPerson(new Person(family, 103, "Maria", "Parra Giraldo", Person.SEX_FEMALE));
        family.addPerson(new Person(family, 104, "Alberto", "Henao Aguirre", Person.SEX_MALE));
        family.addPerson(new Person(family, 105, "Elena", "Posada Londoño", Person.SEX_FEMALE));
        family.addPerson(new Person(family, 106, "Noraldo", "Parra", Person.SEX_MALE));
        family.addPerson(new Person(family, 107, "Limbania", "Giraldo Castillo", Person.SEX_FEMALE));
        
        people = family.getPeople();
        
        person1 = family.getPerson(100);
        father = family.getPerson(102);
        mother = family.getPerson(103);
        
        person1.setFather(father);
        person1.setMother(mother);
        
        person1 = family.getPerson(101);
        person1.setFather(father);
        person1.setMother(mother);
        
        person1 = family.getPerson(100);
        
        for (Person brother : person1.getBrothers()) {
            System.out.println("Hermano:" + brother.getFirstName());
        }
        
        for (Person person : people) {
            System.out.println("Name: " + person.getFullName());
            
            if (person.getFather() != null) {
                System.out.println("    [Father] ");
                System.out.println("        Name: " + person.getFather().getFullName());
                if (person.getPaternalGrandFather() != null) {
                    System.out.println("        [Paternal GrandFather]");
                    System.out.println("            Name: " + person.getPaternalGrandFather().getFullName());
                }
                if (person.getPaternalGrandMother() != null) {
                    System.out.println("        [Paternal GrandMother]");
                    System.out.println("            Name: " + person.getPaternalGrandMother().getFullName());
                }
            }

            if (person.getMother() != null) {
                System.out.println("    [Mother] ");
                System.out.println("        Name: " + person.getMother().getFullName());
                if (person.getPaternalGrandFather() != null) {
                    System.out.println("        [Maternal GrandFather]");
                    System.out.println("            Name: " + person.getMaternalGrandFather().getFullName());
                }
                if (person.getPaternalGrandMother() != null) {
                    System.out.println("        [Maternal GrandMother]");
                    System.out.println("            Name: " + person.getMaternalGrandMother().getFullName());
                }
            }
            System.out.println("");
        }
    }
}
