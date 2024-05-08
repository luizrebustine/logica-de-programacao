import java.io.*;
import javax.swing.JOptionPane;
public class ClasseMétodos {
    public Estatistica[] cadastraestatistica(Estatistica[] estatistica)throws IOException{
        int i;
        String nomearquivo = "Frio.txt";
        BufferedWriter gravar = new BufferedWriter(new FileWriter(nomearquivo));
        for(i=0;i<=9;i++){
            estatistica[i] = new Estatistica();
        }
        for(i=0;i<=9;i++){
            estatistica[i].codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código da cidade"));
            gravar.write(Integer.toString(estatistica[i].codigo));
            gravar.newLine();
            estatistica[i].nome = JOptionPane.showInputDialog("Digite o nome da cidade");
            gravar.write(estatistica[i].nome);
            gravar.newLine();
            estatistica[i].acidentes = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de acidentes"));
            gravar.write(Integer.toString(estatistica[i].acidentes));
            gravar.newLine();
        }
        System.out.println("/----------------------------------------/");
        System.out.println("Cadastro feito com sucesso");
        System.out.println("/----------------------------------------/");
        gravar.close();
        return estatistica;
    }
    public void buscaacidentes(Estatistica[] estatistica)throws IOException{
        ler(estatistica);
        int quantidadebusca, i;
        boolean achou = false;
        quantidadebusca = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de acidentes que deseja buscar"));
        for(i=0;i<=9;i++){
            if(quantidadebusca == estatistica[i].acidentes){
                System.out.println("/----------------------------------------/");
                System.out.println("Código: " + estatistica[i].codigo + "\nNome: " + estatistica[i].nome + "\n"
                + "Quantidade de acidentes: " + estatistica[i].acidentes);
                System.out.println("/----------------------------------------/");
                achou = true;
            }
        }
        if(achou != true){
            System.out.println("/----------------------------------------/");
            System.out.println("Cidade não encontrada");
            System.out.println("/----------------------------------------/");
        }
    }
    public void buscamaiormenor(Estatistica[] estatistica)throws IOException{
        ler(estatistica);
        int menor, maior, i, indicemenor, indicemaior;
        indicemenor = 0;
        indicemaior = 0;
        menor = 0;
        maior = 0;
        for(i=0;i<=9;i++){
            if(menor == 0){
                menor = estatistica[i].acidentes;
            }
            else if(estatistica[i].acidentes < menor){
                menor = estatistica[i].acidentes;
                indicemenor = i;
            }
            else if(estatistica[i].acidentes > maior){
                maior = estatistica[i].acidentes;
                indicemaior = i;
            }
        }
        //System.out.println("Maior" + maior);
        //System.out.println("Menor" + menor);
        System.out.println("/----------------------------------------/");
        System.out.println("Maior número de acidentes: " + estatistica[indicemaior].nome + ", " + estatistica[indicemaior].acidentes + " acidentes");
        System.out.println("Menor número de acidentes: " + estatistica[indicemenor].nome + ", " + estatistica[indicemenor].acidentes + " acidentes");
        System.out.println("/----------------------------------------/");
    }
    
    public void ler(Estatistica[] estatistica)throws IOException{
        int i;
        String nomearquivo = "Frio.txt";
        BufferedReader ler = new BufferedReader(new FileReader(nomearquivo));
        for(i=0;i<=9;i++){
            estatistica[i] = new Estatistica();
        }
        for(i=0;i<=9;i++){
            estatistica[i].codigo = Integer.parseInt(ler.readLine());
            estatistica[i].nome = ler.readLine();
            estatistica[i].acidentes = Integer.parseInt(ler.readLine());
        }
        ler.close();
    }
    
    public void acimadamedia(Estatistica[] estatistica)throws IOException{
        ler(estatistica);
        int i;
        String[] cidadesmedia = new String[10];
        int media = 0;
        for(i=0;i<=9;i++){
            media += estatistica[i].acidentes;
        }
        media = media/10;
        for(i=0;i<=9;i++){
            if(media>estatistica[i].acidentes){
                cidadesmedia[i] = estatistica[i].nome;
            }
        }
        for(i=0;i<=9;i++){
            System.out.print(cidadesmedia[i]);
        }
    }
}
