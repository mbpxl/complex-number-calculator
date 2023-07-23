package simbols;

/**
 * Класс сложения
 */
public class Addition extends Simbols implements SimbolsInterface{
     String actionSimbol;
     String actionName = "Addition (сложение)";

    /**
     * Конструктор класса
     * @param simbol - символ класса ("+"), принимается от класса Init
     */
    public Addition (String simbol) {
        this.actionSimbol = simbol;
        this.actionName = actionName;
        addSimbol(actionSimbol,actionName);
    }

    public String getActionName() {
        System.out.println("Попытка вывода actionName");
        return actionName;
    }

    public String getSimbol() {
        return actionSimbol;
    }

    public static int action(int num1, int num2) {
        return (num1 + num2);
    }
}
