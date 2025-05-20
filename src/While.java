public class While {
    public static void main(String[] args) {
        int num = 10000;
        int key = 153;

        int i = 1;
        while (key * i < num) {
            i++;
        }

        System.out.println(key * (i - 1));
    }
}
