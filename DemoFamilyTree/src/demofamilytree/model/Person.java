package demofamilytree.model;

/**
 * @author parju
 */
public class Person {
    
    public static final char SEX_MALE = 'M';
    public static final char SEX_FEMALE = 'F';
    
    
    private String firstName = "";
    private String lastName = "";
    private char sex = '?';
    private Person Mother = null;
    private Person Father = null;

    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char newSex) {
        if (newSex == SEX_MALE || newSex == SEX_FEMALE) {
            this.sex = newSex;
        }        
    }

    public Person getMother() {
        return Mother;
    }
    
    public void setMother(Person Mother) {
        this.Mother = Mother;
    }

    public Person getFather() {
        return Father;
    }

    public void setFather(Person Father) {
        this.Father = Father;
    }
    
    public Person getPaternalGrandFather() {
        return Father.getFather();
    }

    public Person getPaternalGrandMother() {
        return Father.getMother();
    }

    public Person getMaternalGrandFather() {
        return Mother.getFather();
    }
    
    public Person getMaternalGrandMother() {
        return Mother.getMother();
    }
}
