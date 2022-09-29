package n1;

import java.util.LinkedList;

public class HelloJavamitForEach {
    private LinkedList<String> list;

    public HelloJavamitForEach(LinkedList<String> list) {
        list = new LinkedList<>();
        list.add("simon");
        list.add("raphe");
    }

    public void Ausgabe(){
        list.forEach(System.out :: print);
    }
}
