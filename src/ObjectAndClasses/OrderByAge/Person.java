package ObjectAndClasses.OrderByAge;

import javax.xml.namespace.QName;

public class Person {
    private String name;
    private String ID;
    private int age;

    public Person(String name, String ID, int age){
        this.name = name;
        this.ID = ID;
        this.age = age;
    }
    public String getName(String name){
        return this.name;
    }
    public String getID(String ID){
        return this.ID;
    }
    public int getAge(int age){
        return this.age;
    }

}
