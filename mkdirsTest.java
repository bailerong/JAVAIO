import java.io.File;
import java.io.IOException;

public class mkdirsTest {
    public static void main(String[] args) {
        File file=new File("C:"+File.separator+"Users"+File.separator+"白乐荣"+File.separator+
                "Desktop"+File.separator+"lele"+File.separator+"www"+File.separator+"Test.txt");
        if(!file.getParentFile().exists()){//创建父路径
            //有多少级父目录就创建多少级
            file.getParentFile().mkdirs();
        }
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
