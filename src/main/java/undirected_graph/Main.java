package undirected_graph;

public class Main {
    public static void main(String[] args) {
        // C1: đơn giản, tạo đồ thị bằng ma trận (mảng 2 chiều)
        // Định nghĩa chi tiết các đỉnh và liên kết

        char v[] = {'A', 'B', 'C', 'D'};
        // Tạo ma trận: (mảng 2 chiều)
        int matrix[][] = {
                {0, 1, 1, 1},
                {1, 0, 1, 0},
                {1, 1, 0, 0},
                {1, 0, 0, 0}
        };
        // In ra do thi: lien ket giua cac dinh
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + ": ");
            for (int j = 0; j < v.length; j++) {
                if (matrix[i][j] == 1) {
                    // In ra dinh j
                    System.out.print(v[j] + " ");
                }
            }
            System.out.println();
        }
    }
}
