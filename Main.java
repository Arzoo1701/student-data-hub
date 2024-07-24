import java.util.Scanner;
 class Student {

    int enrollmentNo;
    String name;
    String branch;

     public Student(int enrollmentNo,String name, String branch) {
         this.enrollmentNo = enrollmentNo;
         this.name=name;
         this.branch=branch;
     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public String getBranch() {
         return branch;
     }

     public void setBranch(String branch) {
         this.branch = branch;
     }

     public int getEnrollmentNo() {
        return enrollmentNo;
    }

    public void setEnrollmentNo(int enrollmentNo) {
        this.enrollmentNo = enrollmentNo;
    }
}




public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students for Internship Program: ");
        int studentNum = scanner.nextInt();
        scanner.nextLine();

        Student[] studentArray = new Student[studentNum];

        System.out.println("Enter student details");
        for (int i = 0; i < studentNum; i++) {


            System.out.println("Student:"+ (i+1));


            System.out.print("Name:");

            String name=scanner.nextLine();

            System.out.print("Enrollment Number:");
            int enrollmentNo = scanner.nextInt();

            scanner.nextLine();


            System.out.print("Branch: ");
            String branch = scanner.nextLine();

            studentArray[i] = new Student(enrollmentNo, name, branch);
        }

        System.out.println();
        System.out.println();
        System.out.println("You have entered student details for "+studentNum+" students. Please find below records");

        for (int i = 0; i < studentNum; i++) {

                System.out.println();
                System.out.println("Enrollment Number: " + studentArray[i].getEnrollmentNo());
                System.out.println("Name: " + studentArray[i].getName());
                System.out.println("Branch: " + studentArray[i].getBranch());

        }

        System.out.println();
        System.out.println();

        System.out.println("Do you want to search the student details?(Y/N)");
        String yorN=scanner.nextLine();
        if(yorN.equalsIgnoreCase("Y")) {


            System.out.println("Enter the criteria for searching the students");
            System.out.println("Type E for searching on basis of enrollment number");
            System.out.println("Type N for searching on basis of name");
            System.out.println("Type B for searching on basis of branch");

            System.out.println("Your Input:");
            String optionSelected = scanner.nextLine();
            if (optionSelected.equalsIgnoreCase("E")) {
                System.out.println("Enter enrollment Number:");
                int enrolNoEntered= scanner.nextInt();
            for (int i = 0; i < studentNum; i++) {

                if (studentArray[i].getEnrollmentNo() == enrolNoEntered) {

                    System.out.println();
                    System.out.println("Enrollment Number: " + studentArray[i].getEnrollmentNo());
                    System.out.println("Name: " + studentArray[i].getName());
                    System.out.println("Branch: " + studentArray[i].getBranch());
                }
            }
            }

            if (optionSelected.equalsIgnoreCase("N")) {
                System.out.println("Enter Student Name:");
                String nameEntered= scanner.nextLine();
                for (int i = 0; i < studentNum; i++) {

                    if (studentArray[i].getName().equalsIgnoreCase(nameEntered) ) {

                        System.out.println();
                        System.out.println("Enrollment Number: " + studentArray[i].getEnrollmentNo());
                        System.out.println("Name: " + studentArray[i].getName());
                        System.out.println("Branch: " + studentArray[i].getBranch());
                    }
                }
            }

            if (optionSelected.equalsIgnoreCase("B")) {
                System.out.println("Enter Student Branch:");
                String branchEntered= scanner.nextLine();
                for (int i = 0; i < studentNum; i++) {

                    System.out.println("Records Found:::");
                    if (studentArray[i].getBranch().equalsIgnoreCase(branchEntered) ) {

                        System.out.println();
                        System.out.println("Enrollment Number: " + studentArray[i].getEnrollmentNo());
                        System.out.println("Name: " + studentArray[i].getName());
                        System.out.println("Branch: " + studentArray[i].getBranch());
                    }
                }
            }
        }
          else {
            System.out.println("Exit!!");
        }


    }
    }
