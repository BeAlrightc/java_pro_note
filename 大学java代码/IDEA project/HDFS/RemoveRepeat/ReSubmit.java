import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;

import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

public class ReSubmit {
    public static void main(String[] args) throws Exception{
        Configuration conf = new Configuration();
        Job job =Job.getInstance(conf);
        job.setJarByClass(ReSubmit.class);
        job.setMapperClass(ReMapper.class);
        job.setReducerClass(ReReduce.class);

        //设置输出类型
        job.setOutputKeyClass(Text.class);
        job.setOutputValueClass(NullWritable.class);
        //设置输入目录和输出目录
        FileInputFormat.addInputPath(job,new Path("D:\\myfile\\hadoop\\RemoveRepeat\\files\\number.txt"));
        FileOutputFormat.setOutputPath(job,new Path("D:\\myfile\\hadoop\\RemoveRepeat\\outputfiles"));

        System.exit(job.waitForCompletion(true) ? 0 : 1);

    }
}
