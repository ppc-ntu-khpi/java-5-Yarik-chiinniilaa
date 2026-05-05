package domain;

/**
 * Клас, що представляє базову сутність співробітника.
 * Містить інформацію про ідентифікатор, ім'я, посаду та департамент.
 * @author Yarik
 * @version 1.0
 */
public class Employee {

    /**
     * Повертає детальну інформацію про співробітника.
     * @return рядок з ID, ім'ям, посадою, рівнем та департаментом.
     */
    @Override
    public String toString() {
        return "\nEmployee ID= " + ID + "\nName= " + name + "\nJobTitle= " + jobTitle + "\nLevel= " + level + "\nDept= " + dept;
    }

    private String name;
    private String jobTitle;
    private int ID;
    private int level;
    private String dept;

    /**
     * Створює нового співробітника з заданими параметрами.
     * @param name повне ім'я співробітника.
     * @param jobTitle назва посади.
     * @param level рівень кваліфікації (1, 2 або 3).
     * @param dept назва департаменту.
     */
    public Employee(String name, String jobTitle, int level, String dept) {
        this();
        setName(name);
        this.jobTitle = jobTitle;
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
        this.dept = dept;
    }

    /**
     * Конструктор за замовчуванням. Герує випадковий ID для співробітника.
     */
    public Employee() {
        ID = (int)(Math.random()*1000);
    }

    /**
     * Встановлює назву посади.
     * @param job посада співробітника.
     */
    public void setJobTitle(String job) {
        jobTitle = job;
    }

    /**
     * Отримує назву посади.
     * @return поточна посада.
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * Отримує ім'я співробітника.
     * @return повне ім'я.
     */
    public String getName() {
        return name;
    }

    /**
     * Встановлює рівень кваліфікації. Приймає значення від 1 до 3.
     * @param level новий рівень.
     */
    public void setLevel(int level) {
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
    }

    /**
     * Отримує рівень кваліфікації.
     * @return значення рівня.
     */
    public int getLevel() {
        return level;
    }

    /**
     * Отримує назву департаменту.
     * @return департамент.
     */
    public String getDept() {
        return dept;
    }

    /**
     * Встановлює департамент співробітника.
     * @param dept назва нового департаменту.
     */
    public void setDept(String dept) {
        this.dept = dept;
    }

    /**
     * Встановлює ім'я співробітника після перевірки через регулярний вираз.
     * Якщо ім'я не відповідає формату, встановлюється "John Doe".
     * @param name ім'я для перевірки та встановлення.
     */
    public void setName(String name) {
        if (name.matches("^([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]*)+[ ]([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]+)+$")) {
            this.name = name;
        } else {
            this.name = "John Doe";
        }
    }
}