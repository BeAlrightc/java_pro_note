import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.junit.Test;

import java.io.IOException;

public class HdfsClient {
    /*
    上传文件
     */
    @Test
    public void upload() throws IOException {
        Configuration conf = new Configuration();
        conf.set("dfs.defaultFS","hdfs://192.168.200.10:9000");
//        System.setProperty("HADOOP_USER_NAME","root");
        FileSystem fs = FileSystem.get(conf);
        fs.copyFromLocalFile(new Path("D:\\myfile\\fiess\\12.txt"),new Path("/"));
        fs.close();
    }
    /*
    下载文件
     */
    @Test
    public void downloadFile() throws IOException {
        Configuration conf = new Configuration();
      //  conf.set("dfs.defaultFS","hdfs://192.168.20.10:9000");
        System.setProperty("HADOOP_USER_NAME","root");
        FileSystem fs = FileSystem.get(conf);
        fs.copyToLocalFile(new Path("/user"),new Path("D:\\myfile\\fiess"));
        fs.close();
    }
}
