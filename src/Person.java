public class Person {

    String firstname;
    String lastName;
    int age;


public Person(String firstname){
    this.firstname=firstname;
}
    public Person(String firstname,String lastName,int age){
    this(firstname);
        this.lastName=lastName;
        this.age=age;
    }
    public String getFirstName(){
    return this.firstname;
    }
    public String getLastName (){
        return this.lastName;
    }
    public int getAge (){
        return this.age;
    }
    public boolean isTeen  (){

        return this.age>12 && this.age<20 ? true : false;

    }

}