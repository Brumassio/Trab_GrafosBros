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

def lerArquivo(nomeArq):

    with open(nomeArq,"r") as arquivo:
        linhas = arquivo.readlines()
        print("ola:",linhas)
        listinha=[]
        for i in linhas:
            listinha.append( i.replace('\n', ""))
        print("ola2:",listinha)
        grafo = Grafo(int(listinha[2].split("=")[1]))
        listinha = listinha[4:]
        print("lista fofa: ",listinha)
        for i in listinha:
            print(i)
            i = i.split(" ")
            print("pos split",i)
            print(f"i[0]: {i[0]} e i[1]: {i[1]}")
            grafo.addAresta(int(i[0]), int(i[1]))
            print("oi")
    return grafo
        