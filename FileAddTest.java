import java.io.*;

public class FileAddTest {
    public static void main(String[] args) throws IOException {
        File file=new File("C:"+File.separator+"Users"+File.separator+"白乐荣"+
                File.separator+"Desktop"+File.separator+"Tset.txt");
        //如果文件不存在就创建
        if(!file.getParentFile().exists()){//必须保证父目录存在
            file.getParentFile().mkdirs();//创建多级目录
        }
        //OutputStream是一个抽象类，所以需要通过子类进行实例化，此时只能操作File类
        OutputStream outputStream=new FileOutputStream(file,true);
        //要求输出到文件的内容
        String msg="我爱我自己";
        //将内容变为字节数组
        outputStream.write(msg.getBytes());
        //关闭输出
        outputStream.close();

        //
    }
}
