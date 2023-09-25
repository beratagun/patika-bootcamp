package week2.OgrenciBilgiSistemi;

public class Main {
    public static void main(String[] args) {

        Course mat = new Course("Matematik", "MAT101", "MAT");
        Course fizik = new Course("Fizik", "FZK101", "FZK");
        Course kimya = new Course("Kimya", "KMY101", "KMY");

        Teacher t1 = new Teacher("Hakan Hoca", "0532", "MAT");
        Teacher t2 = new Teacher("Ayşe Hoca", "0544", "FZK");
        Teacher t3 = new Teacher("Osman Hoca", "0531", "KMY");

        mat.addTeacher(t1);
        mat.printTeacher();
        fizik.addTeacher(t2);
        fizik.printTeacher();
        kimya.addTeacher(t3);
        kimya.printTeacher();

        Student s1 = new Student("Berat Agun", 4, "1653", mat, fizik, kimya);
        s1.addBulkExamNote(60, 50, 100);
        s1.addBulkExamOralNote(80, 80, 90);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi", 4, "2273", mat, fizik, kimya);
        s2.addBulkExamNote(100, 50, 40);
        s2.addBulkExamOralNote(80, 90, 90);
        s2.isPass();

        Student s3 = new Student("İnek Şaban", 4, "2212", mat, fizik, kimya);
        s3.addBulkExamNote(50, 20, 40);
        s3.addBulkExamOralNote(80, 90, 90);
        s3.isPass();

    }
}
