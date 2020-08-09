import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Results extends Students  implements ResultsI {
    public String studentId;
    public String studentName;
    public String subject;
    public String teacherName;
    public double score;

    //create instances of class
    Students students=new Students();
    Scanner scanner=new Scanner(System.in);
    List<Results> results=new ArrayList<>();

    @Override
    public String getStudentId() {
        return studentId;
    }

    @Override
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    @Override
    public String getStudentName() {
        return studentName;
    }

    @Override
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    //changes data written to collection
    @Override
    public String toString() {
        return "Student Id:"+this.getStudentId()+ " " + "Student name:"+this.getStudentName()+ " " + "Subject:"+this.getSubject()+" "+"Teacher name:"+this.getTeacherName()+ " " + "Score:"+this.getScore();
    }

    //adds new result
    @Override
    public  void add() {
    }

    //deletes a certain result
    @Override
    public void delete() {
        System.out.println("Please Enter the number of result you want to delete");
        Iterator iterator=results.iterator();
        int i=0;
        while (iterator.hasNext()){
            System.out.println(i+". "+iterator.next());
            i++;
        }
        int j=scanner.nextInt();
        results.remove(j);
        System.out.println("Results Deleted successfully");
    }

    //returns all results
    @Override
    public void view() {
        if(results.isEmpty()){
            System.out.println("Results records is empty");
        }
        Iterator iterator=results.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
