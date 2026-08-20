import java.util.ArrayList;

public class Usuario {
    private final String cpf;
    private double saldo;
    private ArrayList<Registro> historico = new ArrayList<>();
    
    public Usuario(String cpf) {
        this.cpf = cpf;
        this.saldo = 0.0;
    }
    public void InserirCredito(double valor) {
        saldo = saldo + valor;
        historico.add(new Registro("Deposito de " + valor));
    }
    public void Sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente!");
            return;
        }
        saldo = saldo - valor;
        historico.add(new Registro("Saque de " + valor));
    }
    public void ImprimirExtrato() {
        System.out.println("CPF: " + cpf);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("Operações realizadas:");
        for (Registro r : historico) {
            System.out.println(r);
        }
    }
}