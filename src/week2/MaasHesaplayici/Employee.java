package week2.MaasHesaplayici;

public class Employee {

    String name;
    double salary;
    int workHours;
    int hireYear;
    double tax;
    double bonus;
    double raise;


    public Employee(String name, double salary, int workHours, int hireYear) {

        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        this.tax = calculateTax();
        this.bonus = calcuteBonus();
        this.raise = calculateRaise();


    }

    public double calculateTax() {
        if (salary <= 1000) {
            return 0;

        } else {
            return salary * 0.03;
        }
    }

    public double calcuteBonus() {
        if (workHours > 40) {
            int extraHours = workHours - 40;
            return extraHours * 30;

        } else {
            return 0;
        }
    }

    public double calculateRaise() {
        int currentYear = 2023;
        int yearsWorked = currentYear - hireYear;
        if (yearsWorked < 10) {
            return salary * 0.05;
        } else if (yearsWorked >= 10 && yearsWorked < 20) {
            return salary * 0.10;
        } else {
            return salary * 0.15;
        }


    }

    public double totalSalary() {
        return salary - tax + bonus + raise;

    }

    public String toString() {
        return "Adı" + name +
                "\nMaaşı:" + salary +
                "\nÇalışma Saati:" + workHours +
                "\nBaşlangıç Yılı:" + hireYear +
                "\nVergi:" + tax +
                "\nBonus:" + bonus +
                "\nMaaş Artışı:" + raise +
                "\nVergi ve Bonuslar ile birlikte maaş:" + (totalSalary()-raise) +
                "\nToplam Maaş:" + (totalSalary());

    }

}
