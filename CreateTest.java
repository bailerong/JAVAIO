import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystem;

/*
* 我们的文件创建程序
* 当我们的文件不存在时我们进行创建
* 当我们的文件存在时，我们进行删除
* */
public class CreateTest {
    public static void main(String[] args) {
        File file=new File("C:"+File.separator+"Users"+File.separator+"白乐荣"
                +File.separator+"Desktop"+ File.separator +"Test.txt");
        if(file.exists()){
            file.delete();
        }else{
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
