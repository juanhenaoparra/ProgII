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
        ArrayList<Person> brothers = null;
        ArrayList<Person> sisters = null;
        Person per = null;
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
        
        per = family.getPerson(100);
        father = family.getPerson(102);
        mother = family.getPerson(103);
        
        per.setFather(father);
        per.setMother(mother);
        
        per = family.getPerson(101);
        per.setFather(father);
        per.setMother(mother);
        
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
      
            brothers = person.getBrothers();
            
            if(brothers.isEmpty() == false){                
                System.out.println("[Brothers]");
                for (Person brother : brothers) {
                    System.out.println("    Name:" + brother.getFullName());
                }
            }
            
            sisters = person.getSisters();
            
            if(sisters.isEmpty() == false){                
                System.out.println("[Sisters]");
                for (Person sister : sisters) {
                    System.out.println("    Name:" + sister.getFullName());
                }
            }
            
            System.out.println("");
        }
    }
}
