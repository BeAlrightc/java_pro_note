import com.liuChengChuan.utils.MyBatisUtils;
import com.xiaoqinyan.pojo.Category;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class CategoryTest {
    @Test
    public void findCategoryTest(){
        SqlSession session = MyBatisUtils.getSession();
        //查找白色家电
        Category category = session.selectOne("com.xiaoqinyan.mapper.CategoryMapper.findCategoryWithProduct",2);
        System.out.println(category);
        session.close();
    }
}
