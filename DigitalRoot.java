public class DigitalRoot {
    public static void main(String[] args) {
        System.out.println(findRoot(726));
    }
    static int findRoot(int number)
    {
        int root = 0;

        while (number > 0 || root > 9)
        {
            if (number == 0) {
                number = root;
                root = 0;
            }

            root += number % 10;
            number /= 10;
        }
        return root;
    }
}
