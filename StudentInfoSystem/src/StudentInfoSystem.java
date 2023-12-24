public class StudentInfoSystem {
    public static void main(String[] args) {
        Course mat = new Course("Mathematic","101","MATH");
        Course fiz = new Course("Physic", "101","PHYS");
        Course bio = new Course("Biology","102","BIO");

        Teacher T1 = new Teacher("Mahmut Hoca","MATH","111");
        Teacher T2 = new Teacher("Akil Hoca","PHYS","112");
        Teacher T3 = new Teacher("Külyutmaz","BIO","113");

        Student s1 = new Student("İnek Şaban","333","3",mat,fiz,bio);
        Student s2 = new Student("Güdük Necmi","334","3",mat,fiz,bio);
        Student s3 = new Student("Tulum Hayri","335","3",mat,fiz,bio);

        //Yazılı sınav notarı
        s1.addBulkExamNote(50,55,50);

        //Sözlü sınav notları
        s1.addBulkVivaNote(50,75,65);

        //öğrenci bilgisi
        s1.printNote();

        //öğretmen ataması
        fiz.addTeacher(T1);



    }
}