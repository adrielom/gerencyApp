package projectsSelectionFolder;

/**
 * Created by Adriel on 24/08/2017.
 */

public class Projects {

    public String name;
    public String dueDate;


    public Projects(String name, String dueDate) {
        this.name = name;
        this.dueDate = dueDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }
}
