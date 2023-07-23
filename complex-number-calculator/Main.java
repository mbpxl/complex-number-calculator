import simbols.Init;
import simbols.SimbolsInterface;
import view.UserDialog;

import java.util.HashMap;


public class Main {
    public static void main(String[] args) {
        Init init = new Init();
        HashMap<String, String> aMap = SimbolsInterface.getActionsMap();
        UserDialog userDialog = new UserDialog(aMap);
    }
}
