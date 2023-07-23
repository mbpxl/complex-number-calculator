package simbols;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Класс-предок классов арифметических действий
 */
abstract public class Simbols implements SimbolsInterface {

    /**
     * Метод, возвращающий список инициализированных арифметических действий
     * @return
     */
    public static HashSet<String> getActionsSet() {
        return actionsSet;
    }
    public static HashMap<String, String> getActionsMap() {
        return actionsMap;
    }
}

