package coursework;

import java.util.Arrays;

public class StaffBook {
    public static int keyCounter = 1;
    public static void getAllData (String data){
        System.out.println(data);
    }
    public static int salarySum (int[] salary){
        int sum = 0;
        for (int j : salary) {
            sum = sum + j;
        }
        return sum;
    }
    public static int maxSalary (int[] salary){
        int max = 0;
        for (int i = 0; i < salary.length; i++) {
            if (max < salary[i]){
                max = salary[i];
            }
        }
        return max;
    }
    public static int minSalary (int[] salary){
        int min = salary[0];
        for (int i = 0; i < salary.length; i++) {
            if(min > salary[i]){
                min = salary[i];
            }
        }
        return min;
    }
    public static int averageSalary(int[] salary) {
        int sum = 0;
        for (int j : salary) {
            sum = sum + j;
        }
        int average = 0;
        average = sum / salary.length;
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
        int[] arr  = new int[newEmployee.length];
        for (int i = 0; i < newEmployee.length; i++) {
            arr [i] = newEmployee[i].getSalary();
        }

        int sum = salarySum(arr);
        System.out.println("Сумма затрат на зарплаты в месяц: " + sum);

        int max = maxSalary(arr);
        System.out.println("Максимальная зарплата: " + max);

        int min = minSalary(arr);
        System.out.println("Минимальная зарплата: " + min);

        int average = averageSalary(arr);
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

