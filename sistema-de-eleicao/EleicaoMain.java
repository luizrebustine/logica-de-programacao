import javax.swing.JOptionPane;

public class EleicaoMain {
    public static void main(String Args[]){
        int opc = 0;
        while(opc != 9){
            opc = Integer.parseInt(JOptionPane.showInputDialog("-------------------MENU PRINCIPAL--------------------\n"
            + "1 - Cadastra Eleitor\n2 - Cadastra Votação 1 e 2\n3 - Agrupa Apuração\n4 - Menu Estatística\n9 - FIM"));
            switch(opc){
                case 1:
                
            }
        }
    }
}
