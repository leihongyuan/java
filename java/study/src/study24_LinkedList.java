import java.util.LinkedList;

public class study24_LinkedList {
    //节点链-->每个元素有自己的数值+下一个元素的位置
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");


        //头、尾部添加
        list.addFirst("START");
        list.addLast("END");
        //删除头尾
        list.removeFirst();
        list.removeLast();


        System.out.println(list);
    }

}
//ArrayList的局限：

//🚩 ArrayList 底层：
//动态数组
//😵 问题：
//
//中间插入元素时：
//
//后面所有元素都要移动
//🔍 例如：
//[1][2][3][4]
//
//如果：
//
//开头插入0
//🚨 会变成：
//[0][1][2][3][4]
//😵 所有元素后移。
//
//数据很多时：
//
//性能差

//2.对比：
//| 对比   | ArrayList | LinkedList |
//| ---- | --------- | ---------- |
//| 底层   | 动态数组      | 链表         |
//| 查询   | 快（直接计算地址）         | 慢(一个节点一个节点的走)          |
//| 插入删除 | 慢         | 快          |
//| 内存   | 更省        | 更多         |
//| 适合   | 查询多       | 插入删除多      |