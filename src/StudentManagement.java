public class StudentManagement {

    Student[] students = new Student[100];
    int index = 0;

    public static boolean sameGroup(Student s1, Student s2) {
        return s1.getGroup().equals(s2.getGroup());
    }

    public void addStudent(Student newStudent) {
        students[index] = newStudent;
        index++;
    }

    public String studentsByGroup() {
        if (index = 0) {
            return null;
        }

        String title = students[0].getGroup();
        String result = title + "\n";
        for (int i = 0; i < indexCount; i++) {
            if (!title.equals(students[i].getGroup())) {
                title = students[i].getGroup();
                result += title + "\n";
            }
            result += students[i].getInfo() + "\n";
        }
        return result;
    }

    public void removeStudent(String id) {
        for (int i = 0; i <= index; i++) {
            if (students[i].getId() == id) {
                for (int j = 0; j <= index; j++) {
                    students[j] = students[j + 1];

                }
                break;
            }
        }
    }

    public static void main(String[] args) {
        // TODO:
    }
}