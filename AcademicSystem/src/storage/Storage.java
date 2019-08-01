package storage;

import model.Course;
import model.Group;
import model.Student;
import cafsoft.foundation.Data;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 * @author parju
 */
public class Storage {
    private Data loadData(String localPath) throws IOException, URISyntaxException{
        Data data = null;
        
        data = new Data(Paths.get(localPath).toUri().toURL());
        
        return data;
    }
    
    public Group loadFileGroup(String localPath) throws IOException, URISyntaxException{
        Data data = loadData(localPath);
        String text = "";
        String[] rows = null;
        String[] cells = null;
        
        Group group = null;
        
        return group;
    }
    
    public ArrayList<Student> loadFileStudent(String localPath) throws IOException, URISyntaxException{
        Data data = loadData(localPath);
        String text = "";
        String[] rows = null;
        String[] cells = null;
        
        ArrayList<Student> student = new ArrayList();
        
        int id = 0;
        String fN, lN;
        
        if(data != null){
            text = data.toText();
            rows = text.split("\r\n");
            
            for (int r = 1; r < rows.length; r++) {
                cells = rows[r].split(",");
                
                id = Integer.parseInt(cells[0]);
                fN = cells[1];
                lN = cells[2];
                
                student.add(new Student(id, fN, lN));
            }
        }
        
        return student;
    }
    
    public Course loadFileCourse(String localPath) throws IOException, URISyntaxException{
        Data data = loadData(localPath);
        String text = "";
        String[] rows = null;
        String[] cells = null;
        
        Course course = null;
        
        int id = 0;
        String name;
        
        if(data != null){
            text = data.toText();
            rows = text.split("\r\n");
            
            for (int r = 1; r < rows.length; r++) {
                cells = rows[r].split(",");
                
                id = Integer.parseInt(cells[0]);
                name = cells[1];
                
                course = new Course(id, name);
            }            
        }
        
        return course;
    }
}
