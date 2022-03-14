import java.util.LinkedList;

public class Dfs {
    public static LinkedList<Vertice> ordtop = new LinkedList<>();
    public static int tempo;
    public static void buscaEmProfundidade(Grafos grafo, boolean ordenacaoTopologica)
    {
        for(Vertice u : grafo.vertices)
        {
            u.cor = "branco";
            u.pai = null;
        }
        tempo = 0;
        for(Vertice u : grafo.vertices)
        {
            if(u.cor.equals("branco"))
            {
                dfs_visit(u);
            }

        }
        if(ordenacaoTopologica) Grafos.imprimeVzinDzin(ordtop);
        
    }

    public static void dfs_visit(Vertice ver)
    {

        tempo = tempo + 1;
        ver.cor = "cinza";
        ver.dzin = tempo;
        for(Vertice v : ver.adj)
        {
            if(v.cor.equals("branco"))
            {
                v.pai = ver;
                dfs_visit(v);
            }
        }
        ver.cor = "preto";
        tempo = tempo +1;
        ver.fzin = tempo;
        ordtop.addFirst(ver);
    }
}
