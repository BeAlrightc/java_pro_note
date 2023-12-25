import com.kuang.dao.UserMapper;
import com.kuang.pojo.User;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MyTesst {
    @Test
    public void queryUserById(){
        SqlSession sqlsession = MybatisUtils.getSqlSession();
        SqlSession sqlsession2 = MybatisUtils.getSqlSession();
       UserMapper mapper =  sqlsession.getMapper(UserMapper.class);
     User user = mapper.queryUserById(1);
        System.out.println(user);
        sqlsession.close();//sqlsession关闭
       // mapper.updateUser(new User(2,"aasa","123456789"));
       // sqlsession.clearCache();//手动清理缓存
        //System.out.println("===================================");
        UserMapper mapper2 =  sqlsession2.getMapper(UserMapper.class);
        User user2 = mapper2.queryUserById(1);
       // System.out.println(user2);
        //System.out.println(user==user);//true
        System.out.println(user2);
        System.out.println(user==user2);

        sqlsession2.close();
    }
}
