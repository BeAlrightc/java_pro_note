package WordCount;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;

//分组聚合
public class WordCountReduce extends Reducer<Text, IntWritable,Text,IntWritable> {

    @Override
    protected void reduce(Text key, Iterable<IntWritable> values, Context context) throws IOException, InterruptedException {
        //定义累加器
        int sum=0;
        for (IntWritable value : values) {
            sum +=value.get();
        }
        context.write(key,new IntWritable(sum));
    }
}
