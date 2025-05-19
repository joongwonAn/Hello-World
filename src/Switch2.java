public class Switch2 {
    public static void main(String[] args) {
        /*
        A+  :100
        A   : 90-99
        B   : 80-89
        C   : 70-79
        D   : 60-69
        F   : 0-59
         */
        // 시험 점수
        int score = 97;

        // 성적
        String greade;

        switch (score/10) {
            case 10:
                greade = "A+";
                break;
            case 9:
                greade = "A";
                break;
            case 8:
                greade = "B";
                break;
            case 7:
                greade = "C";
                break;
            case 6:
                greade = "D";
                break;
            default:
                greade = "F";
                break;
        }
        System.out.println(greade);
    }
}
