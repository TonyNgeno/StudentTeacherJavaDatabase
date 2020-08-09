import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Teachers implements TeachersI{
    public String teacherId;
    public String teacherName;
    Scanner scanner=new Scanner(System.in);
    List<Teachers> teacher=new ArrayList<>();


    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    @Override
    public String toString() {
        return "Teacher Id:"+this.getTeacherId()+" "+"Teacher name:"+this.getTeacherName();
    }

    // adds new teachers
    @Override
    public void add() {

        //create teachers object
        Teachers teachers=new Teachers();

        System.out.println("Please Enter the Teacher ID:");
        teachers.setTeacherId(scanner.nextLine());

        System.out.println("Please Enter the Name of the Teacher:");
        teachers.setTeacherName(scanner.nextLine());

        teacher.add(teachers);
        System.out.println("Teacher Added Successfully:");

    }
    //deletes a certain record of teachers
    @Override
    public void delete() {
        System.out.println("Enter the Id of the Teacher you want to Delete:");
        Iterator iterator=teacher.iterator();
        int i=0;
        while (iterator.hasNext()){
            System.out.println(i+". "+iterator.next());
            i++;
        }
        int j=scanner.nextInt();
        teacher.remove(j);
        System.out.println("Teacher Deleted Successfully.");
    }

    //returns records of all the teachers
    @Override
    public void view() {
        if(teacher.isEmpty()){
            System.out.println("Teachers records is empty");
        }
        Iterator iterator=teacher.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
