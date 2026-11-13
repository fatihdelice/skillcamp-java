public class Student {
    String name, stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;

    Student(String name, int classes, String stuNo,
            Course mat, Course fizik, Course kimya) {

        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        this.avarage = 0;
        this.isPass = false;
    }

    public void addBulkExamNote(
            int matExam, int fizikExam, int kimyaExam,
            int matOral, int fizikOral, int kimyaOral) {

        if (matExam >= 0 && matExam <= 100) {
            this.mat.note = matExam;
        }

        if (fizikExam >= 0 && fizikExam <= 100) {
            this.fizik.note = fizikExam;
        }

        if (kimyaExam >= 0 && kimyaExam <= 100) {
            this.kimya.note = kimyaExam;
        }

        if (matOral >= 0 && matOral <= 100) {
            this.mat.oralNote = matOral;
        }

        if (fizikOral >= 0 && fizikOral <= 100) {
            this.fizik.oralNote = fizikOral;
        }

        if (kimyaOral >= 0 && kimyaOral <= 100) {
            this.kimya.oralNote = kimyaOral;
        }
    }

    public void calcAvarage() {
        this.avarage = (
                this.mat.calcCourseAverage()
                + this.fizik.calcCourseAverage()
                + this.kimya.calcCourseAverage()
        ) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void isPass() {
        if (this.mat.note == -1 || this.fizik.note == -1
                || this.kimya.note == -1
                || this.mat.oralNote == -1
                || this.fizik.oralNote == -1
                || this.kimya.oralNote == -1) {

            System.out.println("Notlar tam olarak girilmemis.");
        } else {
            this.isPass = isCheckPass();
            printNote();

            System.out.println("Ortalama: " + this.avarage);

            if (this.isPass) {
                System.out.println("Sinifi gecti.");
            } else {
                System.out.println("Sinifta kaldi.");
            }
        }
    }

    public void printNote() {
        System.out.println("=========================");
        System.out.println("Ogrenci: " + this.name);

        System.out.println("Matematik sinav notu: " + this.mat.note);
        System.out.println("Matematik sozlu notu: " + this.mat.oralNote);
        System.out.println("Matematik ortalamasi: " + this.mat.calcCourseAverage());

        System.out.println("-------------------------");

        System.out.println("Fizik sinav notu: " + this.fizik.note);
        System.out.println("Fizik sozlu notu: " + this.fizik.oralNote);
        System.out.println("Fizik ortalamasi: " + this.fizik.calcCourseAverage());

        System.out.println("-------------------------");

        System.out.println("Kimya sinav notu: " + this.kimya.note);
        System.out.println("Kimya sozlu notu: " + this.kimya.oralNote);
        System.out.println("Kimya ortalamasi: " + this.kimya.calcCourseAverage());
    }
}
