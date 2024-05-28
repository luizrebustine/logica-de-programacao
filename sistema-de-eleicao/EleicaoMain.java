import java.io.IOException;
import javax.swing.JOptionPane;
public class EleicaoMain {
    public static void main(String Args[]) throws IOException{
        Eleicao[] eleicao = new Eleicao[10];
        Cadastro[] cadastro = new Cadastro[10];
        EleicaoMetodos m = new EleicaoMetodos();
        int i;
        int opc = 0;
        while(opc != 9){
            for(i=0;i<10;i++){
                opc = Integer.parseInt(JOptionPane.showInputDialog("-------------------MENU PRINCIPAL--------------------\n"
                + "1 - Cadastra Eleitor\n2 - Cadastra Votação 1 e 2\n3 - Agrupa Apuração\n4 - Menu Estatística\n9 - FIM"));
                switch(opc){
                    case 1:
                        m.cadastraeleitor(cadastro, i);
                        break;
                }      
            }
        }
    }
}
