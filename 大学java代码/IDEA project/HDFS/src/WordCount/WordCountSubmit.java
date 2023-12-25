package WordCount;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

import java.io.IOException;


//提交给yarn
public class WordCountSubmit {
    public static void main(String[] args) throws IOException, InterruptedException, ClassNotFoundException, IOException {

        Configuration conf = new Configuration();
        conf.set("fs.defaultFS","file:///");
        conf.set("mapreduce.framework.name","local");


        Job job = Job.getInstance();
        //设置Submit Mapper Reduce 的class类型
        job.setJarByClass(WordCountSubmit.class);




        job.setMapperClass(WordCountMapper.class);

        job.setReducerClass(WordCountReduce.class);
       //设置 Mapper方法和Reduce方法的Key和value的数据类型
        job.setMapOutputKeyClass(Text.class);
        job.setMapOutputValueClass(IntWritable.class);

        //设置reduce方法的key 和value的数据类型
        job.setOutputKeyClass(Text.class);
        job.setOutputValueClass(IntWritable.class);
        //设置文件路径
        FileInputFormat.setInputPaths(job,new Path("D:\\myfile\\大数据实训\\day03\\day3\\a.txt"));
       // FileInputFormat.setInputPaths(job,new Path("/a"));
        //输出路径
        FileOutputFormat.setOutputPath(job,new Path("D:\\myfile\\hadoop\\word\\"));
        //执行
        boolean res = job.waitForCompletion(true);
        //0代表成功，-1表示失败
       System.exit(res?0:-1);

    }
}
