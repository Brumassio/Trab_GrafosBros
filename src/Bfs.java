import java.util.LinkedList;

//import principal.Grafos;
public class  Bfs {

    public static void buscaemlar(Grafos grafo, Vertice ver)
    {
        for(Vertice u : grafo.vertices)
        {
            ver.dzin = 0;
            ver.pai = null;
            ver.cor = "branco";
        }
        ver.dzin = 0;
        ver.pai = null;
        ver.cor = "cinza";
        LinkedList<Vertice> queue = new LinkedList<Vertice>();
        queue.add(ver);
        while(queue.size() != 0)
        {
            ver = queue.remove();
            for(Vertice v : grafo.vertices)
            {
                if(v.cor == "branco")
                {
                    v.dzin = ver.dzin +1;
                    v.pai = ver;
                    v.cor = "cinza";
                    queue.add(v);
                }
                ver.cor = "preto";
            }
        }
    }
}
