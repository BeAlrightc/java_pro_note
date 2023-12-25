import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;
import java.util.TreeMap;

public class TenMapper extends Mapper <LongWritable, Text, NullWritable, IntWritable>{
    private TreeMap<Integer,String> treeMap=new TreeMap<>();

    @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
       String[] nums =value.toString().split(" ");

       for(String num:nums){
           treeMap.put(Integer.parseInt(num),"");
           if(treeMap.size() > 10){
               treeMap.remove(treeMap.firstKey());
           }
       }
    }

    @Override
    protected void cleanup(Context context) throws IOException, InterruptedException {
        for(Integer i:treeMap.keySet()){
            context.write(NullWritable.get(),new IntWritable(i));
        }
    }
}
