package structural.composite;

public class Main {
    public static void main(String[] args) {
        FinancialDepartment financialDepartment = new FinancialDepartment();
        DevelopmentDepartment developmentDepartment = new DevelopmentDepartment();

        // Нам необходимо вывести названия всех департаментов, без композитора нам нужно по очереди вызывать у всех
        // департаментов printName и, следовательно, наш код является не подходящим для расширения
        financialDepartment.printName();
        developmentDepartment.printName();

        System.out.println("---------------------------------");

        // Создаем наш композитор и выполняем все одним действием
        HeadDepartment headDepartment = new HeadDepartment();
        headDepartment.addDepartment(financialDepartment);
        headDepartment.addDepartment(developmentDepartment);

        headDepartment.printName();
    }
}
