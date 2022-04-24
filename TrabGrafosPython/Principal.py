from Grafo import Grafo
import tools

src = "C:\\Users\\Diogo Brumassio\\Desktop\\Trabalho_Grafos\\Trabalho_GrafosBrosMin\\TrabGrafosPython\\grafos_de_entrada\\28_grafo.txt"
grafo = tools.lerArquivo(src)

if tools.colorir(grafo):
    print("Foi possível colorir o grafo !\nGrafo ficou:")
    grafo.printarCores()
else:
    print("Não e possível colorir o grafo  com  4 cores")