import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;
import java.util.Comparator;
import java.util.TreeMap;

public class TenReduce extends Reducer <NullWritable, IntWritable,NullWritable,IntWritable>{
    private TreeMap<Integer,String> treeMap=new TreeMap<>(new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2-o1;
        }
    });

    @Override
    protected void reduce(NullWritable key, Iterable<IntWritable> values, Context context) throws IOException, InterruptedException {
        for(IntWritable num : values){
            treeMap.put(num.get(),"");
            if(treeMap.size()>10){
                treeMap.remove(treeMap.firstKey());
            }
        }

        for(Integer i:treeMap.keySet()){
            context.write(NullWritable.get(),new IntWritable(i));
        }
    }
}
