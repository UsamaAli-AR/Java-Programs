import java.util.Scanner;

// Abstract class representing a gradeable item
abstract class GradeableItem {
    private String itemName;
    private int maxScore;
    private int obtainedScore;

    // Constructor
    public GradeableItem(String itemName, int maxScore, int obtainedScore) {
        this.itemName = itemName;
        this.maxScore = maxScore;
        this.obtainedScore = obtainedScore;
    }

    // Abstract method to calculate grade
    public abstract String calculateGrade();

    // Getters and Setters
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getMaxScore() {
        return maxScore;
    }

    public void setMaxScore(int maxScore) {
        this.maxScore = maxScore;
    }

    public int getObtainedScore() {
        return obtainedScore;
    }

    public void setObtainedScore(int obtainedScore) {
        this.obtainedScore = obtainedScore;
    }
}

// Concrete subclass representing an Exam
class Exam extends GradeableItem {
    // Constructor
    public Exam(String itemName, int maxScore, int obtainedScore) {
        super(itemName, maxScore, obtainedScore);
    }

    // Override calculateGrade method

    public String calculateGrade() {
        double percentage = (double) getObtainedScore() / getMaxScore() * 100;

        // Determine grade based on percentage
        if (percentage >= 90) {
            return "A";
        } else if (percentage >= 80) {
            return "B";
        } else if (percentage >= 70) {
            return "C";
        } else if (percentage >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    // Method to get percentage
    public double calculatePercentage() {
        return (double) getObtainedScore() / getMaxScore() * 100;
    }
}

// Main class to test the School Grading System
public class SchoolGradingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("███████╗ ██████╗██╗  ██╗ ██████╗  ██████╗ ██╗          ");
        System.out.println("██╔════╝██╔════╝██║  ██║██╔═══██╗██╔═══██╗██║          ");
        System.out.println("███████╗██║     ███████║██║   ██║██║   ██║██║          ");
        System.out.println("╚════██║██║     ██╔══██║██║   ██║██║   ██║██║          ");
        System.out.println("███████║╚██████╗██║  ██║╚██████╔╝╚██████╔╝███████╗     ");
        System.out.println("╚══════╝ ╚═════╝╚═╝  ╚═╝ ╚═════╝  ╚═════╝ ╚══════╝     ");
        System.out.println();
        System.out.println("\t ██████╗ ██████╗  █████╗ ██████╗ ██╗███╗   ██╗ ██████╗  ");
        System.out.println("\t ██╔════╝ ██╔══██╗██╔══██╗██╔══██╗██║████╗  ██║██╔════╝  ");
        System.out.println("\t ██║  ███╗██████╔╝███████║██║  ██║██║██╔██╗ ██║██║  ███╗ ");
        System.out.println("\t ██║   ██║██╔══██╗██╔══██║██║  ██║██║██║╚██╗██║██║   ██║ ");
        System.out.println("\t ╚██████╔╝██║  ██║██║  ██║██████╔╝██║██║ ╚████║╚██████╔╝ ");
        System.out.println("\t ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═╝╚═════╝ ╚═╝╚═╝  ╚═══╝ ╚═════╝  ");
        System.out.println();

        System.out.println("\t \t \t \t \t ███████╗██╗   ██╗███████╗████████╗███████╗███╗   ███╗");
        System.out.println("\t \t \t \t \t ██╔════╝╚██╗ ██╔╝██╔════╝╚══██╔══╝██╔════╝████╗ ████║");
        System.out.println("\t \t \t \t \t ███████╗ ╚████╔╝ ███████╗   ██║   █████╗  ██╔████╔██║");
        System.out.println("\t \t \t \t \t ╚════██║  ╚██╔╝  ╚════██║   ██║   ██╔══╝  ██║╚██╔╝██║");
        System.out.println("\t \t \t \t \t ███████║   ██║   ███████║   ██║   ███████╗██║ ╚═╝ ██║");
        System.out.println("\t \t \t \t \t ╚══════╝   ╚═╝   ╚══════╝   ╚═╝   ╚══════╝╚═╝     ╚═╝");

        System.out.println(
                "________________________________________________________________________________________________");

        System.out.println("\n \t Enter Student Dtails");
        System.out.print("Enter student name: ");
        String studentName = scanner.nextLine();

        System.out.print("Enter class: ");
        String studentClass = scanner.nextLine();

        // Input exam details
        System.out.print("Enter subject name: ");
        String subjectName = scanner.nextLine();

        System.out.print("Enter maximum marks: ");
        int maxMarks = scanner.nextInt();

        // Input obtained marks (with validation)
        int obtainedMarks;
        do {
            System.out.print("Enter obtained marks (must be <= " + maxMarks + "): ");
            obtainedMarks = scanner.nextInt();
            if (obtainedMarks > maxMarks) {
                System.out.println("Obtained marks cannot be greater than maximum marks.");
            }
        } while (obtainedMarks > maxMarks);

        // Create Exam object
        Exam exam = new Exam(subjectName, maxMarks, obtainedMarks);

        // Calculate grade and percentage
        String grade = exam.calculateGrade();
        double percentage = exam.calculatePercentage();

        // Output results
        System.out.println("\nStudent Name: " + studentName);
        System.out.println("Class: " + studentClass);
        System.out.println("Subject Name: " + exam.getItemName());
        System.out.println("Max Marks: " + exam.getMaxScore());
        System.out.println("Obtained Marks: " + exam.getObtainedScore());
        System.out.printf("Percentage: %.2f%%\n", percentage);
        System.out.println("Grade: " + grade);

        // Complimentary message based on grade
        switch (grade) {
            case "A":
                System.out.println("Excellent work! Keep it up, " + studentName + "!");
                break;
            case "B":
                System.out.println("Well done! Good job, " + studentName + "!");
                break;
            case "C":
                System.out.println("Good effort! Keep improving, " + studentName + "!");
                break;
            case "D":
                System.out.println("You passed! Keep studying, " + studentName + "!");
                break;
            case "F":
                System.out.println("Sorry, you did not pass. Keep learning and try again, " + studentName + "!");
                break;
            default:
                System.out.println("Invalid grade");
        }

        scanner.close();
    }
}
