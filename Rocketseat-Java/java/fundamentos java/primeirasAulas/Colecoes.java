package primeirasAulas;
import java.util.HashMap;
import java.util.Map;

public class Colecoes {
    
    public static void main(String[] args) {
        Map<String, Integer> notas = new HashMap<>();
        notas.put("Dani", 9);
        notas.put("Vini", 10);
        notas.put("Elias", 10);

        for(Map.Entry<String,Integer> entry :notas.entrySet()){
            String key = entry.getKey();
            Integer value = entry.getValue();

            System.out.println("A chave e " + key + " e o valor e " + value);
        }
    }
}
