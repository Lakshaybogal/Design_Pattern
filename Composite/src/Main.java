import java.util.ArrayList;

interface Employee{
    void showEmployee();
    void addEmp(Employee emp);
    void removeEmp(Employee emp);
}
//imp
class Leaf implements Employee{
    int id;
    String name;
    String position;
    Leaf(int id,String name,String position){
        this.id = id;
        this.name = name;
        this.position = position;
    }

    @Override
    public void showEmployee() {
        System.out.println(id+"\t"+name+"\t\t"+position);
    }

    @Override
    public void addEmp(Employee emp) {

    }

    @Override
    public void removeEmp(Employee emp) {

    }


}

class Composite implements Employee{
    ArrayList<Employee> SubEmp = new ArrayList<>();
    @Override
    public void showEmployee() {
        for (Employee e:SubEmp) {
            e.showEmployee();
        }
    }

    @Override
    public void addEmp(Employee emp) {
            SubEmp.add(emp);
    }

    @Override
    public void removeEmp(Employee emp) {
        SubEmp.remove(emp);
    }


}
public class Main {
    public static void main(String[] args) {

        Employee ceo = new Leaf(1,"Lakshay","CEO");
        Employee productManager  = new Leaf(2,"ABC","Product Manager");
        Employee salesManager  = new Leaf(3,"XYZ","Sales Manager");
        Employee clerk1 = new Leaf(4,"IsThat","Clerk");
        Employee productEng1 = new Leaf(5,"Harsh","Product Engineer ");
        Employee productEng2 = new Leaf(6,"Amit","Product Engineer ");
        Employee salesMan1  = new Leaf(7,"Sourav","Sales Man");
        Employee salesMan2  = new Leaf(8,"Gourav","Sales Man");
        Employee clerk2 = new Leaf(9,"YesIAm","Clerk");

        Employee ceoTeam = new Composite();
        Employee productionTeam = new Composite();
        Employee salesTeam = new Composite();

        ceoTeam.addEmp(ceo);
        ceoTeam.addEmp(productManager);
        ceoTeam.addEmp(salesManager);



        productionTeam.addEmp(productManager);
        productionTeam.addEmp(productEng1);
        productionTeam.addEmp(productEng2);
        productionTeam.addEmp(clerk1);

        salesTeam.addEmp(salesManager);
        salesTeam.addEmp(salesMan1);
        salesTeam.addEmp(salesMan2);
        salesTeam.addEmp(clerk2);

        salesTeam.showEmployee();
    }
}