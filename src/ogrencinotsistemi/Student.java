package ogrencinotsistemi;

public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.examNote = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.examNote = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.examNote = kimya;
        }

    }
    public void addBulkQuizNote(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.quizNote = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.quizNote = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.quizNote = kimya;
        }

    }

    public void isPass() {
        if (this.mat.examNote == 0 || this.fizik.examNote == 0 || this.kimya.examNote == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        double examAvarage = (this.fizik.examNote + this.kimya.examNote + this.mat.examNote) / 3.0;
        double quizAvarage = (this.fizik.quizNote + this.kimya.quizNote + this.mat.quizNote) / 3.0;
        this.avarage = (examAvarage * 0.80) + (quizAvarage * 0.20);
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Ortalaması : " + ((this.mat.examNote * 0.80) + (this.mat.quizNote * 0.20)));
        System.out.println("Fizik Ortalaması : " + ((this.fizik.examNote * 0.80) + (this.fizik.quizNote * 0.20)));
        System.out.println("Kimya Ortalaması : " + ((this.kimya.examNote * 0.80) + (this.kimya.quizNote * 0.20)));
    }
}
