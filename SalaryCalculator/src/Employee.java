import java.util.Date;


//    toString() : Çalışana ait bilgileri ekrana bastıracaktır.
public class Employee {
    String name;
    double salary, workHours,tax,bonus,raise;
    int hireYear;

    Employee(String name, double salary, double workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax(){

        if(salary<=1000.0){
            this.tax = 0.0;
        }
        if(salary>1000.0){
            this.tax  = salary*0.03;
        }
        return this.tax ;
    }
    double bonus(){

        if(this.workHours>40.0){
            this.bonus = (this.workHours-40.0)*30;
        }else
            this.bonus=0;
        return this.bonus;
    }

    double raiseSalary() {

        int minus = 2023 - hireYear;
        if(minus>=1 && minus<=10){
            this.raise = this.salary*0.05;
        }
        if(minus>10 && minus<=20){
            this.raise = this.salary*0.1;
        }
        if(minus>20){
            this.raise = this.salary*0.15;
        }
        return this.raise;

    }

    void toPrint(){
        double netSalary = this.salary+raiseSalary()+bonus()-tax();
        System.out.println("Name\t:\t"+this.name+"\n"+
                "Salary\t:\t"+this.salary+"\n"+
                "Work Hours\t:\t"+this.workHours+"\n"+
                "Tax(-)\t:\t"+this.tax()+"\n"+
                "Bonus(+)\t:\t"+bonus()+"\n"+
                "Raise of Slary(+)\t:\t"+this.raiseSalary()+"\n"+
                "Net Salary\t:\t"+netSalary);
    }

}
