
//第一题
public class No_1 {
    public static void main(String[] args){
        MyLinkedList mylist = new MyLinkedList();
        mylist.put("apple");
        mylist.put("banana");
        mylist.put("cranberry");

        //打印列表
        mylist.printList();

        mylist.isEmpty();

        //按先进先出顺序，取出列表元素
        mylist.get();
        mylist.get();
        mylist.get();

        //判断是否为空
        mylist.isEmpty();
    }
}
