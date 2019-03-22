import java.io.*;

public class PartOutTest {
    public static void main(String[] args) throws IOException {
        File file=new File("C:"+File.separator+"Users"+File.separator+"白乐荣"+
                                File.separator+"Desktop"+File.separator+"Tset.txt");
        if(file.exists()){
            InputStream inputStream=new FileInputStream(file);
            byte[] data=new byte[1024];
            int len=inputStream.read(data);
            String result=new String(data,0,len);
            System.out.println("读取内容【"+result+"】");
            inputStream.close();
        }
    }
}
