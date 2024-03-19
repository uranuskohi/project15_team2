package testdata;

import java.util.HashMap;
import java.util.Map;

public class Teachers {

    private static Map<String, String> teacherUsernames = new HashMap<>();

    public static void addTeacherUsername(String scenarioId, String username) {
        teacherUsernames.put(scenarioId, username);
    }

    public static String getTeacherUsername(String scenarioId) {
        return teacherUsernames.get(scenarioId);
    }

    public static void printAllTeacherUsernames() {
        System.out.println("All Teacher Usernames:");
        for (Map.Entry<String, String> entry : teacherUsernames.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Scenario ID: " + key + ", Username: " + value);
        }
    }
}
