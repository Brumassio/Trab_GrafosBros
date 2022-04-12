from Grafo import Grafo

def colorir(grafo):
    i = 0
    iteracoes = 0
    if taColorido(grafo):
        return True
    
    while(i < len(grafo.vertices)):
        if(grafo.vertices[i].cor != grafo.cores[len(grafo.cores)-1] ):
            grafo.trocarCor(grafo.vertices[i])
            if taColorido(grafo):
                print(iteracoes)
                return True
            i = 0
            iteracoes += 1
            #print(iteracoes)
        else:
            grafo.vertices[i].cor = grafo.cores[0]
            i += 1
    print(iteracoes)
    return False
       
def taColorido(grafo):
    for i in  grafo.vertices:
        for j in i.adj:
            if i.cor == j.cor:
                return False
    return True

    