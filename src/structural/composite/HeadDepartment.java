package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class HeadDepartment implements Department {
    private final List<Department> departments = new ArrayList<>();

    @Override
    public void printName() {
        departments.forEach(Department::printName);
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }
}
