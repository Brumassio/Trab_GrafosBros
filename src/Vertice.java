
//import java.util.List;
import java.util.LinkedList;
//package Trabalho_Grafos;

public class Vertice {
    int num;
    LinkedList<Vertice> adj;
    String cor;
    int dzin;
    int fzin;
    Vertice pai;
    boolean maior_adj;
    Integer chave;


    public Vertice(int num) {
        this.num = num;
        this.adj = new LinkedList<Vertice>();
        //System.out.println("dentro do construtor do vertice");
    }

    public String toString() {
        return "Vertice(" + num + ")";
    }
}//class Vertice {
    
//}
