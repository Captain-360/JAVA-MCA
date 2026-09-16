class Employee{
    public void work(){
        System.out.println("Employee working");
    }
    public void getSalary(double salary){
        System.out.println("salary of employee is :" + salary);
    }

}

class  HRManager extends Employee{
    @Override 
    public void work(){
        System.out.println("HR working");
    }
    @Override 
    public void getSalary(double salary){
        System.out.println("hr employee salary is : " + salary);
    }
    public void addEmployee(String name){
        System.out.println("name of employee is : "+name);
    }
}



public class P2 {
    public static void main(String[] args) {
        Employee e = new Employee();
        HRManager h = new HRManager();
        h.addEmployee("joy doy");   
    }
}
