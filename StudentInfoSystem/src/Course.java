/*
        Course Sınıfı Özellikleri :

        Nitelikler : name,code,prefix,note,Teacher
        Metotlar : Course() , addTeacher() , printTeacher()

 */
public class Course {
    String name, code, prefix;
    Teacher courseTeacher;
    int note;

    Course(String name, String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;

    }

    void addTeacher (Teacher teacher){
        if(this.prefix.equals(teacher.branch)){
            this.courseTeacher=teacher;
            System.out.println(teacher.name+" was successfully appointed for "+this.name);
        }else
            System.out.println("Branch of "+teacher.name+" is NOT available for "+ this.name);
    }
    void printTeacher(){
        if(courseTeacher != null){
            System.out.println(this.name +"'s teacher is "+this.courseTeacher);
        }else
            System.out.println("There is not a teacher in this course !");
    }

}
