import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.*;
import org.junit.Test;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class HDFSClient {

/*
上传文件
 */
    @Test
    public void upload() throws IOException {

        Configuration conf = new Configuration();
        conf.set("fs.defaultFS","hdfs://192.168.200.10:9000");
        System.setProperty("HADOOP_USER_NAME","root");
        FileSystem fs = FileSystem.get(conf);
        fs.copyFromLocalFile(new Path("D:\\myfile\\格言警句sss.txt"),new Path("/a"));
        fs.close();

    }
    /*
    下载文件
     */
    @Test
    public void downloadFile() throws IOException {

        Configuration conf = new Configuration();

        conf.set("fs.defaultFS","hdfs://192.168.200.10:9000");

        System.setProperty("HADOOP_USER_NAME","root");

        FileSystem fs = FileSystem.get(conf);
        fs.copyToLocalFile(new Path("/file.txt"),new Path("D:\\myfile\\fiess"));
        fs.close();
    }

    /**
     * 创建文件夹
     */
    @Test
    public void mkDir() throws Exception {

        Configuration conf = new Configuration();
        FileSystem fs = FileSystem.get(new URI("hdfs://192.168.200.10:9000"), conf, "root");
        fs.mkdirs(new Path("/a/b/c"));
        fs.close();
    }

    /**
     * 删除文件和文件夹
     */
    @Test
    public void rmDir() throws Exception {

        Configuration conf = new Configuration();
        FileSystem fs = FileSystem.get(new URI("hdfs://192.168.200.10:9000"), conf, "root");
        fs.delete(new Path("/cc.txt"),true);
        fs.close();
    }

    /**
     * 修改文件或文件夹名称（移动）
     */
    @Test
    public void renameFile() throws Exception {

        Configuration conf = new Configuration();
        FileSystem fs = FileSystem.get(new URI("hdfs://192.168.200.10:9000"), conf, "root");
        fs.rename(new Path("/格言警句.txt"),new Path("/名人名言.txt"));
        fs.close();
    }

    /**
     * 文件写数据
     */
    @Test
    public void writeContent() throws Exception {
        Configuration conf = new Configuration();
        FileSystem fs = FileSystem.get(new URI("hdfs://192.168.200.10:9000"), conf, "root");
        FSDataOutputStream fsDataOutputStream = fs.create(new Path("/ss.txt"));

        String content = "I am a really master of linux and nobady better than me.";

        fsDataOutputStream.write(content.getBytes());
        fsDataOutputStream.flush();
        fsDataOutputStream.close();
        fs.close();

    }

    /**
     * 复制文件
     */
    @Test
    public void copyFile() throws Exception {

        Configuration conf = new Configuration();
        FileSystem fs = FileSystem.get(new URI("hdfs://192.168.200.10:9000"), conf, "root");
        FSDataInputStream open = fs.open(new Path("/ss.txt"));
        FSDataOutputStream create = fs.create(new Path("/s2.txt"));

        byte[] bytes = new byte[1024];
        int read = 0 ;
        while ((read = open.read(bytes)) != -1){
            create.write(bytes,0,read);
        }
        create.close();
        open.close();
        fs.close();
    }

    /**
     * 文件追加数据
     */
    @Test
    public void appendContent() throws Exception {
        Configuration conf = new Configuration();
        FileSystem fs = FileSystem.get(new URI("hdfs://192.168.200.10:9000"), conf, "root");
        String content = "\n20yunjisuan classmates of liu chengchuan\n";
        FSDataOutputStream append = fs.append(new Path("/file.txt"));
        append.write(content.getBytes());
        append.flush();
        append.close();
        fs.close();
    }

public FileSystem getFS() throws URISyntaxException, IOException, InterruptedException {
    Configuration conf = new Configuration();
    FileSystem fs = FileSystem.get(new URI("hdfs://192.168.200.10:9000"), conf, "root");
    return fs;
}

    /**
     * 查看目录下的文件列表
     */
@Test
    public void testCheckFile() throws IOException, URISyntaxException, InterruptedException {

        RemoteIterator<LocatedFileStatus> iterator = getFS().listFiles(new Path("/"), true);
        while (iterator.hasNext()){
            LocatedFileStatus fileStatus = iterator.next();
            System.out.println("文件的名称是："+fileStatus.getPath().getName());
            System.out.println("文件块的大小是："+fileStatus.getBlockSize());
            System.out.println("文件权限是："+fileStatus.getPermission());
            System.out.println("文件最后访问时间是："+fileStatus.getAccessTime());
            BlockLocation[] blockLocations = fileStatus.getBlockLocations();
            for (BlockLocation location : blockLocations) {
                System.out.println("block-length:"+location.getLength());
                System.out.println("block-offset:"+location.getOffset());
                String[] hosts = location.getHosts();
                for (String host : hosts) {
                    System.out.println(host);
                }
            }
            System.out.println("-----------------分割线-----------------");
        }


    }









//查看文件
    @Test
    public void CatFile() throws IOException, URISyntaxException, InterruptedException {
        FileSystem fs = getFS();
        FSDataInputStream inputStream=fs.open(new Path("/yunjisuan/file/flume/xiandian-sec.1663304637894.log"));
        int read =inputStream.read();
        while(read !=-1){
            System.out.print((char)read);
            read=inputStream.read();
        }
        System.out.println();
        fs.close();

    }

    @Test
    public void CleanFile() throws IOException, URISyntaxException, InterruptedException {
        FileSystem fs = getFS();
        FSDataInputStream inputStream=fs.open(new Path("/yunjisuan/file/flume/xiandian-sec.1663304637894.log"));
        int read =inputStream.read();
        while(read !=-1){
            System.out.print((char)read);
            read=inputStream.read();
        }
        System.out.println();
        fs.close();

    }

}
