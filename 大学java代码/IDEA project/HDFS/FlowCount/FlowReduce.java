import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;

public class FlowReduce extends Reducer<Text,FlowBean, Text,FlowBean> {
    @Override
    protected void reduce(Text key, Iterable<FlowBean> values, Context context) throws IOException, InterruptedException {
        Long totalUpload =0L;
        Long totalDownload =0L;

        for (FlowBean value : values) {
          totalUpload += value.getUpload();
          totalDownload += value.getDownload();
        }

        FlowBean bean = new FlowBean(totalUpload, totalDownload);
        context.write(key,bean);

    }
}
