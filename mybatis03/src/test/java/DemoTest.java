import com.itheima.dao.AccountDao;
import com.itheima.dao.IUserDao;
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

/**
 * @Description: java类作用描述
 * @Author: wangch
 * @CreateDate: 2018/12/28 0:42
 * @Version: 1.0
 */
public class DemoTest {
    InputStream  in=null;
    SqlSession sqlSession=null;

    IUserDao  dao=null;
    @Before
    public void init() throws Exception {
         in=Resources.getResourceAsStream("sqlMapperConfig.xml");
        SqlSessionFactory   factory=new SqlSessionFactoryBuilder().build(in);
         sqlSession = factory.openSession();
         dao = sqlSession.getMapper(IUserDao.class);
    }
    @After
    public void destory() throws IOException {
           sqlSession.commit();
           in.close();
           sqlSession.close();
    }

    /**
     * 更改用户信息
     */
    @Test
    public void testFindAll(){
        User user=new User();
         user.setId(48);
         user.setAddress("海南");
         user.setUsername("辉少");
       //  user.setBirthday(new Date());
         user.setSex("男");
         dao.update(user);

    }

}
