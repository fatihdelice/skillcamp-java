public class Main {
    public static void main(String[] args) {

        Course mat = new Course("Matematik", "MAT101", "MAT", 20);
        Course fizik = new Course("Fizik", "FZK101", "FZK", 30);
        Course kimya = new Course("Kimya", "KMY101", "KMY", 25);

        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MAT");
        Teacher t2 = new Teacher("Fatma Ayse", "90550000001", "FZK");
        Teacher t3 = new Teacher("Ali Veli", "90550000002", "KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student(
                "Inek Saban", 4, "140144015",
                mat, fizik, kimya
        );

        s1.addBulkExamNote(60, 60, 60, 90, 90, 90);
        s1.isPass();
    }
}
