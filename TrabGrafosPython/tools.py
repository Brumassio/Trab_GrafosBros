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
                print("Iteracoes: ",iteracoes)
                return True
            i = 0
            iteracoes += 1
        else:
            grafo.vertices[i].cor = grafo.cores[0]
            i += 1
    print("Iteracoes: ",iteracoes)
    return False
       
def taColorido(grafo):
    for i in  grafo.vertices:
        for j in i.adj:
            if i.cor == j.cor:
                return False
    return True

def lerArquivo(nomeArq):

    with open(nomeArq,"r") as arquivo:
        linhas = arquivo.readlines()
        listinha=[]
        for i in linhas:
            listinha.append( i.replace('\n', ""))
        grafo = Grafo(int(listinha[2].split("=")[1]))
        listinha = listinha[4:]
        for i in listinha:
            i = i.split(" ")
            grafo.addAresta(int(i[0]), int(i[1]))
    return grafo
        