public class Main {
    public static void main (String[] args){

        task1(5, 3);
        task2(5);
        task3(2, 2, 50, 3, 1, 59);
        task4(360, 500);
        task5(20, 5, 2);
        task6(5, 8);
        task7(2, 7, 6, 7);
        task8(2,5,5);
        int [] arr = {2,3,5,9,7};
        task9(5, arr);
        task10(5, arr);

    }
    public static void task1 (int a, int b){
        int temp = b;
        b = a;
        a = temp;
        System.out.println("task1 " + a + " " + b);
    }
    public static void task2 (int lesson){
        int time = lesson * 45 + (lesson / 2) * 5
                + ((lesson - 1) / 2) * 15;
        int hour = 9 + time / 60;
        int minute = time % 60;
        System.out.println("task2 " + hour + " " + minute);
    }
    public static void task3 (int h1, int m1, int s1, int h2, int m2, int s2){
        int sec = (h2 - h1)*3600 + (m2 - m1)*60 + s2 - s1;
        System.out.println("task3 " + sec);
    }
    public static void task4 (int n, int m){
        int days = (m + n - 1) / n;
        System.out.println("task4 " + days);
    }
    public static void task5 (int h, int a, int b){
        int res = (int)Math.ceil((double)((h - a) / (a - b))) + 1;
        System.out.println("task5 " + res);
    }
    public static void task6 (int a, int b){
        int res = (((a + b) / b - 1) * a + ((a + b)/a - 1) * b) / ( a / b + b / a);
        System.out.println("task6 " + res);
    }
    public static void task7 (int x1, int y1, int x2, int y2){
       String res = (x1 == x2) || (y2 == y1) ? "YES" : "NO";
        System.out.println("task7 " + res);
    }
    public static void task8 (int a, int b, int c){
        int res = 0;
        if (a==b && a==c){
            res = 3;
        }
        if (a==b || a==c || b==c){
            res = 2;
        }
        System.out.println("task8 " + res);
    }
    public static void task9 (int N, int [] arr){
        int res = 0;
        for (int i = 1; i<N; i++){
            if (arr[i] > arr[i-1])
                res++;
        }
        System.out.println("task9 " + res);
    }
    public static void task10 (int N, int [] arr){
        int res = 0;
        for (int i = 1; i<N-1; i++){
            if (arr[i] > arr[i-1] && arr[i] > arr[i+1]){
                res++;
                i++;
            }
        }
        System.out.println("task10 " + res);
    }

}
