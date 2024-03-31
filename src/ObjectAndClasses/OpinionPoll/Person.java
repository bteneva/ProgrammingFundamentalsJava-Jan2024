package ObjectAndClasses.OpinionPoll;

public class Person {
    //Fields
    private String name;
    private int age;

    //constructor
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    //methods
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
}
