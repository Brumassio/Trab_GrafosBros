from Grafo import Grafo

def trocarCor(verticeOrigem, verticeDestino, grafo):
    #print(verticeOrigem.cor)
    #print(verticeDestino.cor)
    if verticeOrigem.cor == grafo.cores[0]:
        verticeDestino.cor = grafo.cores[1]
    elif verticeOrigem.cor == grafo.cores[1]:
        verticeDestino.cor =  grafo.cores[2]
    elif verticeOrigem.cor == grafo.cores[2]:
        verticeDestino.cor = grafo.cores[3]
    elif verticeOrigem.cor == grafo.cores[3]:
        verticeDestino.cor = grafo.cores[0]


def arrumaCores(grafo):
    for i in  grafo.vertices:
        for j in i.adj:
            if i.cor == j.cor:
                trocarCor(i,j,grafo)