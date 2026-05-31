import sun.util.locale.StringTokenIterator;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;

interface USB{
    void connect();
    //void disconnect();
    String getName();
}//USB = 规范（所有设备必须遵守）-->不管是鼠标还是键盘，都必须能“连接”
class Mouse implements USB{
    @Override//检查-->@Override = 防Bug神器
    public void connect(){
        System.out.println("Mouse is connected");
    }
    @Override
    public String getName(){
        return "鼠标";
    }
}
class Keyboard implements USB{
    @Override
    public void connect(){
        System.out.println("Keyboard is connected");
    }
    @Override
    public String getName(){
        return "键盘";
    }
}
class UDisk implements USB{
    @Override
    public void connect(){
        System.out.println("UDisk is connected");
    }
    @Override
    public String getName(){
        return "U盘";
    }
}

class Computer{
//    public void useDevice(USB device){
//        //使用的是USB可以拓展到Mouse、keyboard
//        device.connect();
//    }
    private ArrayList<USB> devices = new ArrayList<>();
    //ArrayList<USB>:创建列表->放置Mouse等(因为他们都是USB（列表中元素的类型）；devices为列表的名称)
//    ArrayList的本质：索引-->对象
    public void addDevice(USB device){
        devices.add(device);//添加设备
    }
    public void useAllDevice(){
        for(USB device:devices){
            //将devices列表中的USB类型的device元素依次取出并运行下列代码
            device.connect();
        }
    }
    public void showDevice(){
        //方法1：
  //      int i=0;
//        for(USB device:devices){
//
//            i++;
//            System.out.println(i+"设备为"+device.getName());
//        }
        //方法2：
        for(int i=0;i<devices.size();i++){//i<devices列表的元素个数
            System.out.println(i+"-"+devices.get(i).getName());
            //list.get(i)-->ArrayList 是“下标结构”
            //得到列表中的元素并运行该“struck"类型（类似与C语言的）的方法
        }//ArrayList的本质：索引--->对象
    }

}
class Computer2{
    //HashMap的本质：key->Value(直接通过名字来找到设备，类似与python中的字典)
    private HashMap<String,USB> devices =new HashMap<>();
    //创建“字典”，一个key（String）,对应一个value(USB,"struck"类型)
    public void addDevice(String name,USB device){
        devices.put(name,device);//给这个“字典”组合输入值
        System.out.println(name+"添加成功");
    }
    public void useDevice(String name){
        USB device=devices.get(name);
        //根据key（name），拿出对应的device，并放入新的对象中
        if(device!=null){//如果有对应的值
            device.connect();
        }else {
            System.out.println("设备不存在");
        }
    }
    public void removeDevice(String name){
        if(devices.containsKey(name)){//先判断key是否存在
            devices.remove(name);//会删除key对应的数据
            System.out.println("设备已经删除");
        }else {
            System.out.println("设备不存在");
        }


    }
    public void showDevices(){
        for (String key:devices.keySet()){
            //key.Set() 为所有key的集合
            //即：遍历所有的key
            //将devices中的key赋给新命名的key
           USB device=devices.get(key);
           //根据key获取value
           System.out.println(key+"->"+device.getName());
        }
    }
    public void addDeice(String name,USB device){
        if(devices.containsKey(name)){
            System.out.println("设备已经存在");
        }else{
            devices.put(name,device);
            System.out.println("设备添加成功");
        }
    }
    public void useDevice2(String name){
        try{
            USB device=devices.get(name);//获取对象，可能不存在-->NULL
            if(device==null){
                throw new Exception("设备不存在");
            }
            device.connect();
        }catch (Exception e){//出错时的处理
            System.out.println("操作失败："+e.getMessage());
            //e.getMessage()-->Exception中的内容
        }
//        finally {
//
//        }//可选，总会执行的代码
    }
    public void saveDevicesToFile(String filename){
        try(BufferedWriter bw=new BufferedWriter(new FileWriter(filename))){
            //用于打开文件并写入，文件不存在会自动创建
            for(String name:devices.keySet()){
                bw.write(name+"，"+devices.get(name).getName());
                bw.newLine();//换行
            }
            System.out.println("设备保存成功");
        }//try(){}-->自动关闭资源
        catch (Exception e){//异常处理，不让程序崩溃
            System.out.println("保存失败："+e.getMessage());
        }
    }
    public void loadDevicesFromFile(String filename){
        try (BufferedReader br=new BufferedReader(new FileReader(filename)))
//            它会在 try 代码块执行结束时，自动调用资源对象的 close() 方法
        {
            String line;
            while ((line=br.readLine())!=null){
                String[] parts=line.split("，");//分隔key和设备类型
                String key=parts[0];
                String deviceName=parts[1];
                USB device;
                //如下：根据设备的类型创建对象
                if(deviceName.equals("鼠标")){
                    device=new Mouse();
                }else if (deviceName.equals("键盘")){
                    device=new Keyboard();
                }else if (deviceName.equals("U盘")){
                    device=new UDisk();
                }else {
                    continue;//跳过本次循环，直接进入下一次循环
                    //如果设备不是“鼠标”也不是“键盘”，不处理
                    //直接跳到下一行，继续读取下一条数据
                }
                devices.put(key,device);
            }
            System.out.println("设备加载成功");
        }catch (Exception e){//如果try报错，则执行如下的代码
            System.out.println("加载失败："+e.getMessage());
        }
    }

}
public class study14 {
    public static void main(String[] args) {
        Computer c=new Computer();
        USB m= new Mouse();
        USB k=new Keyboard();
        USB u=new UDisk();
//        c.useDevice(m);
//        c.useDevice(k);
//        c.useDevice(u);
        c.addDevice(new Mouse());
        c.addDevice(new Keyboard());
        c.addDevice(u);
        c.useAllDevice();//管理对象集合
        c.showDevice();

        Computer2 t=new Computer2();
        t.addDevice("鼠标",new Mouse());
        t.addDevice("键盘",new Keyboard());
        t.useDevice("鼠标");
        t.useDevice2("nih");
        t.showDevices();
        t.saveDevicesToFile("设备名字");
        t.loadDevicesFromFile("设备名字");
        //t.showDevices(); 加载之后在展示，就可以不用重新输入了，和python的类似

    }
}
//| 类型        | 本质结构            | 用法举例                           |
//| --------- | --------------- | ------------------------------ |
//| 数组String[] s1 | 固定长度的连续空间       | `String[] parts`               |
//| ArrayList | 可变长度的动态数组       | `ArrayList<USB> list`          |
//| HashMap   | key → value 映射表 | `HashMap<String, USB> devices` |
//|String   |列表，具有不可变性



//考试范围：输入输出文件和代码之间13章（13.1、13.2、13.3+课后习题第4题）、输入输出（scanner）、构造函数（类、对象、重写tostring（）方法）、图形界面(p296-15.9.2添加包)、多线程18章（p407）、数据库17章