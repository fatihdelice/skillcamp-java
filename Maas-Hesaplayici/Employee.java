public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (salary < 1000) {
            return 0;
        } else {
            return salary * 0.03;
        }
    }

    public double bonus() {
        if (workHours > 40) {
            return (workHours - 40) * 30;
        }

        return 0;
    }

    public double raiseSalary() {
        int workYear = 2021 - hireYear;

        if (workYear < 10) {
            return salary * 0.05;
        } else if (workYear > 9 && workYear < 20) {
            return salary * 0.10;
        } else if (workYear > 19) {
            return salary * 0.15;
        }

        return 0;
    }

    @Override
    public String toString() {
        double tax = tax();
        double bonus = bonus();
        double raise = raiseSalary();

        double salaryWithTaxAndBonus = salary - tax + bonus;
        double totalSalary = salaryWithTaxAndBonus + raise;

        return "Adi: " + name +
                "\nMaasi: " + salary +
                "\nCalisma Saati: " + workHours +
                "\nBaslangic Yili: " + hireYear +
                "\nVergi: " + tax +
                "\nBonus: " + bonus +
                "\nMaas Artisi: " + raise +
                "\nVergi ve Bonuslar ile birlikte maas: " + salaryWithTaxAndBonus +
                "\nToplam Maas: " + totalSalary;
    }
}
