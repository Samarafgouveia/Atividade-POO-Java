package contextualizada;

import java.util.Date;
import java.util.Random;

public class aplicacao {  //eh como se fosse colocar cada unidade de medida em uma caixa
    public int sensorTemperatura;        //sensor da umidade, gas, temperatura
    public int sensorUmidade;
    public int sensorGasCarbonico;

    public void sensorTemperatura(){ //essa class void retorna vazio
        int[] vet; // vetor do tipo inteiro
        Random r = new Random();  //uso metodo random e date, o random gera numero aleatorio e eu difino de quanto a quanto ele gera, e o date gera uma data, geralmente gera adata do dia que ta rodando
        Date data = new Date();   //O R DE RANDOM EH O NOME QUE DEI A VARIAVEL DELE, PODE SER QUALQUER NOEM
        int aux = 0;
        vet = new int[48];

        //ALGORITIMO DE GERADOR DE NUMEROS ALEATORIOS
        for (int i = 0; i < vet.length; i++){ //for eh o algoritmo de repeticao. ele vai comecar em zero, pois i = 0 e a variavel eh i // os numeros aleatorios vao comecar do 0 ao 16 e vai somando
            vet[i] = r.nextInt(80); //nextint eh o nome da variavel que gera os numeros // nextint faz parte da variavel random, em rendom declaramos e em nextint geramos // esses numeros serao gerados nas 16 posicoes de 0 a 80 e eles ficarao armazenados dentro do vetor
        }

        //ALGORITMO DE ORDENACAO - BUBBLE SORT // . compara os numerosgerados atraves do for e if
        for (int i = 0; i <= vet.length; i++){ //vetlength eh o tamanho do vetor // o tamanho do vetor foi declarado la em cima, no caso o 16 // enquanto ele for menor que o vetor que foi declarado ele vai somar mais 1, por isso do i++
            for (int j = 0; j < vet.length; j++){
                if (vet[j] >= vet[j + 1]){                      //o if vai determinar no segundo for. ele vai chamar o valor, se ele for ou maior que o valor que ele tem ele vai adicionar mais um, se nao ele vai guardar no auxiliar. ele vai ficar comparando ate as 16 linhas que declaramos acabar
                    aux = vet[j];
                    vet[j] = vet[j + 1];                            //todos esses for fazem o bubble sort funcionar
                    vet[j + 1] = aux;
                }
            }           // aqui tem um for dentro de um for, o primeiro
           
        }

        //IMPRESSAO NO TERMINAL
        System.out.println("--------------------------------------TEMPERATURA---------------------------------------------");
            for (int j = 0; j<vet.length; j++) {
                
                //GERACAO DE 30 EM 30M
                data = new Date(data.getTime() + 30 * 60 * 1000);
                System.out.printf("Temperatura: " + vet[j] + "°C");
                System.out.printf(" - Horário da medição " + data);
                System.out.println("");
            }

    }

    public void sensorUmidade(){
        int[] vet; //primiero declara o valor, informando que ele sera inteiro e mais a frente inorma que tera 16 linhas
        Random r = new Random();
        Date data = new Date();
        int aux = 0;  // a algoritmo aux vai servir p fazer a ordenacao do codigo
        vet = new int[48]; //vet vai receber um novo valor inteiro de 16 posicoes/linhas
        for (int i = 0; i < vet.length; i++) {
            vet[i] = r.nextInt(200);
        }

        for (int i = 0; i <= vet.length; i++) {
            for (int j = 0; j < vet.length - 1; j++)
            if (vet[j] <= vet[j + 1]) {  //se mudar o sinal <= para => vai mudar pra decrescente ou crescente. assim => eh crescente
                aux = vet[j];
                vet[j] = vet[j + 1];
                vet[j + 1] = aux;
            }
        }

        System.out.println("--------------------------------------------UMIDADE------------------------------------");
            for (int j = 0; j < vet.length; j++) {
                data = new Date(data.getTime() + 30 * 60 * 1000);
                System.out.printf("umidade " + vet[j] = 0.25 + "%% g/m²"); // boatar o 0.25 permite o uso do numeroquebrado. podemos usar o 0.33
                System.out.printf(" - Horário da medição: " + data);
                System.out.println("");
            }
    }

    public void sensorGasCarbonico(){
        int[] vet;
        Random r = new Random();
        Date data = new Date();
        int aux = 0;
        vet = new int[48];
        for (int i = 0; i < vet.length; i++){
            vet[i] = r.nextInt();
        }

        for (int i = 0; i <= vet.length; i++){
            for (int j = 0; j <vet.length - 1; j++)
                if (vet[j] >= vet[j + 1]) {
                    aux = vet[j];
                    vet[j] = vet[j + 1];
                    vet[j + 1] = aux;
                }
        }

        System.out.println("--------------------------GÁS CARBÔNICO----------------------------");
        for (int j = 0; j < vet.length; j++) {
            data = new Date(data.getTime() + 30 * 60 * 1000);
            System.out.println("GÁS CARBÔNICO: " + vet[j] +  "CO²");
            System.out.println(" - Horário da medição: " + data);
            System.out.println("");
        }
    }
    
}
