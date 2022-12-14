package ArrayListCustom;

public class Student {
    private String id;
    private String name;
    private int age;
    private String gradeClass;

    public Student() {
    }

    public Student(String id, String name, int age, String gradeClass) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gradeClass = gradeClass;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGradeClass() {
        return gradeClass;
    }

    public void setGradeClass(String gradeClass) {
        this.gradeClass = gradeClass;
    }
}
