public class Main {

    private static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee("Иванов Иван Иванович", 1, 45000);
        employees[1] = new Employee("Сидоров Андрей Александрович", 4, 50000);
        employees[2] = new Employee("Юношев Владимир Владимирович", 5, 65000);
        employees[3] = new Employee("Новикова Арина Сергеевна", 3, 56000);
        employees[4] = new Employee("Шушпанов Леонид Иванович", 1, 40000);
        employees[5] = new Employee("Юдин Андрей Алексеевич", 2, 58000);
        employees[6] = new Employee("Летягин Владимир Владимирович", 5, 60000);
        employees[7] = new Employee("Миронова Анастасия Сергеевна", 2, 54000);
        employees[8] = new Employee("Филатов Роман Иванович", 1, 47000);
        employees[9] = new Employee("Синичкин Даниил Юрьевич", 5, 50000);
        printEmployees();
        printFullName();
        System.out.println("Сумма ЗП: " + calculateSum());
        System.out.println("Минимальная ЗП: " + findEmployeeWithMin());
        System.out.println("Максимальная ЗП: " + findEmployeeWithMax());
        System.out.println("Среднее значение ЗП: " + calculateAverageOfSalary());
    }


    private static void printEmployees() {
        System.out.println("Сотрудники: ");
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }

    private static int calculateSum() {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum += employees[i].getSalary();
            System.out.println(sum);
        }
        return sum;
    }

    private static int findEmployeeWithMin() {
        int minSalary = Integer.MAX_VALUE;
        for (int a = 0; a < employees.length; a++) {
            if (employees[a].getSalary() < minSalary) {
                minSalary = employees[a].getSalary();

            }
        }
        return minSalary;
    }
    private static int findEmployeeWithMax(){
        int maxSalary = Integer.MIN_VALUE;
        for (int i = 0; i < employees.length; i++){
            if (employees[i].getSalary() > maxSalary){
                maxSalary = employees[i].getSalary();
            }
        }
        return maxSalary;
    }
    private static double calculateAverageOfSalary(){
        double averageValue = 0;
       averageValue =  calculateSum() / employees.length;
        return averageValue;
    }
    private static void printFullName(){
        for (int i = 0; i < employees.length; i++){
            System.out.println(employees[i].getFullName());
        }
    }
}