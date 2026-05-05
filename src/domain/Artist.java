package domain;

/**
 * Клас, що представляє творчого співробітника (художника).
 * Наслідується від класу {@link Employee} та містить перелік професійних навичок.
 * @author Yarik
 * @version 1.0
 */
public class Artist extends Employee {

    /**
     * Створює об'єкт художника з повною інформацією та списком навичок.
     * @param skills масив навичок художника.
     * @param name повне ім'я.
     * @param jobTitle посада.
     * @param level рівень кваліфікації.
     * @param dept департамент.
     */
    public Artist(String[] skills, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.skills = skills;
    }

    /**
     * Створює художника лише зі списком навичок, використовуючи базові значення для інших полів.
     * @param skills масив рядків з навичками.
     */
    public Artist(String[] skills) {
        super();
        this.skills = skills;
    }
    
    /**
     * Конструктор за замовчуванням. Ініціалізує масив навичок розміром 10 елементів.
     */
    public Artist() {
        super();
        this.skills = new String[10];
    }

    /**
     * Повертає інформацію про художника разом з його навичками.
     * @return рядок з даними художника та переліком навичок.
     */
    @Override
    public String toString() {
        return super.toString()+"\nSkills: "+getSkills();
    }

    private String[] skills;

    /**
     * Формує рядок з усіх навичок художника, розділених комою.
     * @return рядок з навичками (наприклад: "Photoshop, Illustration").
     */
    public String getSkills() {
        String s = "";
        for (String e : skills) {
            s = s + e + ", ";
        }
        s=s.substring(0, s.length() - 2);
        return s;
    }

    /**
     * Оновлює список навичок художника.
     * @param skills новий масив навичок.
     */
    public void setSkills(String[] skills) {
        this.skills=skills;
    }

    /**
     * Повертає пряме посилання на масив навичок.
     * @return масив рядків.
     */
    public String[] getSkillsList() {
        return skills;
    }
}