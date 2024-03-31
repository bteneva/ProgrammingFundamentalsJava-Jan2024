package ObjectAndClasses.Students;

public class Students {
    //fields
    private String firstName;
    private String secondName;
    private double grade;
    //constructor
    public Students(String firstName, String secondName, double grade){
        this.firstName = firstName;
        this.secondName = secondName;
        this.grade = grade;
    }

    //methods
    public String getFirstName(){
        return this.firstName;
    }
    public String getSecondName(){
        return this.secondName;
    }
    public double getGrade(){
        return this.grade;
    }

}
