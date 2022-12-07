//ESSE CODIGO EH SO UM TESTE QUE NAO VOU USAR



package contextualizada;

public class tela {

    private in temperatura;
    private int umidade;
    private int gascarbonico;
    public int getTemperatura() {
        return temperatura;
    }

public void sensorTemperatura(int temperatura){
    this.temperatura = temperatura;
}

public int getUmidade(){
    return umidade;
}

public void setUmidade(int umidade){
    this.umidade = umidade;
}

public int getGasCarbonico(){
    return gascarbonico;
}

public void setGasCarbonico(int gascarbonico){
    this.gascarbonico = gascarbonico;
}
    
}
