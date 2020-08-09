import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Students implements StudentsI {

    public String studentId;
    public String studentName;

    List<String> studId =new ArrayList<>();
    List<String> studName =new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    public String getStudentId() {
        return String.valueOf(studId);
    }

    public void setStudentId(String studentId) {
        studId.add(studentId);
    }

    public String getStudentName() {
        return String.valueOf(studName);
    }

    public void setStudentName(String studentName) {
       studName.add(studentName);
    }

    @Override
    public String toString() {
        return this.getStudentId()+" "+this.getStudentName();
    }
    //adds records of students
    @Override
    public void add() {
        //Students students1=new Students();
        System.out.println("Please enter the Registration of the Student: ");
        setStudentId(scanner.nextLine());
        System.out.println("Please enter the Name of the Student: ");
        setStudentName(scanner.nextLine());
        //students.add(students1);
        System.out.println("Student added successfully");
    }
    //deletes records of certain student
    @Override
    public void delete() {
        System.out.println("Please Enter the noof the Student you want to delete:");
        Iterator iterator=studId.iterator();
        Iterator iterator1=studName.iterator();

        int i=0;
        while (iterator.hasNext()&&iterator1.hasNext()){
            System.out.println(i+". "+iterator.next()+" "+iterator1.next());
            i++;
        }

        int j=scanner.nextInt();
        studId.remove(j);
        studName.remove(j);
        System.out.println("Student Record Deleted Successfully");
    }

    //returns records of all the students
    @Override
    public void view() {
        if(studId.isEmpty()){
            System.out.println("Students List is Empty!!");
        }
        Iterator iterator=studId.iterator();
        Iterator iterator1=studName.iterator();
        while (iterator.hasNext()&&iterator1.hasNext()){
            System.out.println("Student Registration No:" + " " +iterator.next()+" "+"Student Name:" + " " +iterator1.next());
        }
    }
}
