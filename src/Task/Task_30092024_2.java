package Task;

public class Task_30092024_2 {
    public static void main(String[] args) {
        //prime no from 1--->100
        int i=1;
        for(i=1;i<=100;i++) {
            int count = 0;
            for (int j = 1; j <= 100; j++) {
                if (i % j == 0) {
                    count++;
                }
            }

            if (count == 2)
            {
                System.out.println(i);
            }
        }

    }
}
