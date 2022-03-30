from Vertice import Vertice

class Grafo:
    def __init__(self,n):
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

