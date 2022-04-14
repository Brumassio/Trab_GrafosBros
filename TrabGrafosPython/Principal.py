from Grafo import Grafo
import tools

# n = int(input("tamanho do grafo: "))
# grafo = Grafo(n) 

# for i in range(n):
#     j = i+1
#     while(j < n):
#         print(i+1,j+1)
#         grafo.addAresta(i+1,j+1)
#         j += 1
src = "C:\\Users\\Diogo Brumassio\\Desktop\\Trabalho_Grafos\\Trabalho_GrafosBrosMin\\TrabGrafosPython\\grafos_de_entrada\\0_grafo.txt"
grafo = tools.lerArquivo(src)
# grafo.addAresta(1,2)
# grafo.addAresta(1,3)
# grafo.addAresta(1,4)
# grafo.addAresta(1,5)
# grafo.addAresta(2,3)
# grafo.addAresta(2,4)
# grafo.addAresta(2,5)
# grafo.addAresta(3,4)
# grafo.addAresta(3,5)
# grafo.addAresta(4,5)

grafo.printarCores()


# print(grafo.vertices[0].adj)
# print(grafo.vertices[1].adj)
# print("\n")
# print(len(grafo.vertices))
#grafo.printarCores(grafo)

# if tools.colorir(grafo):
#     print("Foi possível colorir o grafo !\nGrafo ficou:")
#     grafo.printarCores()
# else:
#     print("Não e possível colorir o grafo  com  4 cores")