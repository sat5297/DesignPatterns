package Employee;

public class CompositePatternDemo {
    public static void main(String[] args) {
        Employee CEO = new Employee("Shakti", "CEO", 929729792);

        Employee headSales = new Employee("Robert", "headSales", 123123);
        Employee headMarketing = new Employee("Michel", "Marketing", 123123);

        Employee clerk1 = new Employee("A", "Marketing", 123123);
        Employee clerk2 = new Employee("B", "Marketing", 123123);

        Employee sales1 = new Employee("C", "Sales", 123123);
        Employee sales2 = new Employee("D", "Sales", 123123);

        CEO.add(headSales);
        CEO.add(headMarketing);

        headSales.add(sales1);
        headSales.add(sales2);

        headMarketing.add(clerk1);
        headMarketing.add(clerk2);

        System.out.println(CEO);

        for(Employee headEmployee : CEO.getSubordinates()){
            System.out.println(headEmployee);

            for(Employee employee : headEmployee.getSubordinates()){
                System.out.println(employee);
            }
        }
    }
}
