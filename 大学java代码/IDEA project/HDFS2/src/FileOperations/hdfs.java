package FileOperations;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.junit.Test;

import java.io.IOException;

public class hdfs {
    @Test
    public void upload() throws IOException {
        Configuration conf = new Configuration();
        conf.set("fs.defaultFS","hdfs://192.168.200.10:9000");
        System.setProperty("HADOOP_USER_NAME","root");
       FileSystem fs =FileSystem.get(conf);
       fs.copyFromLocalFile(new Path("D:\\myfile\\hadoop\\mirros\\CentOS-7-x86_64-DVD-1908.iso"),new Path("/"));
       fs.close();

    }


}
