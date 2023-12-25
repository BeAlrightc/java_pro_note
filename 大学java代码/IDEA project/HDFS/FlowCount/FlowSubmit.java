import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

import java.io.IOException;

public class FlowSubmit {
    public static void main(String[] args) throws Exception {
        Configuration conf = new Configuration();
        conf.set("fs.defaultFS","file:///");
        conf.set("mapreduce.framework","local");

        Job job = Job.getInstance();
        job.setJarByClass(FlowSubmit.class);
        job.setMapperClass(FlowMapper.class);
        job.setReducerClass(FlowReduce.class);

        job.setMapOutputKeyClass(Text.class);
        job.setMapOutputValueClass(FlowBean.class);

        job.setOutputKeyClass(Text.class);
        job.setOutputValueClass(FlowBean.class);

        FileInputFormat.setInputPaths(job,new Path("D:\\myfile\\大数据实训\\day03\\day3\\流量统计案例\\flow.log"));
        FileOutputFormat.setOutputPath(job,new Path("D:\\myfile\\大数据实训\\day03\\day3\\流量统计案例\\ress"));

        boolean res = job.waitForCompletion(true);

        System.exit(res ? 0 : -1);
    }
}
