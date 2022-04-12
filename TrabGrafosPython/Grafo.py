from Vertice import Vertice

class Grafo:
    def __init__(self,n):
        self.cores = ["preto","verde","branco","vermelho"]
        self.vertices = []
        for i in range(n):
            self.vertices.append(Vertice(i+1))
            print(self.vertices[i].num)
        print(self.vertices)

    def addAresta(self,u,v):
        u-= 1
        v-= 1
        if not self.vertices[v] in self.vertices[u].adj:
            self.vertices[u].adj.append(self.vertices[v])
            self.vertices[v].adj.append(self.vertices[u])

    def printarCores(self):
        for i in self.vertices:
            print(i.cor)


    def trocarCor(self,vertice):
        #print(verticeOrigem.cor)
        #print(verticeDestino.cor)
        if vertice.cor == self.cores[0]:
            vertice.cor = self.cores[1]
        elif vertice.cor == self.cores[1]:
            vertice.cor =  self.cores[2]
        elif vertice.cor == self.cores[2]:
            vertice.cor = self.cores[3]
   

    # def arrumaCores(self):
    #     for i in self.vertices:
    #         for j in i.adj:
    #             if i.cor == j.cor:
    #                 self.trocarCor(i,j) 
