public class Student {

    // TODO: khai bao cac thuoc tinh cho Student
    Student() {
        private String name;
        private String id;
        private String group;
        private String email;
    }

    // TODO: khai bao cac phuong thuc getter, setter cho Student
    public String getName() {
        return this.name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String n) {
        this.id = n;
    }

    public String getGroup() {
        return this.group;
    }

    public void setGroup(String n) {
        this.group = n;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String n) {
        this.email = n;
    }

    /**
     * Constructor 1
     */
    Student() {
        // TODO:
        this.name = 'Student';
        this.id = '000';
        this.group = 'K62CB';
        this.email = 'uet@vnu.edu.vn';
    }

    /**
     * Constructor 2
     *
     * @param n
     * @param sid
     * @param em
     */
    Student(String name, String id, String email) {
        // TODO:
        this.name = name;
        this.id = id;
        this.email = email;
        this.group = 'K62CB';
    }

    /**
     * Constructor 3
     *
     * @param s
     */
    Student(Student s) {
        // TODO:
        this.name = s.name;
        this.id = s.id;
        this.group = s.group;
        this.email = s.email;
    }

    String getInfo() {
        return name + " - " + id + " - " + group + " - " + email;
    }
}