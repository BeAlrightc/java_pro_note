import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;
//第一个参数位文本偏移量，第二个参数为单词map阶段的(k1,v1)
public class ReMapper extends Mapper<LongWritable,Text, Text, NullWritable> {
    private static  Text line=new Text();
//重写map方法
    @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        line=value;
        context.write(line,NullWritable.get());
    }
}
