package primeirasAulas;
import java.util.ArrayList;
import java.util.List;

public class EstruturaDeDados {
    
    public static void main(String[] args) {
        //lista
        List<String> nomes = new ArrayList<>();
        nomes.add("Dani");
        nomes.add("Vini");
        nomes.add("Elias");
        // 0 -
        // 1 -
        // 2 -

        //System.out.println(nomes.get(2));
        // for ( String nome : nomes) {
        //     System.out.println("O nome e " + nome);
        // }
            nomes.forEach(nome -> System.out.println("o nome que apareceu foi " + nome));
    }

}
