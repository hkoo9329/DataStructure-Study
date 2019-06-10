package week12_heap.adj_matrix;

class AdjMatrix {
    private int matrix[][];
    private int totalV = 0;

    public AdjMatrix(int size){
        matrix = new int[size][size];
    }

    public void insertVertex(int v){
        totalV++;
    }

    public void insertEdge(int v1, int v2){
        if (v1>=totalV || v2>=totalV){
            System.out.println("그래프에 없는 정점입니다.");
        }else{
            matrix[v1][v2] = 1;
            matrix[v2][v1] = 1;
        }
    }

    public void printMatrix(){
        for (int i=0;i<totalV;i++){
            System.out.print("\n\t\t");
            for (int j=0;j<totalV;j++){
                System.out.print(matrix[i][j]+" ");
            }
        }
    }
    public int getSize(){
        return matrix.length;
    }
}
