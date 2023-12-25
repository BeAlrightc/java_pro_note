import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

import java.io.IOException;

public class TenDiver {
    public static void main(String[] args) throws Exception {
        Configuration conf = new Configuration();
        Job job=Job.getInstance(conf);
        job.setJarByClass(TenDiver.class);
        job.setMapperClass(TenMapper.class);
        job.setReducerClass(TenReduce.class);


        job.setOutputKeyClass(NullWritable.class);
        job.setOutputValueClass(IntWritable.class);
        FileInputFormat.setInputPaths(job,new Path("D:\\myfile\\hadoop\\TenOputs\\files\\nums.txt"));
        FileOutputFormat.setOutputPath(job,new Path("D:\\myfile\\hadoop\\TenOputs\\files\\outputfiles"));

        //启动job
       // boolean res =job.waitForCompletion(true);
        System.exit(job.waitForCompletion(true) ? 0 : 1);
    }
}
