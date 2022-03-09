
public class App {
    public static void main(String [] args) throws Exception
    {
        try {
            Grafos grafo = new Grafos(13);
            grafo.addAresta(1,4);
            grafo.addAresta(1, 5);
            grafo.addAresta(1, 2);
            grafo.addAresta(2, 3);
            grafo.addAresta(3, 6);
            grafo.addAresta(3, 7);
            grafo.addAresta(4, 5);
            grafo.addAresta(5, 13);
            grafo.addAresta(5, 12);
            grafo.addAresta(6, 7);
            grafo.addAresta(7, 8);
            grafo.addAresta(7, 10);
            grafo.addAresta(8, 10);
            grafo.addAresta(8, 9);
            grafo.addAresta(9, 11);
            grafo.addAresta(10, 11);
            grafo.addAresta(12,13);

            
            //Bfs.buscaemlar(grafo, grafo.vertices.getFirst());
            Dfs.buscaEmProfundidade(grafo);
            grafo.imprimeListAdj(grafo);


            //grafo.imprimeVerticeGrafo(grafo);
            //System.out.println("oi final");
        } catch (Exception e) {
            System.out.println("Deu um bug ai !");
        }

    }
}