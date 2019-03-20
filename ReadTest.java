import java.io.*;

/*
* 这是一个将文件内容读取到输入流的程序
* */
public class ReadTest {
    public static void main(String[] args) throws IOException {
        File file=new File("C:"+File.separator+"Users"+File.separator+"白乐荣"+
                File.separator+"Desktop"+File.separator+"Hello.txt");
     //取得文件按后保证文件存在
       if(file.exists()){
           //获取输入流
           Reader in=new FileReader(file);
           char [] data=new char[1024];
           int len=in.read(data);
           //进行数据读取
           String result=new String(data,0,len);
           System.out.println("读取内容【"+result+"】");
           in.close();
       }
    }
}
