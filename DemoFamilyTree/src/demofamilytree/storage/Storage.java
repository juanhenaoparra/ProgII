package demofamilytree.storage;

import demofamilytree.model.Family;
import cafsoft.foundation.Data;
import demofamilytree.model.Person;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Paths;


/**
 * @author parju
 */
public class Storage {
    
    private Data loadData(String localPath) throws IOException, URISyntaxException{
        Data data = null;
        
        data = new Data(Paths.get(localPath).toUri().toURL());
        
        return data;
    }
    
    public Family loadFile(String localPath) throws IOException, URISyntaxException{
        Data data = loadData(localPath);
        String text = "";
        String[] rows = null;
        String[] cells = null;
        
        Family family = new Family();
        Person person = null;
        
        int id = 0, idF = 0, idM = 0;
        String fN, lN;
        char s = '?';
        
        if(data != null){
            text = data.toText();
            rows = text.split("\r\n");
            
            for (int r = 1; r < rows.length; r++) {
                cells = rows[r].split(",");
                
                id = Integer.parseInt(cells[0]);
                fN = cells[1];
                lN = cells[2];
                s = cells[3].charAt(0);
                idF = Integer.parseInt(cells[4]);
                idM = Integer.parseInt(cells[5]);
                
                person = new Person(family, id, fN, lN, s);
                
                if(idF != -1){
                    person.setFather(family.getPerson(idF));
                }
                if(idM != -1){
                    person.setMother(family.getPerson(idM));
                }
                
                family.addPerson(person);
            }            
        }
        
        return family;
    }

}
