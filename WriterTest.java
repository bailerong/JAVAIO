import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterTest {
    public static void main(String[] args) throws IOException {
        File file=new File("C:"+File.separator+"Users"+File.separator+"白乐荣"+
                File.separator+"Desktop"+File.separator+"Hello.txt");
       if(!file.getParentFile().exists()){
           file.getParentFile().mkdirs();
       }
       String msg="我爱我家";
        Writer writer=new FileWriter(file);
        writer.write(msg);
        writer.close();
    }
}
