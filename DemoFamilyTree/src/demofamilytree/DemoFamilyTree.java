/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demofamilytree;
import demofamilytree.model.Person;
/**
 *
 * @author parju
 */
public class DemoFamilyTree {

    public static void main(String[] args) {
        Person[] people = new Person[3];
        people[0] = new Person("Camila", "Lopez");
        people[1] = new Person("Sebastian", "Lopez");
        people[2] = new Person("Andrea", "Orozco");
        
        people[0].setFather(people[1]);
        people[0].setMother(people[2]);
        
        for (Person person : people) {
            System.out.println("First Name: " + person.getFirstName());
            System.out.println("Last Name: " + person.getLastName());
            if(person.getFather() != null){
                System.out.println("    [Father] ");
                System.out.println("        First Name: " + person.getFather().getFirstName());
                System.out.println("        Last Name: " + person.getFather().getLastName());
            }
            
            if(person.getMother() != null){
                System.out.println("    [Mother] ");
                System.out.println("        First Name: " + person.getMother().getFirstName());
                System.out.println("        Last Name: " + person.getMother().getLastName());
            }
            System.out.println("");
        }
                
    }
    
}
