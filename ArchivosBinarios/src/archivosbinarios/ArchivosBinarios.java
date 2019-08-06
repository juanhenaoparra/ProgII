/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivosbinarios;

import cafsoft.foundation.Data;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 *
 * @author parju
 */
public class ArchivosBinarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, URISyntaxException {
        
        ArrayList<String[]> fileSignatures = getFileSignatures();
        ArrayList<String> filenames = getFilenames();
        
        String hexFromFile = "";
        String hexFromSign = "";
        
        for(int i = 0; i < filenames.size(); i++){
            Data data = null;
            String filename = "C:\\Users\\parju\\Google Drive\\Prog 2\\UnknowFiles\\" + filenames.get(i);
            String filenameM = "";
            URL url = null;
            File originFile = null;
            File urlM = null;
            byte[] bytes = {};

            try{
                url = new File(filename).toURI().toURL();
                data = new Data(url);
            }catch(MalformedURLException ex){}
            catch(IOException ex){}
            catch(URISyntaxException ex){}

            if(data != null){
                bytes = data.toArray();
                
                for(String[] fileSignature: fileSignatures){
                    for (int k = 0; k < ((fileSignature[2].length() - (fileSignature[2].length()/3)) / 2); k++) {
                        hexFromFile += byteToHex(bytes[k]) + " ";
                    }
                    
                    if(fileSignature[2].equals(hexFromFile)){
                        filenameM = "C:\\Users\\parju\\Google Drive\\Prog 2\\UnknowFiles\\" + filenames.get(i) + "." + fileSignature[0];
                        originFile = new File(filename);
                        urlM = new File(filenameM);
                        originFile.renameTo(urlM);
                        
                        System.out.println("El archivo #" + i + " es del tipo: " + fileSignature[0] + "  (" + fileSignature[1] + ")");
                    }
                    
                    hexFromFile = "";
                }
            }

            System.out.println("");
        }
    }
    
    public static ArrayList<String[]> getFileSignatures(){
        String directory = "C:\\Users\\parju\\Google Drive\\Prog 2\\ProgII\\ArchivosBinarios\\src\\archivosbinarios\\FileSignatures.dat";
        ArrayList<String[]> fileSignatures = new ArrayList<>();
        Data data = null;
        URL url = null;
        String text = "";
        String[] rows = null;
        String[] cells = null;
        
        try{
            url = new File(directory).toURI().toURL();
            data = new Data(url);
        }catch(MalformedURLException ex){}
        catch(IOException ex){}
        catch(URISyntaxException ex){}
        
        text = data.toText();
        rows = text.split("\n");
        
        for (int r = 0; r < rows.length; r++){
            cells = rows[r].split(", ");
            String[] line = {cells[0], cells[1], cells[2]};
                        
            fileSignatures.add(line);
        }
        
        return fileSignatures;
    }
    
    public static ArrayList<String> getFilenames (){
        String root = "C:\\Users\\parju\\Google Drive\\Prog 2\\UnknowFiles";
        ArrayList<String> filenames = new ArrayList<>();
        
        File folder = new File(root);
        File[] listOfFiles = folder.listFiles();

        for (File listOfFile : listOfFiles) {
            filenames.add(listOfFile.getName());
        }  
        
        return filenames;
    }
    
    public static String byteToHex(byte num){
        char[] hexDigits = new char[2];
        hexDigits[0] = Character.forDigit((num >> 4) & 0xF, 16);
        hexDigits[1] = Character.forDigit((num & 0xF), 16);
        
        return new String(hexDigits).toUpperCase();
    }
    
}
