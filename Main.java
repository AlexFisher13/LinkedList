/**
 * Created by Fisher on 25.05.2016.
 */
public class Main {

    public static void main(String[] args) {
        LinkedNote<Integer> list = new LinkedNote<>();
        list.add(111);
        list.add(222);
        list.add(333);
        list.add(444);
        list.add(555);
        list.add(666);
        list.add(777);
        System.out.println(list.get(5));
        list.delete(666);
        list.print();
    }
}
