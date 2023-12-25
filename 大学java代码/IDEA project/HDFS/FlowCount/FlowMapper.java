import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class FlowMapper extends Mapper<LongWritable, Text,Text,FlowBean> {

    @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        String line =value.toString();
        String[] fileds=line.split("\t",-1);

        String phone =fileds[1];
        String upload =fileds[8];
        String download =fileds[9];

        context.write(new Text(phone),new FlowBean(Long.parseLong(upload),Long.parseLong(download)));
    }
}
