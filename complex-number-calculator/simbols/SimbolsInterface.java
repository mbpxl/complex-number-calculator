package simbols;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Интрфейс классов-фрифметических действий
 */
public interface SimbolsInterface {
    /**
     * actionsSet - список инициализированных арифметических действий
     */
    public static HashSet<String> actionsSet = new HashSet<>();
    public  static HashMap<String, String> actionsMap = new HashMap<>();

    default void addSimbol(String actionSimbol, String actionName) {
        actionsMap.put(actionSimbol, actionName);
    }

    public static HashMap<String, String> getActionsMap() {
        return actionsMap;
    }


}
