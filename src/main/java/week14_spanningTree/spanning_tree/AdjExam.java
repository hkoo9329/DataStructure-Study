package week14_spanningTree.spanning_tree;

class AdjExam {
    public static void main(String[] args) {
        AdjList adjList = new AdjList(7);
        for (int i = 0; i < adjList.getSize(); i++) {
            adjList.insertVertex(i);
        }
        adjList.insertEdge(0, 1);
        adjList.insertEdge(0, 2);
        adjList.insertEdge(0, 3);
        adjList.insertEdge(1, 3);
        adjList.insertEdge(1, 6);
        adjList.insertEdge(2, 4);
        adjList.insertEdge(2, 5);
        adjList.insertEdge(3, 4);
        adjList.insertEdge(4, 5);
        adjList.insertEdge(4, 6);
        adjList.insertEdge(5, 6);

        System.out.println("그래프 G1의 인접리스트 : ");
        adjList.printAdjList();

        System.out.print("\n\n 깊이 우선 탐색 >> ");
        adjList.DFS(0);
        System.out.print("\n\n 너비 우선 탐색 >> ");
        adjList.BFS(0);
    }
}
