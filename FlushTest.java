import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/*
* 字符流的刷新操作*/
public class FlushTest {
    public static void main(String[] args) throws IOException {
        File file=new File("C:"+File.separator+"Users"+File.separator+"白乐荣"+
                File.separator+"Desktop"+File.separator+"Hello.txt");
        if(!file.getParentFile().exists()){
            file.getParentFile().mkdirs();
        }
        String msg="我爱你";
        Writer out=new FileWriter(file);
        out.write(msg);
        out.flush();//表示强制清空缓冲内容，所有内容输出
    }
}
