package simbols;

public class Division extends Simbols implements SimbolsInterface {
    String actionSimbol;;
    String actionName = "Division (деление)";

    public Division (String simbol) {
        this.actionSimbol = simbol;
        this.actionName = actionName;
        addSimbol(actionSimbol, actionName);
    }

    public String getActionName() {
        String out = this.actionName;
        return actionName;
    }
    public String getSimbol() {
        return actionSimbol;
    }

    public static double action(int num1, int num2) {
        if (num2 != 0) {
            return (num1/num2); }
        else {
            System.out.println();
            System.out.println("========== Деление на ноль невозможно! ==========");
            return 0;
        }
    }
}
