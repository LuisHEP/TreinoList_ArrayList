import java.util.ArrayList;
import java.util.List;

public class List_ArrayList {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Lucas");
        names.add("André");
        names.add("Maria");
        names.add("Mariana");
        names.add("Leon");

//        Imprimindo nome da lista do ArrayList
        for(int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
        System.out.println();

//        Imprimindo o índice de um elemento na lista de ArrayList
        System.out.println(names.indexOf("Mariana"));

//        Imprimindo a informação se uma lista ArrayList está vazia
        System.out.println(names.isEmpty());

//        Imprimindo se uma lista ArrayList contém um elemento
        System.out.println(names.contains("Leon"));

//        Limpando uma lista de um ArrayList e checando se está vazia
        names.clear();
        System.out.println(names.isEmpty());
    }
}
