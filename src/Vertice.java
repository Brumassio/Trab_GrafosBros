
import java.util.List;
import java.util.LinkedList;
//package Trabalho_Grafos;

public class Vertice {
    int num;
    List<Vertice> adj;
    String cor;
    int dzin;
    int fzin;
    Vertice pai;


    public Vertice(int num) {
        this.num = num;
        this.adj = new LinkedList<Vertice>();
    }

    public String toString() {
        return "Vertice(" + num + ")";
    }
}//class Vertice {
    
//}
