import java.util.Scanner;


public class TabAveso {

    //Tabuada ao avesso
    public static void main(String[] args) {

        //Pedimos para o usuário informar a tabuada
        System.out.println("Digite a tabuada que você deseja: ");
        //Criamos uma instância da da classe Scanner
        Scanner in = new Scanner(System.in);
        //Pegamos o valor digitado pelo usuário
        int tabuada = in.nextInt();

        for(int i = 10; i >= 1; i--){
            //Ax X Bx = Cx
            //Ax -> valor informado pelo usuário
            //Bx -> valor a ser decrementado
            //Cx -> cálculo
            System.out.println(tabuada +
                                 " x " +
                                 i +
                                 " = " +
                                 (tabuada*i));
            // Ax X Bx = Cx
        }
    }
}