class Person{
    private String fname;
    private String lname;
    
    Person(String fname, String lname){
        this.fname=fname;
        this.lname=lname;
    }
    public void info(){
        System.out.println(fname+","+lname);
    }        
}

class Student extends Person{
    private String branch;
    private int sem;
    
    
    public void info(){
        //System.out.println(fname+","+lname);
        super.info();
        System.out.println(branch+","+sem);
    }
    
    
    //             "Manish"     "Jain"          "CS"        4
    Student(String fname, String lname, String branch, int sem){
        super(fname,lname);
        this.branch=branch;
        this.sem=sem;
    }
    
}


public class SuperThree {

    public static void main(String[] args) {
        Student s=new Student("Manish","Jain","CS",4);
        s.info();
    }
}
