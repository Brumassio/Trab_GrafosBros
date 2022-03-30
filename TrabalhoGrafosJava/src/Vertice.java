
import java.util.LinkedList;

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
    }

    public Vertice() {
    }

    public String toString() {
        return "Vertice(" + num + ")";
    }
}
    

