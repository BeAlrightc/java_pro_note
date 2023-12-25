import com.kuang.dao.BlogMapper;
import com.kuang.pojo.Blog;
import com.kuang.pojo.Student;
import com.kuang.utils.IDutils;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.cache.Cache;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.*;

public class MyTest {
    @Test
    public void addInitBlog() {
        SqlSession session = MybatisUtils.getSqlSession();
        BlogMapper mapper = session.getMapper(BlogMapper.class);
        Blog blog = new Blog();
        blog.setId(IDutils.getId());
        blog.setTitle("mybatis如此简单");
        blog.setAuthor("java狂神说");
        blog.setCreate_time(new Date());
        blog.setViews(999);
        mapper.addBlog(blog);
        blog.setId(IDutils.getId());
        blog.setTitle("spring如此简单");
        mapper.addBlog(blog);
        blog.setId(IDutils.getId());
        blog.setTitle("微服务如此简单");
        mapper.addBlog(blog);
        blog.setId(IDutils.getId());
        blog.setTitle("java如此简单");
        mapper.addBlog(blog);
        session.close();
    }
    @Test
    public void queryBlogIF(){
        SqlSession sqlSession= MybatisUtils.getSqlSession();
       BlogMapper mapper= sqlSession.getMapper(BlogMapper.class);
       HashMap hashMap =new HashMap();
       hashMap.put("title","java如此简单");
        hashMap.put("author","java狂神说");
       List<Blog> blogs = mapper.queryBlogIF(hashMap);
        for (Blog blog: blogs) {
            System.out.println(blog);
        }
        sqlSession.close();
    }
    @Test
    public void que(){
        SqlSession session = MybatisUtils.getSqlSession();
        BlogMapper mapper = session.getMapper(BlogMapper.class);
        HashMap hashMap = new HashMap();
        //hashMap.put("title","java如此简单");
       // hashMap.put("author","java狂神说");
        List<Blog> blogs = mapper.queryBlogChoose(hashMap);
        for (Blog blog: blogs) {
            System.out.println(blog);
        }
        session.close();
    }

    @Test
    public void updatelist(){
        SqlSession session = MybatisUtils.getSqlSession();
        BlogMapper mapper = session.getMapper(BlogMapper.class);
        HashMap map = new HashMap();
       map.put("title","javascript如此简单25");
         map.put("author","狂神说");
        map.put("id","1");
        mapper.updateBlog(map);
        session.close();
    }
    @Test
    public void queryBlogForEach(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper=sqlSession.getMapper(BlogMapper.class);

        HashMap map=new HashMap();
      ArrayList<Integer> ids=  new ArrayList<Integer>();
      ids.add(1);
      ids.add(2);
      ids.add(3);
      map.put("ids",ids);
       List<Blog> blo = mapper.queryForeach(map);
        for (Blog blog:blo) {
            System.out.println(blog);
        }
        sqlSession.close();
    }

}
