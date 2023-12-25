package WordCount;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class WordCountMapper extends Mapper<LongWritable, Text,Text, IntWritable>  {
  //重写map方法
   @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
    //获取行并转化为字符串
     String line=  value.toString();
     //对文件进行切割
       String[] words = line.split(" ");
       //对words进行遍历写入
       for(String word : words){
           context.write(new Text(word),new IntWritable(1));
       }

   }
}
