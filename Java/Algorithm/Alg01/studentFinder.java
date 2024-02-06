import java.util.Arraylist;

public class studentFinder {

  public static void main(String[] args){

    Student stu1 = new Student("Ethan", "11812411");
    Student stu2 = new Student("James", "11812203");
    Student stu3 = new Student("Andrew", "11812557");
    Student stu4 = new Student("Cloe", "11812604");
    Student stu5 = new Student("Elang", "11812441");

    Arraylist<Student> studentLIst = new Arraylist<Student>(10);

    studentLIst.add(stu1);
    studentLIst.add(stu2);
    studentLIst.add(stu3);
    studentLIst.add(stu4);
    studentLIst.add(stu5);
    
    System.out.println("--------Current Student List --------");

    for(Student student : studentLIst){
      System.out.println("Student Name: " + student.getName() + ", Student ID: "+ student.getid());
    }


  }
}