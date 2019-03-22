import java.io.*;

/*
*
* 这是一个专门负责文件拷贝处理的类，该类具备有如下功能
* 1、判断拷贝的源文件是否存在
* 2、判断目标文件的父路径是否存在，如果不存在则创建父目录
* 3进行文件拷贝处理
* */
class FileCopyutil{
    //此时这个工具类不需要任何属性，
    // 建议将构造方法私有化，
    // 并且文件操作均为类方法
    private FileCopyutil(){
        //构造方法私有化
    }
    public static boolean fileIsExists(String path){
        return new File(path).exists();
    }
    public static void createParentsDir(String path){
        File file=new File(path);
        if(!file.getParentFile().exists()){
            file.getParentFile().mkdirs();
        }
    }
    public static boolean fileCopy(String sourcepath,String desPath){
        File inFile=new File(sourcepath);
        File outFile=new File(desPath);
        FileInputStream fileInputStream=null;
        FileOutputStream fileOutputStream=null;
        try {
            fileInputStream=new FileInputStream(inFile);
            fileOutputStream=new FileOutputStream(outFile);
            copyFileHandle(fileInputStream,fileOutputStream);
        }  catch (IOException e) {
            e.printStackTrace();
        } finally{
            try {
                fileInputStream.close();
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return true;
    }
    private static void copyFileHandle(InputStream inputStream,OutputStream outputStream) throws IOException {
        long start=System.currentTimeMillis();
        //InputStream有读取单个字节的方法
        //OutputStream有输出单个字节的方法
        byte[] data=new byte[1024];
        //开辟缓冲区一次性读入多个内容
        int len=0;
        //表示将数据读取到字节数组之中，而后返回读取个数
        while((len = inputStream.read(data))!=-1){
        outputStream.write(data,0,len);
        }
        long end=System.currentTimeMillis();
        System.out.println("拷贝文件所花费的时间："+(end-start));
    }
}
public class FileCopy {
    public static void main(String[] args) {
        if(args.length!=2){//现在参数不是两个
            System.out.println("非法操作");
            return;
        }
        String sourcePath=args[0];
        String destPath=args[1];
        if(FileCopyutil.fileIsExists(sourcePath)){
            FileCopyutil.createParentsDir(sourcePath);//创建目录
            System.out.println(FileCopyutil.fileCopy(sourcePath,destPath));
        }else{
            System.out.println("源文件不存在，无法进行拷贝");
        }
    }
}
