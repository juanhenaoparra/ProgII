package demofamilytree.model;

import java.util.ArrayList;

/**
 * @author parju
 */
public class Person {

    public static final char SEX_MALE = 'M';
    public static final char SEX_FEMALE = 'F';

    private Family family = null;
    private int Id = 0;
    private String firstName = "";
    private String lastName = "";
    private char sex = '?';
    private Person Mother = null;
    private Person Father = null;

    public Person(int Id, String firstName, String lastName, char sex) {
        this.Id = Id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
    }

    public Person(Family family, int Id, String firstName, String lastName, char sex) {
        this.family = family;
        this.Id = Id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
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
    
    public String getFullName(){
        return firstName + " " + lastName;
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
        Person father = this.getFather();

        if (father != null) {
            return father.getFather();
        }
        return null;
    }

    public Person getPaternalGrandMother() {
        Person father = this.getFather();

        if (father != null) {
            return father.getMother();
        }
        return null;
    }

    public Person getMaternalGrandFather() {
        Person mother = this.getMother();

        if (mother != null) {
            return mother.getFather();
        }
        return null;
    }

    public Person getMaternalGrandMother() {
        Person mother = this.getMother();

        if (mother != null) {
            return mother.getMother();
        }
        return null;
    }
    
    public ArrayList<Person> getBrothers(){
        ArrayList<Person> brothers = new ArrayList();
        ArrayList<Person> people = null;
        
        if(family != null && (Father != null || Mother != null)){
            people = family.getPeople();
            for (Person person : people) {
                if(person != this){   
                    if(person.getSex() == Person.SEX_MALE){
                        if(this.getFather() == person.getFather() || this.getMother() == person.getMother()){
                            brothers.add(person);
                        }
                    }
                }
            }
        }
        
        return brothers;
    }
    
    public ArrayList<Person> getSisters(){
        ArrayList<Person> sisters = new ArrayList();
        ArrayList<Person> people = null;
        
        if(family != null && (Father != null || Mother != null)){
            people = family.getPeople();
            for (Person person : people) {
                if(person != this){   
                    if(person.getSex() == Person.SEX_FEMALE){
                        if(this.getFather() == person.getFather() || this.getMother() == person.getMother()){
                            sisters.add(person);
                        }
                    }
                }
            }
        }
        
        return sisters;
    }
}
