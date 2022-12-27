import java.util.Iterator;
import java.util.LinkedList;

class collection_program1{
    public static void main(String[] args){
        LinkedList<String> a1 = new LinkedList<>();

        a1.add("Anurag");
        a1.add("pandit");
        a1.add("manjot");
        a1.add("aman");
        a1.add("sid");
        a1.remove(2);
        Iterator<String> itr = a1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}