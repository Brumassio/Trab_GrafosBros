from Grafo import Grafo
import tools


grafo = Grafo(5)
grafo.addAresta(1,2)
grafo.addAresta(1,3)
grafo.addAresta(1,4)
grafo.addAresta(1,5)
grafo.addAresta(2,3)

print(grafo.vertices[0].adj)
print(grafo.vertices[1].adj)
print("\n")
# print(len(grafo.vertices))
#grafo.printarCores(grafo)
tools.arrumaCores(grafo)
grafo.printarCores()