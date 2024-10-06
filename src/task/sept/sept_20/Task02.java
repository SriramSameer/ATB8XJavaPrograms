package task.sept.sept_20;

public class Task02 {
    public static void main(String[] args) {
        int score = 85;
        char A, B, C;
        String grade = (score>=90) ? "A" : (score>=80 && score<=89) ? "B" : (score>=50 && score<=79) ? "C" : "FAIL";
        System.out.println("grade = " +grade);
    }
}
