package Graph;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args)
    {

        //문서의 예에 따라 노드를 생성합니다
        Node nA=new Node('A');
        Node nB=new Node('B');
        Node nC=new Node('C');
        Node nD=new Node('D');
        Node nE=new Node('E');
        Node nF=new Node('F');

        //그래프 생성, 노드 추가, 노드 간 에지 생성
        Graph g=new Graph();
        g.addNode(nA);
        g.addNode(nB);
        g.addNode(nC);
        g.addNode(nD);
        g.addNode(nE);
        g.addNode(nF);
        g.setRootNode(nA);

        g.connectNode(nA,nB);
        g.connectNode(nA,nC);
        g.connectNode(nA,nD);

        g.connectNode(nB,nE);
        g.connectNode(nB,nF);
        g.connectNode(nC,nF);


        //그래프 횡단 수행
        System.out.println("DFS Traversal of a tree is ------------->");
        g.dfs();

        System.out.println("\nBFS Traversal of a tree is ------------->");
        g.bfs();




    }

}
