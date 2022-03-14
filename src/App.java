
public class App {
    public static void main(String [] args) throws Exception
    {
        try {
            Grafos grafo = new Grafos(90);
            
            /* 
            YH = 53
            SY = 54
            SG = 55
            SR = 56
            SB = 57
            C1 =58
            C2 =59
            C3 =60
            C4 =61
            C5 =62 
            C6 =63
            C7 =64
            C8 =65
            C9 =66
            G1 =67
            G2 =68
            G3 =69
            G4 =70
            G5 =71
            G6=72
            F1 =73
            F2 =74
            F3 =75
            F4 =76
            P1 =78
            P2 =79
            P3 =80
            P4 =81
            P5 =82
            P6 =83
            E1 =84
            E2 =85
            E3 =86
            E4 =87
            E5 =88
            E6 =89
            E7 =90
            */
            grafo.addAresta(53,1);
            grafo.addAresta(53,2);
            grafo.addAresta(1,54);
            grafo.addAresta(2,3);
            grafo.addAresta(3,4);
            grafo.addAresta(4,58);
            grafo.addAresta(5,58);
            grafo.addAresta(5,6);
            grafo.addAresta(5,7);
            grafo.addAresta(6,55);
            grafo.addAresta(6,67);
            grafo.addAresta(7,67);
            grafo.addAresta(8, 67);
            grafo.addAresta(9, 67);
            grafo.addAresta(7, 68);
            grafo.addAresta(9,10);
            grafo.addAresta(10,59);
            grafo.addAresta(68,41);
            grafo.addAresta(68,84);
            grafo.addAresta(68,78);
            grafo.addAresta(39,78);
            grafo.addAresta(39,79);
            grafo.addAresta(59,79);
            grafo.addAresta(11,59);
            grafo.addAresta(11,12);
            grafo.addAresta(11,13);
            grafo.addAresta(12,69);
            grafo.addAresta(12,56);
            grafo.addAresta(13,85);
            grafo.addAresta(13,81);
            grafo.addAresta(14,69);
            grafo.addAresta(14,15);
            grafo.addAresta(15,60);
            grafo.addAresta(60,80);
            grafo.addAresta(18,81);
            grafo.addAresta(18,19);
            grafo.addAresta(19,73);
            grafo.addAresta(20,73);
            grafo.addAresta(20,21);
            grafo.addAresta(21,70);
            grafo.addAresta(16,80);
            grafo.addAresta(16,17);
            grafo.addAresta(16,22);
            grafo.addAresta(17,61);
            grafo.addAresta(23,61);
            grafo.addAresta(23,24);
            grafo.addAresta(23,70);
            grafo.addAresta(24,25);
            grafo.addAresta(24,57);
            grafo.addAresta(24,26);
            grafo.addAresta(24,70);
            grafo.addAresta(25,26);
            grafo.addAresta(25,70);
            grafo.addAresta(26,70);
            grafo.addAresta(26,27);
            grafo.addAresta(27,74);
            grafo.addAresta(74,87);
            grafo.addAresta(25,71);
            grafo.addAresta(28,62);
            grafo.addAresta(28,71);
            grafo.addAresta(29,71);
            grafo.addAresta(29,30);
            grafo.addAresta(29,82);
            grafo.addAresta(30,75);
            grafo.addAresta(30,31);
            grafo.addAresta(31,32);
            grafo.addAresta(32,63);
            grafo.addAresta(63,75);
            grafo.addAresta(63,33);
            grafo.addAresta(63,83);
            grafo.addAresta(33,34);
            grafo.addAresta(34,35);
            grafo.addAresta(35,72);
            grafo.addAresta(35,76);
            grafo.addAresta(38,72);
            grafo.addAresta(36,72);
            grafo.addAresta(64,72);
            grafo.addAresta(24,82);
            grafo.addAresta(36,83);
            grafo.addAresta(66,76);
            grafo.addAresta(65,66);
            grafo.addAresta(65,64);
            grafo.addAresta(65,88);
            grafo.addAresta(37,88);
            grafo.addAresta(37,64);
            grafo.addAresta(40,84);
            grafo.addAresta(44,84);
            grafo.addAresta(40,85);
            grafo.addAresta(41,85);
            grafo.addAresta(41,86);
            grafo.addAresta(42,86);
            grafo.addAresta(42,87);
            grafo.addAresta(43,87);
            grafo.addAresta(43,88);
            grafo.addAresta(44,88);
            grafo.addAresta(40,89);
            grafo.addAresta(41,89);
            grafo.addAresta(42,89);
            grafo.addAresta(43,89);
            grafo.addAresta(44,89);
            grafo.addAresta(45,89);
            grafo.addAresta(45,46);
            grafo.addAresta(46,47);
            grafo.addAresta(47,48);
            grafo.addAresta(48,49);
            grafo.addAresta(49,50);
            grafo.addAresta(50,51);
            grafo.addAresta(51,52);
            grafo.addAresta(52,90);

            //Bfs.buscaemlar(grafo, grafo.vertices.get(52));
            Dfs.buscaEmProfundidade(grafo,true); //boolean para ativar a ordenação topológica 
            grafo.imprimeListAdj(grafo);
            

        } catch (Exception e) {
            System.out.println("Deu um bug ai !");
        }

    }
}