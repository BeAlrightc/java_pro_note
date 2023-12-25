import com.kuang.pojo.Books;
import com.kuang.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class myTest {
    @Test
    public void test(){
       ApplicationContext context=new ClassPathXmlApplicationContext("applicationcontext.xml");
      BookService bookServiceImpl = (BookService) context.getBean("BookServiceImpl");
      for(Books books : bookServiceImpl.queryAllBook()){
          System.out.println(books);
      }

    }
}
