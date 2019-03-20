import java.io.File;

public class listFileTest {
    public static void main(String[] args) {
        new Thread(()->{
            File file=new File("C:\\Users\\白乐荣\\Desktop");
            listAllFiles(file);//从此处开始递归
        },"输出线程").start();
        System.out.println("开始进行文件输出。。。");
    }
//列出指定目录中的全部子目录信息
    private static void listAllFiles(File file) {
        if(file.isDirectory()) {//判定现在给定的file属于目录对象
            File[] result = file.listFiles();
            if (result != null) {
                for (File file2 : result) {
                    listAllFiles(file2);
                }
            }
        }else{
                System.out.println(file);
            }
        //上面的if判断完成为文件的路径
        //else为输出文件名
        }
    }

