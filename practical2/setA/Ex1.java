package practical2.setA;
/*
 * a) Create an employee class(id,name,deptname,salary). Define a default and 
    parameterized  constructor.  Use  ‘this’  keyword  to  initialize  instance  variables. 
    Keep  a  count  of  objects  created.  Create  objects  using  parameterized  constructor 
    and  display  the  object  count  after  each  object  is  created.(Use  static  member  and 
    method). Also display the contents of each object
 */

class Employee
{
    private int id;
    String name ;
    String deptname;
    float salary;

    public static int count=0;

    Employee(){
        count++;
    }

    Employee(int id , String name , String deptname, float salary)
    {
        this.id = id;
        this.name = name;
        this.deptname = deptname;
        this.salary = salary;

        count++;
        System.out.println("Total employee : "+count);
    }

    void printInfo()
    {
        System.out.println("Id : "+id);
        System.out.println("Employee name : " + this.name);
        System.out.println("Department name :"+this.deptname);
        System.out.println("Salary : "+ this.salary);
    }

}
public class Ex1 {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1,"Pratik", "Design" ,30000f);
        emp1.printInfo();

        Employee emp2 = new Employee(2,"Rakesh", "CSE" ,50000f);
        emp2.printInfo();

        Employee em3 = new Employee(3,"Rupesh", "Sells" ,35000f);
        em3.printInfo();
        
    }
}
