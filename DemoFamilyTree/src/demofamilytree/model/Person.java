/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demofamilytree.model;

/**
 *
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
}
