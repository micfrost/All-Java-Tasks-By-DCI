package D62_PoorVersionCode.DC_T_4_Improved_StudManagSystem;

import java.util.HashMap;
import java.util.Map;

public class Courses {
    private Map<String, Integer> courseGrades = new HashMap<>();

    public void addCourseGrade(String course, int grade) {
        courseGrades.put(course, grade);
    }

    public Map<String, Integer> getCourseGrades() {
        return courseGrades;
    }
}
