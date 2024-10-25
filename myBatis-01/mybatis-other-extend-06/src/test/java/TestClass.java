import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xianyu.mapper.EmployeeMapper;
import com.xianyu.pojo.Employee;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

public class TestClass {
  private SqlSession sqlSession;

  @BeforeEach
  public void init() throws IOException {
    sqlSession = new SqlSessionFactoryBuilder().build(
            Resources.getResourceAsStream("mybatis-config.xml")).openSession(true);

  }

  @Test
  public void test01() {
    EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
    // 设置分页数据
    PageHelper.startPage(1, 2);
    List<Employee> employees = mapper.queryList();
    // 将数据装入分页对象中
    PageInfo<Employee> pageInfo = new PageInfo<>(employees);
    System.out.println(pageInfo);
  }

  @AfterEach
  public void clean() {
    sqlSession.close();
  }
}
