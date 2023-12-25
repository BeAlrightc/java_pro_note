package IoStream.study;

import java.io.File;

public class test2 {
    public static void main(String[] args) {
        File file =new File("src\\bean");
        System.out.println(file.getName());
        String [] arr =file.list();
        File[] files =file.listFiles();
        for (File fi:files
             ) {
            System.out.println(fi);
        }
//        for (String as:arr
//             ) {
//            System.out.println(as);
//        }
    }
}
