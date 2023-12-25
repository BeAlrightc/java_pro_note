import org.apache.hadoop.io.Writable;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.Serializable;

public class FlowBean implements Writable {
    private long upload;
    private long download;
    private long sumload;

    public FlowBean() {
    }

    public FlowBean(long upload, long download) {
        this.upload = upload;
        this.download = download;
        this.sumload = this.upload+this.download;
    }


    public long getUpload() {
        return upload;
    }

    public void setUpload(long upload) {
        this.upload = upload;
    }

    public long getDownload() {
        return download;
    }

    public void setDownload(long download) {
        this.download = download;
    }

    public long getSumload() {
        return sumload;
    }

    public void setSumload(long sumload) {
        this.sumload = sumload;
    }

    @Override
    public String toString() {
        return "FlowBean{" +
                "upload=" + upload +
                ", download=" + download +
                ", sumload=" + sumload +
                '}';
    }

    @Override
    public void write(DataOutput dataOutput) throws IOException {
        dataOutput.writeLong(upload);
        dataOutput.writeLong(download);
    }

    @Override
    public void readFields(DataInput dataInput) throws IOException {
         this.upload = dataInput.readLong();
         this.download = dataInput.readLong();
    }
}
