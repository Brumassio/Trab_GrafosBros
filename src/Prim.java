import java.util.LinkedList;

public class Prim {
    Vertice ver;
    public void prim(Grafos grafo,Vertice w,Vertice r){
        for(Vertice u: grafo.vertices){
            u.chave = null;
            u.pai = null;       
        }
        r.chave = 0;
        LinkedList<Vertice> Q = new LinkedList<Vertice>();
        Q = grafo.vertices;
        while(!Q.isEmpty()){
            //ver = extract-min
            /*for(Vertice v: ver.adj){
                if(Q.contains(v) && ver.adj.contains(v) < v.chave){
                    v.pai  = ver;
                    v.chave = w(ver,v);
                }
            }*/
        }
    }
}
