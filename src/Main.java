import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //initialize variables
        Scanner scanner=new Scanner(System.in);

        //create instances of classes
        Students students=new Students();
        Results results=new Results();
        Teachers teachers=new Teachers();

        System.out.println("---STUDENTS AND TEACHERS MANAGEMENT ");

        //start a do while loop to keep program running until user decides to exit
        int k;

        do{
            System.out.println("Select what record you want to check:\n" +
                    "1. Students list \n" +
                    "2. Teachers list \n" +
                    "3. Results\n" +
                    "4. Exit");


            k=scanner.nextInt();

            int s;

            if(k==1){
                //a do while loop to keep user managing students record until he decides to go back to main menu
                do {
                    System.out.println("Select the operation you want to do on students data\n" +
                            "1. Add student \n" +
                            "2. View student \n" +
                            "3. Delete student\n" +
                            "4. back");

                    s=scanner.nextInt();

                    if(s==1){
                        students.add(); //calls method add from student class
                    }

                    else if (s==2){
                        students.view(); //calls method view from student class
                    }

                    else if (s==3) {
                        students.delete(); //calls method delete from student class
                    }

                } while (s==1||s==2||s==3);
            }
            else if(k==2){
                //a do while loop to keep user managing teachers record until he decides to go back to main menu
                do {
                    System.out.println("select what you want to manage on teachers records:\n" +
                            "1. Add teacher \n" +
                            "2. View teachers \n" +
                            "3. Delete teacher\n" +
                            "4. Back");

                    s=scanner.nextInt();

                    if(s==1){
                        teachers.add(); //calls method add from teachers class
                    }
                    else if (s==2){
                        teachers.view(); //calls method view from teachers class
                    }
                    else if (s==3) {
                        teachers.delete(); //calls method delete from teachers class
                    }
                } while (s==1||s==2||s==3);
            }
            else if (k==3){
                //a do while loop to keep user managing results record until he decides to go back to main menu
                do {
                    System.out.println("Select the operation you want to do on results  data\n" +
                            "1. Add results \n" +
                            "2. View results \n" +
                            "3. Delete results\n" +
                            "4. Back");

                    s=scanner.nextInt();

                    if(s==1){
                        //it implemented add method of results class here so as to use data in other instances of classes created in this class
                        //enter results
                        boolean present;
                        String i;
                        do {
                            System.out.println("Enter Student Registration number");
                            i=scanner.nextLine();
                            //check if the student is present in the students list
                            present = students.studId.contains(i);
                        }

                        while (!present);
                        results.setStudentId(i);
                        System.out.println("Enter student name");
                        results.setStudentName(scanner.nextLine());
                        System.out.println("Enter the subject");
                        results.setSubject(scanner.nextLine());
                        System.out.println("Enter teacher name");
                        results.setTeacherName(scanner.nextLine());
                        System.out.println("Enter the score");
                        results.setScore(scanner.nextDouble());
                        //add all data to array list using tostring method
                        results.results.add(results);
                        System.out.println("Results added successfully");
                    }
                    else if (s==2){
                        results.view(); //calls method view from results class
                    }
                    else if (s==3) {
                        results.delete(); //calls method delete from student class
                    }
                    else {
                        continue;
                    }
                } while (s==1||s==2||s==3);
            }
            else {
                System.out.println("Thanks.... ");
            }
        }
        while(k==1||k==2||k==3);


    }
}
