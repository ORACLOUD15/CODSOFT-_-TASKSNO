import java.util.Scanner;

public class STUDENTGC {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of subjects: ");

        int subjects = sc.nextInt();
        int total = 0;
        for(int i =1; i<=subjects;i++)
        {
             System.out.println("Enter marks of subjects"+ i + ":");
             int marks = sc.nextInt();
             total = total + marks;
        }

        double percentage = (double) total/subjects;
        char grade;
        if (percentage>=90) {
            grade = 'A';
        } else if (percentage>=80) {
            grade = 'B';
        }else if (percentage>=70) {
            grade = 'C';
        }else if (percentage>=60) {
            grade = 'D';
        }else if (percentage>=50) {
            grade = 'E';
        }else {
            grade = 'B';
        }

        System.out.println("\nRESULT");
         System.out.println("Total Marks: " + total);
          System.out.println("Average Percentage: "+ percentage + "%");
           System.out.println("Grade: "+ grade);
           sc.close();
    }
}
 