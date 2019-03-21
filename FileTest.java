import java.io.File;
import java.io.IOException;

/*
* 这是我们的File类的理解以及File类的操作代码
* */
public class FileTest {
    public static void main(String[] args) {
        //取得File对象
        File file=new File("C:"+ File.separator+"Users"+
                File.separator+"白乐荣"+ File.separator+"Desktop"+ File.separator+"JavaIO.java");
        System.out.println(file.getParent());
        File parentFile=file.getParentFile();
        //取得父文件对象
        //创建之前要进行判断父目录是否存在，不存在再创建
        if(!parentFile.exists()){
            parentFile.mkdirs();
        }


 }
}