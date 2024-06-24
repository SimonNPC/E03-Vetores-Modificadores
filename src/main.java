public class main {

    public static void main(String[] args){

        Conta Teste = new Conta();

        Teste.Deposito(12);

        Teste.Saque(4.50);


        System.out.println(Teste.getSaldo());

        Teste.Extrato(Teste.getVetor_Operacao());
    }

}
