package mathLogic;

import simbols.Addition;
import simbols.Division;
import simbols.Multiplication;
import simbols.Simbols;
import java.util.HashMap;

public class MathLogic {
public HashMap<String,String> aMap;
    Addition add;
    Multiplication mult;
    Division div;
public MathLogic(HashMap<String, String> aMap) {
        this.aMap = Simbols.actionsMap;
    }

    public int additionNumbers(int num1, int num2) {
        return Addition.action(num1, num2);
    }
    public int multiplication(int num1, int num2) {
        return Multiplication.action(num1,num2);
    }
    public double division(int num1, int num2) {
        return Division.action(num1,num2);
    }
}
