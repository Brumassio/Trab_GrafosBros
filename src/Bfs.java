import java.util.LinkedList;

public class  Bfs {
    static Vertice v;
    public static void buscaemlar(Grafos grafo, Vertice ver)
    {
        
        for(Vertice v : grafo.vertices)
        {
            v.dzin = 0;
            v.pai = null;
            v.cor = "branco";
        }
        ver.dzin = 0;
        ver.pai = null;
        ver.cor = "cinza";
        LinkedList<Vertice> queue = new LinkedList<Vertice>();
        queue.add(ver);
        while(!queue.isEmpty())
        {
            v = queue.remove();
            
            for(Vertice u : v.adj)
            {
                if(u.cor.equals("branco"))
                {
                    u.dzin = v.dzin +1;
                    u.pai = v;
                    u.cor = "cinza";
                    queue.add(u);
                    System.out.println("Aresta: "+v.num+","+u.num);

                }
                
            }
            v.cor = "preto";
        }
    }
}
