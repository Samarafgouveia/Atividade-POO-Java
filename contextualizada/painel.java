package contextualizada;

public class painel {
    public static void main(String[] args){
        Aplicacao temperatura = new Aplicacao();   // para puxar o que queremos que apareca no painel teremos que puxar da classe aplicacao e dar um new aplicacao e da variavel que declaramos que no caso eh temperatura que eh onde ta ocorrendo os calculos tudo
        temperatura.sensorTemperatura();
        Aplicacao umidade = new Aplicacao();
        umidade.sensorUmidade();
        Aplicacao GasCarbonico = new Aplicacao();
        gascarbonico.sensorGasCarbonico();
    }
    
}
