package primeirasAulas;

/*
 * Helloworld = Nome da minha classe
 * public = Tipo de acesso da classe
 * class = Tipo da classe
 */
public class HelloWorld {

    //Todo conteudo devera ser inserido aqui dentro
    public static void main(String[] args){
        /*
         * Valores (int, double, float, long)
         * Texto (String)
         * Boleano (boolean)
         */
        int dadoDoTipoInt = 10;
        double dadoDoTipoDouble = 3.14;
        float dadoDoTipoFloat = 3.14f;
        long dadoDoTipoLong = 831924928L;
        String dadoDoTipoString = "Colocar o meu texto";
        boolean dadoDoTipoBoolean = false;

        // if - else
        // if (dadoDoTipoInt == 10) {
        //     //sysout
        //     System.out.println("Entrou no if do 10");
        // }
        // if(dadoDoTipoInt < 12){
        //     System.out.println("Entrou no if do 12");
        // } 
        // else {
        //     System.out.println("Entrou no else");
        // }

        // While (Enquanto algo for verdadeiro, faca alhuma coisa)
        // int valorInicial = 0;
        // while (valorInicial < 3) {
        //     System.out.println(valorInicial);
        //     System.out.println("O valor inicial e menor que 3");
        //     valorInicial++; // valorInicial = 3
        // }
        // System.out.println("Saiu do while");

        // For
        System.out.println("Inciando o FOR");
        for(int i = 0; i < 4; i++){
            System.out.println("o valor do i e: " + i);
        }
        System.out.println("Finalizando o FOR");

    }
    
}
//Fora do escopo da classe