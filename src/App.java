
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

            /*grafo.addArestaDfs(1,2);
            grafo.addArestaDfs(1, 4);
            grafo.addArestaDfs(2, 5);
            grafo.addArestaDfs(3, 5);
            grafo.addArestaDfs(3, 6);
            grafo.addArestaDfs(4, 2);
            grafo.addArestaDfs(5, 4);
            grafo.addArestaDfs(6, 6);*/
            
            Bfs.buscaemlar(grafo, grafo.vertices.get(6));
            //Dfs.buscaEmProfundidade(grafo);
            grafo.imprimeListAdj(grafo);


            //grafo.imprimeVerticeGrafo(grafo);
            //System.out.println("oi final");
        } catch (Exception e) {
            System.out.println("Deu um bug ai !");
        }

    }
}