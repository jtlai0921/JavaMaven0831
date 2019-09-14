package day03_array;

import java.util.Arrays;
import java.util.Random;

public class ArrayDemo2 {
    public static void main(String[] args) {
        // 0~10
        int[] scores = new int[10];
        // 新增資料
        for(int i=0;i<scores.length;i++) {
            int score = new Random().nextInt(11);
            scores[i] = score;
            System.out.printf("%d ", score);
        }
        System.out.println("\n------------------------");
        
        // 總分/平均 (for-in, for-each)
        int sum = 0;
        double avg = 0;
        for(int score : scores) {
            sum += score;
        }
        avg = (double)sum/scores.length;
        System.out.printf("總分: %d 平均: %.2f\n", sum, avg);
        
        // 總分/平均 (Java 8)
        int    sum2 = Arrays.stream(scores).sum();
        double avg2 = Arrays.stream(scores).average().getAsDouble();
        System.out.printf("總分: %d 平均: %.2f\n", sum2, avg2);
        
    }
}
