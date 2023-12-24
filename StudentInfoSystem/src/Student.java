/*Student Sınıfı Özellikleri :

        Nitelikler : name,stuNo,classes,course1,course2,course3,avarage,isPass
        Metotlar : Student(), addBulkExamNote(), isPass(), calcAvarage(), printNote()
        */
public class Student {
    String name, stuNo, classes;
    int matEx, fizEx, bioEx, matV, fizV, bioV;
    double avarage=0.0;
    boolean isPass=false;

    Student(String name, String stuNo,String classes,Course MATH, Course PHYS, Course BIO){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;

    }
    void addBulkExamNote(int matEx, int fizEx, int bioEx){
        this.matEx = matEx;
        this.fizEx = fizEx;
        this.bioEx = bioEx;
    }
    void addBulkVivaNote(int matV, int fizV, int bioV){
        this.matV = matV;
        this.fizV = fizV;
        this.bioV = bioV;
    }

    void avarage(){

        double fizAvarage=0,matAvarage=0,bioAvarage=0;
        if((matEx>=0 && matEx<=100)&&(matV>=0 && matV<=100)) {
            matAvarage = (matEx * 0.8) + (matV * 0.2);
        }
        if((fizEx>=0 && fizEx<=100)&&(fizV>=0 && fizV<=100)) {
            fizAvarage = (fizEx * 0.8) + (fizV * 0.2);
        }
        if((bioEx>=0 && bioEx<=100)&&(bioV>=0 && bioV<=100)) {
            bioAvarage = (bioEx * 0.8) + (bioV * 0.2);
        }
        this.avarage = (matAvarage+fizAvarage+bioAvarage)/3.0;
    }

    void isPass(){
        avarage();
        if(this.avarage>=55.0){
            isPass = true;
        }else
            isPass =false;

    }

    void printNote(){
        String result = "";
        isPass();
        System.out.println("Name of Student\t: "+ this.name
                +"\nNumber Of Student\t: "+this.stuNo
                +"\nClass\t: "+this.classes
                +"\nAvarage\t: "+ this.avarage);
        if(isPass==true){
            result = "You PASSED!";
        }else
            result = "You FELL DOWN!";

        System.out.println("Success Status\t: "+result);
    }
}
