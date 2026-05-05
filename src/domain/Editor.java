package domain;

/**
 * Клас, що представляє редактора, який є спеціалізацією художника.
 * Додає функціонал вибору переваг редагування (електронне або паперове).
 * @author Yarik
 * @version 1.0
 */
public class Editor extends Artist {

    /**
     * Створює об'єкт редактора з повним набором даних.
     * @param electronicEditing чи використовується електронне редагування.
     * @param skills масив професійних навичок.
     * @param name повне ім'я.
     * @param jobTitle посада.
     * @param level рівень кваліфікації.
     * @param dept департамент.
     */
    public Editor(boolean electronicEditing, String[] skills, String name, String jobTitle, int level, String dept) {
        super(skills, name, jobTitle, level, dept);
        this.electronicEditing = electronicEditing;
    }

    /**
     * Створює редактора зі списком навичок та перевагами редагування.
     * @param electronicEditing чи використовується електронне редагування.
     * @param skills масив професійних навичок.
     */
    public Editor(boolean electronicEditing, String[] skills) {
        super(skills);
        this.electronicEditing = electronicEditing;
    }

    /**
     * Створює редактора лише з вказанням переваг редагування.
     * @param electronicEditing чи використовується електронне редагування.
     */
    public Editor(boolean electronicEditing) {
        super();
        this.electronicEditing = electronicEditing;
    }
    
    /**
     * Конструктор за замовчуванням. Встановлює електронне редагування як основне за замовчуванням.
     */
    public Editor() {
        super();
        this.electronicEditing = true;
    }

    /**
     * Повертає інформацію про редактора, включаючи його переваги у роботі.
     * @return рядок з даними, де вказано "electronic" або "paper" редагування.
     */
    @Override
    public String toString() {
        String s=super.toString()+"\nEditing preferences= "; 
        if (electronicEditing)
            s=s+"electronic";
        else
            s=s+"paper";
        return s;
            
    }

    private boolean electronicEditing;

    /**
     * Отримує поточні переваги редагування.
     * @return true, якщо редагування електронне; false, якщо паперове.
     */
    public boolean getPreferences() {
        return electronicEditing;
    }

    /**
     * Встановлює переваги редагування.
     * @param electronic true для електронного, false для паперового.
     */
    public void setPreferences(boolean electronic) {
        this.electronicEditing=electronic;
    }
}