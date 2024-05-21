import java.io.*;
import javax.swing.*;
public class VotacaoMetodos {
    public Votacao[] FCadastraVotacao(Votacao[] votacao){
        int i;
        for(i=0;i<200;i++){
            votacao[i] = new Votacao();
        }
        for(i=0;i<200;i++){
            votacao[i].NumeroSecao = (int)(Math.random()*11);
            votacao[i].NumeroCandidato = (int)(Math.random()*300);
        }
        return votacao;
    }
    public void FClassificaSecao(Votacao[] votacao){
        int i, j, aux;
        for(i=0;i<200;i++){
            for(j=0;j<199;j++){
                if(votacao[j].NumeroSecao > votacao[j + 1].NumeroSecao){
                    aux = votacao[j].NumeroSecao;
                    votacao[j].NumeroSecao = votacao[j+1].NumeroSecao;
                    votacao[j+1].NumeroSecao = aux;
                    aux = votacao[j].NumeroCandidato;
                    votacao[j].NumeroCandidato = votacao[j+1].NumeroCandidato;
                    votacao[j+1].NumeroCandidato = aux;
                }
            }
        }
        /*for(i=0;i<200;i++){
            System.out.print(votacao[i].NumeroSecao + " ");
        }
        System.out.print("\n");
        for(i=0;i<200;i++){
            System.out.print(votacao[i].NumeroCandidato + " ");
        }*/
    }
    public void FGravaVotacao(Votacao[] votacao)throws IOException{
        String nomearquivo = "votacao.txt";
        BufferedWriter gravar = new BufferedWriter(new FileWriter(nomearquivo));
        int i;
        for(i=0;i<200;i++){
            gravar.write(Integer.toString(votacao[i].NumeroSecao));
            gravar.newLine();
            gravar.write(Integer.toString(votacao[i].NumeroCandidato));
            gravar.newLine();
        }
        System.out.println("GRAVAÇÃO FEITA COM SUCESSO");
        gravar.close();
    }
    public void FQuantidadeCandidatos(Votacao[] votacao){
        int i;
        int[] vetorquantidade = FCalculaSeção(votacao);
        for(i=0;i<=10;i++){
            System.out.println("Quantidade de candidatos do número " + i + " = " + vetorquantidade[i]);
        }
    }
    public int[] FCalculaSeção(Votacao[] votacao){
        int i, j;
        int quantidade = 0;
        int[] vetorquantidade = new int[11];
        for(i=0;i<=10;i++){
            for(j=0;j<200;j++){
                if(votacao[j].NumeroSecao == i){
                    quantidade ++;
                }
            }
        vetorquantidade[i] = quantidade;
        quantidade = 0;
        }
        return vetorquantidade;
    }
    public void FSeçãoMaiorMenor(Votacao[] votacao){
        int i, j, aux;
        int[] vetorquantidade = FCalculaSeção(votacao);
        for(i=0;i<=10;i++){
            for(j=0;j<10;j++){
                if(vetorquantidade[j+1] > vetorquantidade[j]){
                    aux = vetorquantidade[j];
                    vetorquantidade[j] = vetorquantidade[j+1];
                    vetorquantidade[j+1] = aux;
                }
            }
        }
        System.out.print("Maior Seção: " + vetorquantidade[0] + " Menor Seção: " + vetorquantidade[10]);
    }
    public int[] FCalculaCandidato(Votacao[] votacao){
        int i, j;
        int quantidade = 0;
        int[] vetorquantidade = new int[300];
        for(i=0;i<300;i++){
            for(j=0;j<200;j++){
                if(votacao[j].NumeroCandidato == i){
                    quantidade ++;
                }
            }
        vetorquantidade[i] = quantidade;
        quantidade = 0;
        }
        return vetorquantidade;
    }
    public void FVotosPorCandidato(Votacao[] votacao){
        int i;
        int[] vetorquantidade = FCalculaCandidato(votacao);
        for(i=0;i<300;i++){
            System.out.println("Quantidade de votos do candidato " + i + " = " + vetorquantidade[i]);
        }
    }
    public void FDezCandidatos(Votacao[] votacao){
        int i, j, aux;
        String zeroesquerda = "%s";
        int[] vetorquantidade = FCalculaCandidato(votacao);
        int[] vetorindice = new int[300];
        for(i=0;i<300;i++){
            vetorindice[i] = i;
        }
        for(i=0;i<300;i++){
            for(j=0;j<299;j++){
                if(vetorquantidade[j+1] > vetorquantidade[j]){
                    aux = vetorquantidade[j];
                    vetorquantidade[j] = vetorquantidade[j+1];
                    vetorquantidade[j+1] = aux;
                    aux = vetorindice[j];
                    vetorindice[j] = vetorindice[j+1];
                    vetorindice[j+1] = aux;
                }
            }
        }
        for(i=0;i<10;i++){
            System.out.println(String.format("%02d", (i+1)) + "° - candidato " + String.format("%03d", vetorindice[i]) + ", " + vetorquantidade[i] + " votos");
        }
    }
}
