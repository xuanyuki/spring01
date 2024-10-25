import com.xianyu.mapper.EmployeeMapper;
import com.xianyu.pojo.Employee;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;

public class Test01 {
  @Test
  public void test() throws IOException {
    InputStream ips = Resources.getResourceAsStream("mybaits-config.xml");
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(ips);
    SqlSession sqlSession = sqlSessionFactory.openSession();
    EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
    Employee employee = mapper.queryById(1);
    System.out.println(employee);
    sqlSession.commit();
    sqlSession.close();
  }
}
