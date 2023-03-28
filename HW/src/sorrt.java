import java.util.Random;

public class sorrt {
    public static void main(String[] args) {
        // 0~100 사이의 임의의 수 30개 생성
        int[] arr = new int[30];
        Random rand = new Random();
        for (int i = 0; i < 30; i++) {
            arr[i] = rand.nextInt(101); // 0~100 사이의 난수 생성
        }
        
        // 정렬 전 배열 출력
        System.out.print("정렬 전: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        // 선택 정렬 알고리즘 사용하여 배열 정렬
        for (int i = 0; i < arr.length-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        
        // 정렬 후 배열 출력
        System.out.print("정렬 후: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}