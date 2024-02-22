public class Person {
    private String firstName;
    private String lastName;

    public Person(String fName){
        this.firstName=fName;
        this.lastName="";
    }
    public Person(String fName, String lName){
        this.firstName=fName;
        this.lastName=lName;
    }

    public String getFirstName(){return this.firstName;}
    public String getLastName(){return this.lastName;};

    public String toString(){
        return this.firstName+" "+this.lastName;
    }
}