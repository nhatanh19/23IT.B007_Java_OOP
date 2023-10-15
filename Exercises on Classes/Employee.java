public class Employee{
    // Properties
    int id, salary;
    String firstName, lastName;

    //Method()
    Employee(int i, String f, String l, int s){
        id = i;
        salary = s;
        firstName = f;
        lastName = l;
        emp_toString();
    }

    int getId(){
        return id;
    }

    String getFirstName(){
        return firstName;
    }
    String getLastName(){
        return lastName;
    }
    String getName(){
        return getLastName() + ' '+getFirstName();
    }
    int getSalary(){
        return salary;
    }
    void setSalary(int salary){
        salary = 3000;
    }
    int getAnnualSalary(){
        return salary * 12;
    }
    int raiseSalary(int percent){
         // Increase the salary by the percent and return the new salary
        // input percent: float (ex: 0.6, 1.2, 1.5)
        return salary*(percent/10) + salary;

    }
    String emp_toString(){
        return "Employee [ID= " + id + " Name = "+ lastName +' '+ firstName+ " Salary= "+ salary+" ]";
    }
}
