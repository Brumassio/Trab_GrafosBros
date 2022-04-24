from Vertice import Vertice

class Grafo:
    def __init__(self,n):
        self.cores = ["preto","verde","branco","vermelho"]
        self.vertices = []
        for i in range(n):
            self.vertices.append(Vertice(i+1))
            print(self.vertices[i].num)

    def addAresta(self,u,v):
        u-= 1
        v-= 1
        if not self.vertices[v] in self.vertices[u].adj:
            self.vertices[u].adj.append(self.vertices[v])
            self.vertices[v].adj.append(self.vertices[u])

    def printarCores(self):
        for i in self.vertices:
            print(f"Vertice [{i.num}] = {i.cor} \nSeus adjacentes: ")
            for j in i.adj:
                print(j.cor)


    def trocarCor(self,vertice):
        if vertice.cor == self.cores[0]:
            vertice.cor = self.cores[1]
        elif vertice.cor == self.cores[1]:
            vertice.cor =  self.cores[2]
        elif vertice.cor == self.cores[2]:
            vertice.cor = self.cores[3]
   
