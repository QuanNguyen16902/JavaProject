import java.util.Scanner;

public class TimGiaTri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        boolean isExist = false;
        while (!isExist){
            System.out.println();
            System.out.print("Enter a name’s student:");
            String input_name = scanner.nextLine();
            for (int i = 0; i < students.length; i++) {
                if (students[i].equals(input_name)) {
                    System.out.println("Position of the students in the list " + input_name + " is: " + i);
                    isExist = true;
                    break;
                }
            }
            if (!isExist) {
           System.out.println("Not found" + input_name + " in the list.");
        }
        }


//        if (!isExist) {
//            System.out.println("Not found" + input_name + " in the list.");
//        }
    }


}
