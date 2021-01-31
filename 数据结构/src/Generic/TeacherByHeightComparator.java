package Generic;

import java.util.Comparator;

public class TeacherByHeightComparator implements Comparator<Teacher> {
    @Override
    public int compare(Teacher o1, Teacher o2) {
        return o1.height - o2.height;
    }
}
