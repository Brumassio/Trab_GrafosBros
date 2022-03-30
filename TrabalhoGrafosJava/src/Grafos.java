import java.util.LinkedList;


public class Grafos {
    public LinkedList<Vertice> vertices;

    public Grafos(int n) {
        
        vertices = new LinkedList<Vertice>();
        
        for (int i = 0; i < n; i++) {
            vertices.add(new Vertice(i+1)); 
        }
    }

    public void addAresta(int u, int v) {
        u--; //pq começa da posição 0 , ou seja , pos 0 -> num = 1;
        v--; //pq começa da posição 0 , ou seja , pos 0 -> num = 1;
        vertices.get(u).adj.add(vertices.get(v));
        if(!vertices.get(v).adj.contains(u)){
            vertices.get(v).adj.add(vertices.get(u));
        }
    }


    public void imprimeVerticeGrafo(Grafos grafo){
        for(int i =0; i< grafo.vertices.size();i++){
            System.out.println(grafo.vertices.get(i).num);
        }
    }

    public static void imprimeVzinDzin(LinkedList<Vertice> list){
        for(int i=0;i<list.size();i++)
        {
            System.out.println("Dzin: "+list.get(i).dzin + "  Fzin: "+list.get(i).fzin);
        }
    }

    public void imprimeListAdj(Grafos grafo){
        for(int i = 0; i< grafo.vertices.size(); i++){
            System.out.println("\n\n********** Vertice "+ grafo.vertices.get(i) +" ********** \n Dzin: "+ grafo.vertices.get(i).dzin + "\nFzin: "+grafo.vertices.get(i).fzin+"\n");
            for(int j =0; j< grafo.vertices.get(i).adj.size();j++){
                System.out.println("Adj n.º "+j+": "+ grafo.vertices.get(i).adj.get(j).num);
            }
        }
    }
}