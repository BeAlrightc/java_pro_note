import com.liuChengChuan.pojo.IdCard;
import com.liuChengChuan.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class IdCardTest {
    @Test
    public void findById(){
        SqlSession session = MyBatisUtils.getSession();
        IdCard c = session.selectOne("findCodeById",1);
        System.out.println(c);
        session.close();
    }
}
