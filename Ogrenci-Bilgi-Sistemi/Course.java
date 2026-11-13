public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note;
    int oralNote;
    double oralEffect;

    public Course(String name, String code, String prefix, double oralEffect) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.oralEffect = oralEffect;
        this.note = -1;
        this.oralNote = -1;
    }

    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("Islem basarili");
        } else {
            System.out.println(t.name + " bu dersi veremez.");
        }
    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + " dersinin ogretmeni: " + courseTeacher.name);
        } else {
            System.out.println(this.name + " dersine ogretmen atanmamistir.");
        }
    }

    public double calcCourseAverage() {
        double examEffect = 1 - (oralEffect / 100);

        return (note * examEffect) + (oralNote * oralEffect / 100);
    }
}
