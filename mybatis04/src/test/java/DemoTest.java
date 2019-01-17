import com.itheima.dao.IAccountDao;
import com.itheima.domain.Account;
import com.itheima.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @Description: java类作用描述
 * @Author: wangch
 * @CreateDate: 2018/12/28 0:42
 * @Version: 1.0
 */
public class DemoTest {
    InputStream  in=null;
    SqlSession sqlSession=null;
    IAccountDao dao=null;

    @Before
    public void init() throws Exception {
         in=Resources.getResourceAsStream("sqlMapperConfig.xml");
        SqlSessionFactory   factory=new SqlSessionFactoryBuilder().build(in);
         sqlSession = factory.openSession();
         dao = sqlSession.getMapper(IAccountDao.class);
    }
    @After
    public void destory() throws IOException {
           sqlSession.commit();
           in.close();
           sqlSession.close();
    }

    /**
     * 查询账户的信息
     */
       @Test
     public void testFindAll(){
         List<Account> accounts = dao.findAll();
         for (Account account : accounts) {
             System.out.println(account);
         }
     }

}
