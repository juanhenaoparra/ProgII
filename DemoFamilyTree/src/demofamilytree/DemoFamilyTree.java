package demofamilytree;

import demofamilytree.model.Person;
import demofamilytree.model.Family;
import demofamilytree.storage.Storage;
import java.util.ArrayList;
import cafsoft.foundation.Data;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author parju
 */
public class DemoFamilyTree {

    public static void main(String[] args) throws URISyntaxException {
        Family family = new Family();
        ArrayList<Person> people = new ArrayList<>();
        ArrayList<Person> brothers = null;
        ArrayList<Person> sisters = null;
        Person p = null;
        Person father = null;
        Person mother = null;
        
        Data data = null;
        String path = "C:\\Users\\parju\\Google Drive\\Prog 2\\ProgII\\Family.csv";
        String text = "";
        
        Storage storage = new Storage();
        
        try{
            family = storage.loadFile(path);
        } catch (IOException ex) {
            Logger.getLogger(DemoFamilyTree.class.getName()).log(Level.SEVERE, null, ex);
        }
                       
        people = family.getPeople();
        
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
