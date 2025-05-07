public class ArrayEx1 {
    public static void main(String[] args) {
        int students[];
        students = new int[5];
        int total = 0;

        for (int j = 0; j < students.length; j++) {
            students[j] = 90 - j*10;
            total+=students[j];
        }
        int average = total/students.length;
        System.out.println("점수 총합: " + total);
        System.out.println("점수 평균: " + average);
    }
}
