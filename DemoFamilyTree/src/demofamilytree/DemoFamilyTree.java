package demofamilytree;

import demofamilytree.model.Person;

/**
 * @author parju
 */
public class DemoFamilyTree {

    public static void main(String[] args) {
        Person[] people = new Person[7];
        people[0] = new Person("Salome", "Henao Parra");
        people[1] = new Person("Hugo", "Henao Posada");
        people[2] = new Person("Maria", "Parra Giraldo");
        people[3] = new Person("Alberto", "Henao Aguirre");
        people[4] = new Person("Elena", "Posada Londoño");
        people[5] = new Person("Noraldo", "Parra");
        people[6] = new Person("Limbania", "Giraldo Castillo");

        people[0].setFather(people[1]);
        people[0].setMother(people[2]);

        people[1].setFather(people[3]);
        people[1].setMother(people[4]);

        people[2].setFather(people[5]);
        people[2].setMother(people[6]);

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

}
