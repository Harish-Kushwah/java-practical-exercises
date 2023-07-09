package practical2.setC;
/*
 * b) Create four member variables for Customer class. Assign public, private, protected 
    and default  access modifiers  respectively to these variables. Try to access these 
    variables from other classes (Same package and Different package)
 */
class Customer
{
    private int id;
    public String name ;
    protected String city;
    float salary;

    Customer(int id , String name ,String city,float salary)
    {
        this.id = id;
        this.name = name;
        this.city = city;
        this.salary = salary; 

    }
}
public class Ex2 {
    
    public static void main(String[] args) {
        Customer c1 = new Customer(1,"Harish" , "Malegaon" ,39900f);
        //int id = c1.id;  //not accessible within another class because it is private variable

        //this remaining are visible to other class
        String name = c1.name;
        String city = c1.city;
        float salary = c1.salary;

    }
}
