import java.time.LocalDateTime;

public class Registro {
    String operacao;
    LocalDateTime dataHora;
    
    public Registro(String operacao) {
        this.operacao = operacao;
        this.dataHora = LocalDateTime.now();
    }
    public String toString() {
        return dataHora + " - " + operacao;
    }
}