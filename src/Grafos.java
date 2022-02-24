
import java.util.LinkedList;


public class Grafos {
    public LinkedList<Vertice> vertices = new LinkedList<Vertice>();

    public Grafos(int n) {
        //vertices = new Vertice[n]; -> add ????
        //vertices.add(n);
        for (int i = 0; i < n; i++) {
            vertices.set(i, new Vertice(i));
        }
    }

    public void addAresta(int u, int v) {
        vertices.get(u).adj.add(vertices.get(v));
    }
}
