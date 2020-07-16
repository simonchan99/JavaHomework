import java.io.*;

public class MainClass {
    public static void main(String[] args){
        //第一题
        File f = new File("/Users/chenshihong/Desktop/Java");
        if (f.isDirectory()) {
            String[] files = f.list();
            if (null != files && files.length > 0) {
                for (String file : files) {
                    System.out.println("------------");
                    System.out.println("文件名：" + file);
                    System.out.println("路径名：" + f.getPath());
                }
            }
        }

        //第二题
        String sourcePath = "/Users/chenshihong/Desktop/Java/copysrc.txt";
        String destinationPath = "/Users/chenshihong/Desktop/Java/copydes.txt";
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(sourcePath);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        OutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream(destinationPath);
        } catch (IOException e) {
            e.printStackTrace();
        }

        int length=0;
        while(true)
        {
            try {
                if (!((length=inputStream.read())!=-1)) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                outputStream.write((char)length);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
