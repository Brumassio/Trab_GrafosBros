import java.util.LinkedList;

//import principal.Grafos;
public class  Bfs {

    public static void buscaemlar(Grafos grafo, Vertice ver)
    {
        int i,j;
        for(i=0; i< grafo.vertices.size(); i++/*Vertice u : grafo.vertices*/)
        {
            grafo.vertices.get(i).dzin = 0;
            grafo.vertices.get(i).pai = null;
            grafo.vertices.get(i).cor = "branco";
            System.out.println("dentro do for do bfs");
        }
        ver.dzin = 0;
        ver.pai = null;
        ver.cor = "cinza";
        System.out.println("oi");
        LinkedList<Vertice> queue = new LinkedList<Vertice>();
        queue.add(ver);
        System.out.println("oi2, size queue: "+ queue.size());
        //grafo.vertices.indexOf(u);
        while(!queue.isEmpty())
        {
            System.out.println("oi3");
            ver = queue.remove();
            System.out.println("oi4, valor de i : "+ i);
            for(j=0; j < grafo.vertices.get(i).adj.size() ;j++/*Vertice v : grafo.vertices.get(index).adj*/)
            {
                System.out.println("oi5");
                if(grafo.vertices.get(i).adj.get(j).cor == "branco")
                {
                    System.out.println("oi6");
                    grafo.vertices.get(i).adj.get(j).dzin = ver.dzin +1;
                    grafo.vertices.get(i).adj.get(j).pai = ver;
                    grafo.vertices.get(i).adj.get(j).cor = "cinza";
                    queue.add(grafo.vertices.get(i).adj.get(j));

                }
                ver.cor = "preto";
            }
        }
    }
}
