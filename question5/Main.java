package question5;

import java.util.Scanner;

public class Main {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    public void solution(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                boolean flag = false;
                for (int k = 0; k < dx.length; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];

                    if (nx >= 0 && nx < arr.length && ny >= 0 && ny < arr[0].length &&
                            arr[nx][ny] >= arr[i][j]) {
                        flag = true;
                        break;
                    }
                }
                if (flag) {
                    arr[i][j] += 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();

        Scanner kb = new Scanner(System.in);
        int[][] arr = new int[10][10];
        for (int i=0; i<10; i++) {
            for (int j=0;j<10;j++){
                arr[i][j] = kb.nextInt();
            }
        }

        T.solution(arr);

        System.out.println("정답");

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        	}
    	}
}