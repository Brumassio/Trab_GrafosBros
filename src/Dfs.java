public class Dfs {
    int tempo;
    public void buscaEmProfundidade(Grafos grafo)
    {
        for(Vertice u : grafo.vertices)
        {
            u.cor = "branco";
            u.pai = null;
        }
        tempo = 0;
        for(Vertice u : grafo.vertices)
        {
            if(u.cor == "branco")
            {
                dfs_visit(u);
            }
        }
    }

    public void dfs_visit(Vertice ver)
    {
        tempo = tempo + 1;
        ver.cor = "cinza";
        ver.dzin = tempo;
        for(Vertice v : ver.adj)
        {
            if(v.cor == "branco")
            {
                v.pai = ver;
                dfs_visit(v);
            }
            ver.cor = "preto";
            tempo = tempo +1;
            ver.fzin = tempo;
        }
    }
}
