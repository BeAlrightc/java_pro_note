import com.liuChengChuan.pojo.Book;
import com.liuChengChuan.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;



public class TestHuan {
    @Test
    public void findBookById(){
        SqlSession session = MyBatisUtils.getSession();
        Book book1 = session.selectOne("findBookById",1);
        System.out.println(book1.toString());

        Book book2 = session.selectOne("findBookById",1);
        System.out.println(book2.toString());
        session.close();
    }
    @Test
    public void findBookById2(){
        SqlSession session = MyBatisUtils.getSession();
        Book book1 = session.selectOne("findBookById",1);
        System.out.println(book1.toString());
        Book book2 = new Book();
        book2.setId(3);
        book2.setBookName("MySQL数据库入门");
        book2.setPrice(40.0);
        session.update("updateBook",book2);
        session.commit();
        Book book3 =session.selectOne("findBookById",1);
        System.out.println(book3.toString());
        session.close();
    }
    @Test
    public void findBookById3(){
        SqlSession session = MyBatisUtils.getSession();
        SqlSession session2 = MyBatisUtils.getSession();
        Book book1 = session.selectOne("findBookById",1);
        System.out.println(book1.toString());
        session.close();//session关闭之后，才能开启二级缓存

        Book book2 = session2.selectOne("findBookById",1);
        System.out.println(book2.toString());
        session2.close();
    }

    @Test
    public void findBookById4(){
        SqlSession session = MyBatisUtils.getSession();
        SqlSession session2 = MyBatisUtils.getSession();
        SqlSession session3= MyBatisUtils.getSession();
        Book book1 = session.selectOne("findBookById",1);
        System.out.println(book1.toString());
        session.close();
        Book book2 = new Book();
        book2.setId(2);
        book2.setBookName("MyL数据库入门");
        book2.setPrice(45.0);
        session2.update("updateBook",book2);
        session2.commit();
        session2.close();
        Book book3 =session3.selectOne("findBookById",1);
        System.out.println(book3.toString());
        session3.close();
    }
}
