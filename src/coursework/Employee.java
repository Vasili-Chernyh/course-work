package coursework;

public class Employee {
    private String secondName;
    private String firstName;
    private String midlName;
    private int department;
    private int salary;
    private int id;

    public Employee (String secondName,String firstName,String midlName,int department,int salary,int id) {
        StaffBook.keyCounter ++;
        this.secondName = secondName;
        this.firstName = firstName;
        this.midlName = midlName;
        this.department = department;
        this.salary = salary;
        this.id = id;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMidlName() {
        return midlName;
    }

    public void setMidlName(String midlName) {
        this.midlName = midlName;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Сотрудник: " +
                "Фамилия - '" + secondName + '\'' +
                ", Имя - '" + firstName + '\'' +
                ", Отчество - '" + midlName + '\'' +
                ", Отдел - " + department +
                ", Заработная плата - " + salary +
                ", id - " + id;
    }
}
