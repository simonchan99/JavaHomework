import java.util.LinkedList;

public class MyLinkedList {
    LinkedList list = new LinkedList();

    public void put(Object obj){
        list.add(obj);
    }

    public Object get(){
        Object o = list.get(0);
        System.out.println("取出"+list.get(0));
        list.remove(0);
        return o;
    }
    public void printList(){
        System.out.println("列表中有：");
        for (int index = 0; index<list.size();index++){
            System.out.println(list.get(index));
        }
    }
    public boolean isEmpty(){
        if(list.isEmpty()){
            System.out.println("列表为空");
            return true;
        } else {
            System.out.println("列表非空");
            return false;
        }
    }
}
