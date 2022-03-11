import java.util.LinkedList;

//import principal.Grafos;
public class  Bfs {

    public static void buscaemlar(Grafos grafo, Vertice ver)
    {
        for(Vertice v : grafo.vertices)
        {
            v.dzin = 0;
            v.pai = null;
            v.cor = "branco";
            System.out.println("dentro do for do bfs");
        }
        ver.dzin = 0;
        ver.pai = null;
        ver.cor = "cinza";
        LinkedList<Vertice> queue = new LinkedList<Vertice>();
        queue.add(ver);
        while(!queue.isEmpty())
        {
            ver = queue.remove();
            for(Vertice u : ver.adj)
            {
                if(u.cor.equals("branco"))
                {
                    u.dzin = ver.dzin +1;
                    u.pai = ver;
                    u.cor = "cinza";
                    queue.add(u);
                    System.out.println("Aresta: "+ver.num+","+u.num);

                }
                
            }
            ver.cor = "preto";
        }
    }
}
