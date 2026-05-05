package domain;

/**
 * Клас, що представляє менеджера, який керує групою співробітників.
 * Наслідується від базового класу {@link Employee}.
 * @author Yarik
 * @version 1.0
 */
public class Manager extends Employee {

    /**
     * Створює об'єкт менеджера з повною інформацією та списком підлеглих.
     * @param employees масив співробітників у підпорядкуванні.
     * @param name повне ім'я менеджера.
     * @param jobTitle посада.
     * @param level рівень кваліфікації.
     * @param dept департамент.
     */
    public Manager(Employee[] employees, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.employees = employees;
    }

    /**
     * Повертає інформацію про менеджера разом зі списком його підлеглих.
     * @return рядок з даними менеджера та іменами співробітників.
     */
    @Override
    public String toString() {
        return super.toString()+"\nEmployees: "+getEmployees(); 
    }

    /**
     * Створює менеджера лише зі списком підлеглих, використовуючи базові значення для інших полів.
     * @param employees масив об'єктів {@link Employee}.
     */
    public Manager(Employee[] employees) {
        super();
        this.employees = employees;
    }
    
    /**
     * Конструктор за замовчуванням. Ініціалізує масив підлеглих розміром 10 елементів.
     */
    public Manager() {
        super();
        employees = new Employee[10];
    }

    private Employee[] employees;

    /**
     * Формує рядок з імен усіх підлеглих співробітників, розділених комою.
     * @return рядок з іменами (наприклад: "Ivanov, Petrov").
     */
    public String getEmployees() {
        String s = "";
        for (Employee e : employees) {
            s = s + e.getName() + ", ";
        }
        s=s.substring(0, s.length() - 2);
        return s;
    }

    /**
     * Оновлює список підлеглих менеджера.
     * @param employees новий масив співробітників.
     */
    public void setEmployees(Employee[] employees) {
        this.employees=employees;
    }

    /**
     * Повертає пряме посилання на масив підлеглих.
     * @return масив об'єктів {@link Employee}.
     */
    public Employee[] getEmployeesList() {
        return employees;
    }
}