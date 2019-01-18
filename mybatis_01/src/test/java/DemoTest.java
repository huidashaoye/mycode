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
import java.util.ArrayList;
import java.util.Date;
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
    IUserDao dao=null;

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

    @Test
    public void testFind(){
        List<User> list = dao.findAll();
        for (User user : list) {
            System.out.println(list);
        }
    }

    @Test
    public void  update(){
        User  user=new User(48,"wang",new Date(),"男","河南");
        dao.updateUser(user);
    }

    @Test
    public  void testInsert(){
        User  user=new User(null,"wang",new Date(),"男","河南");
        System.out.println("保存之前"+user);
        dao.insert(user);
        System.out.println("保存之后"+user);
    }

    @Test
    public void testFindbyId(){
        List<Integer>  list=new ArrayList<Integer>();
        list.add(43);
        list.add(45);
        list.add(46);
        List<User> users = dao.findbyId(list);
        for (User user : users) {
            System.out.println(user);
        }
    }
}
