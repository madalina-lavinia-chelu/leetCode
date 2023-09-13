import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List <Integer> test = List.of(1,2);
        test.add(3);


        List<Copil> list = new ArrayList <>();

        List<Copil> listCopiiVarstaPeste10 = new ArrayList <>();

        List <Copil> collect = list.stream().filter(c -> c.getVarsta() > 10).collect(Collectors.toList());

//        /predicate -> true/false

        boolean b = list.stream().allMatch(c -> c.getVarsta() > 10);

        list.stream().collect(Collectors.toMap(k-> k.getNume(), x -> x));
        list.stream().map(copil -> new CopilDto(copil.getNume(), copil.getVarsta())).collect(Collectors.toList());
        

    }
    
    
    


    class Copil{
        private String nume;
        private int varsta;

        public int getVarsta() {
            return varsta;
        }

        public String getNume() {
            return nume;
        }
    }
}

class CopilDto{
    private String nume;
    private int varsta;

    public CopilDto(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }
}

