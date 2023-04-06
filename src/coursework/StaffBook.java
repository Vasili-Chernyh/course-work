package coursework;

public class StaffBook {
    public static int keyCounter = 1;
    public static void getAllData (String data){
        System.out.println(data);
    }
    public static int salarySum(Employee[] employees){
        int sum = 0;
        for (Employee employee : employees) {
            sum = sum + employee.getSalary();
        }
        return sum;
    }
    public static int maxSalary (Employee[] employees){
        int max = 0;
        for (Employee employee : employees) {
            if (max < employee.getSalary()){
                max = employee.getSalary();
            }
        }
        return max;
    }
    public static int minSalary (Employee[] employees){
        int min = employees[0].getSalary();
        for (Employee employee : employees) {
            if(min > employee.getSalary()){
                min = employee.getSalary();
            }
        }
        return min;
    }
    public static int averageSalary (Employee[] employees){
        int sum = 0;
        for (Employee employee : employees) {
            sum = sum + employee.getSalary();
        }
        int average;
        average = sum / employees.length;
        return average;
    }
    public static void listOfEmployee (String data) {
        System.out.println(data);
    }

    public static void main(String[] args) {
        Employee[] newEmployee = new Employee[10];
        newEmployee[0] = new Employee("Черных", "Василий", "Николаевич", 4, 65000, keyCounter);
        newEmployee[1] = new Employee("Елгин", "Антон", "Федорович", 1, 62000, keyCounter);
        newEmployee[2] = new Employee("Алишина", "Светлана", "Игоревна", 3, 60000, keyCounter);
        newEmployee[3] = new Employee("Колодий", "Станислав", "Данилович", 5, 67000, keyCounter);
        newEmployee[4] = new Employee("Капанин", "Алексей", "Викторович", 2, 58000, keyCounter);
        newEmployee[5] = new Employee("Абусагитов", "Валерий", "Александрович", 5, 70000, keyCounter);
        newEmployee[6] = new Employee("Жеребцов", "Иван", "Михайлович", 1, 59000, keyCounter);
        newEmployee[7] = new Employee("Гиевский", "Сергей", "Евгеньевич", 3, 61000, keyCounter);
        newEmployee[8] = new Employee("Капанин", "Алексей", "Викторович", 4, 63000, keyCounter);
        newEmployee[9] = new Employee("Михайленко", "Ольга", "Сергеевна", 2, 64000, keyCounter);
        for (Employee item : newEmployee) {
            getAllData(item + "");
        }

        int sum = salarySum(newEmployee);
        System.out.println("Сумма затрат на зарплаты в месяц: " + sum);

        int max = maxSalary(newEmployee);
        System.out.println("Максимальная зарплата: " + max);

        int min = minSalary(newEmployee);
        System.out.println("Минимальная зарплата: " + min);

        int average = averageSalary(newEmployee);
        System.out.println("Средняя зарплата: " + average);

        String[] list = new String[newEmployee.length];
        for (int i = 0; i < newEmployee.length; i++) {
            list [i] = newEmployee[i].getSecondName() + " " + newEmployee[i].getFirstName() + " " + newEmployee[i].getMidlName();
        }
        for (int i = 0; i < newEmployee.length; i++) {
            listOfEmployee(list[i]);
        }
    }
}

