package structural.composite;

public class FinancialDepartment implements Department {
    @Override
    public void printName() {
        System.out.println("Financial department");
    }
}
