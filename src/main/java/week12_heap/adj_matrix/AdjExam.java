package week12_heap.adj_matrix;

class AdjExam {
    public static void main(String[] args) {
        AdjMatrix matrix = new AdjMatrix(7);
        for (int i=0;i<matrix.getSize();i++){
            matrix.insertVertex(i);
        }
        matrix.insertEdge(0,1);
        matrix.insertEdge(0,2);
        matrix.insertEdge(0,3);

        matrix.insertEdge(1,3);
        matrix.insertEdge(1,6);

        matrix.insertEdge(2,4);
        matrix.insertEdge(2,5);

        matrix.insertEdge(3,4);

        matrix.insertEdge(4,5);
        matrix.insertEdge(4,6);

        matrix.insertEdge(5,6);
        System.out.println("그래프 G1의 인접행렬 : ");
        matrix.printMatrix();
        System.out.println("\n");
        AdjList adjList = new AdjList(7);
        for (int i=0;i<adjList.getSize();i++){
            adjList.insertVertex(i);
        }
        adjList.insertEdge(0,1);
        adjList.insertEdge(0,2);
        adjList.insertEdge(0,3);
        adjList.insertEdge(1,3);
        adjList.insertEdge(1,6);
        adjList.insertEdge(2,4);
        adjList.insertEdge(2,5);
        adjList.insertEdge(3,4);
        adjList.insertEdge(4,5);
        adjList.insertEdge(4,6);
        adjList.insertEdge(5,6);

        System.out.println("그래프 G1의 인접리스트 : ");
        adjList.printAdjList();
    }
}
