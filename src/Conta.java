public class Conta {

    Operacao[] Vetor_Operacao = new Operacao[1000];

    //protect
    private double Saldo = 0;

    double Saque(double Valor_Saque){

        if(Saldo < Valor_Saque){

            System.out.println("Não foi possivel realizar o saque");
            return 0;
        }else{

            this.Saldo -= Valor_Saque;
            return Valor_Saque;
        }

    }

    public void Extrato(Operacao[] Extratos_Conta){

        //new date
        for(int i = 0; Extratos_Conta[i] != null; i++){

            System.out.println(Extratos_Conta[i]);
        }

    }

    public double getSaldo() {
        return Saldo;
    }

    double Deposito(double Valor_Deposito){

        if(Valor_Deposito > 0){

            this.Saldo += Valor_Deposito;
            return Valor_Deposito;

        }else{

            System.out.println("Não foi possivel realizar o deposito");

            return 0;


        }

    }

    public Operacao[] getVetor_Operacao() {
        return Vetor_Operacao;
    }
}
