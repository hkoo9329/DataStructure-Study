package week14_spanningTree.spanning_tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class AdjList {
    private GraphNode head[];
    private int totalV = 0;

    public AdjList(int size) {
        head = new GraphNode[size];
    }

    public void insertVertex(int v) {
        totalV++;
    }

    public void edgeSetting(int v1, int v2) {
        GraphNode temp = head[v1];
        GraphNode node = new GraphNode();
        node.vertex = v2;
        if (head[v1] == null) {
            head[v1] = node;
        } else {
            while (temp.link != null) {
                temp = temp.link;
            }
            temp.link = node;
        }
    }

    public void insertEdge(int v1, int v2) {
        if (v1 >= totalV || v2 >= totalV)
            System.out.println("그래프에 없는 정점입니다.");
        else {
            edgeSetting(v1, v2);
            edgeSetting(v2, v1);
        }
    }

    public int getSize() {
        return head.length;
    }

    public void printAdjList() {
        GraphNode node;
        for (int i = 0; i < totalV; i++) {
            System.out.print("\n" + (char) (i + 65) + " 의 인접리스트");
            node = head[i];
            while (node != null) {
                System.out.print(" -> " + (char) (node.vertex + 65));
                node = node.link;
            }
        }
    }

    public void DFS(int v) {
        GraphNode w = new GraphNode();
        Stack<Integer> st = new Stack();
        boolean visited[] = new boolean[getSize()];

        st.push(v);
        visited[v] = true;

        while (!st.isEmpty()) {
            w = head[v];
            while (w != null) {
                if (visited[w.vertex] == false) {
                    st.push(w.vertex);
                    visited[w.vertex] = true;
                    System.out.print(" ( " + (char) (v + 65) + " -> "
                            + (char) (w.vertex + 65) + ")");
                    v = w.vertex;
                    w = head[v];
                } else {
                    w = w.link;
                }
            }
            v = st.pop();
        }

    }

    public void BFS(int v) {
        GraphNode w = new GraphNode();
        Queue<Integer> queue = new LinkedList<>();
        boolean visited[] = new boolean[getSize()];
        visited[v] = true;
        queue.add(v);

        while (!queue.isEmpty()) {
            v = queue.poll();
            for (w = head[v]; w != null; w = w.link) {
                if (visited[w.vertex] == false){
                    visited[w.vertex] = true;
                    System.out.print(" ( " + (char) (v + 65) + " -> "
                            + (char) (w.vertex + 65) + ")");
                    queue.add(w.vertex);
                }
            }
        }
    }
}
