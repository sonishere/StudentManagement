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
        return name;
    }

    public void setName(String n) {
        name = n;
    }


    /**
     * Constructor 1
     */
    Student() {
        // TODO:
        name = 'Student';
        id = '000';
        group = 'K62CB';
        email = 'uet@vnu.edu.vn';
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
        name = s.name;
        id = s.id;
        group = s.group;
        email = s.email;
    }

    String getInfo() {
        System.out.println(name + " - " + id + " - " + group + " - " + email);
    }
}