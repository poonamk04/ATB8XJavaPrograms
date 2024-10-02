package Task;

public class Task_25092024_3 {
    public static void main(String[] args) {
        //Prime no
        int no = 100;
        System.out.println("Prime Numbers between 1---->100 are :");
        for(int i=1; i<=no; i++)
        {
            int count =0;
            for(int j=1;j<=no; j++) {
                if(i%j==0) {
                    count++;
                }
            }
            if(count==2) {
                System.out.print(i + " ");
            }
        }
    }
}
