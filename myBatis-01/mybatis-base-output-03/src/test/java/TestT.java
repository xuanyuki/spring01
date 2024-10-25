import com.xianyu.mapper.EmployeeMapper;
import com.xianyu.mapper.TeacherMapper;
import com.xianyu.pojo.Employee;
import com.xianyu.pojo.Teacher;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

public class TestT {
  // 获取自增主键
  @Test
  public void test01() throws IOException {
    InputStream ips = Resources.getResourceAsStream("mybaits-config.xml");
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(ips);
    // 开启自动commit
    SqlSession sqlSession = sqlSessionFactory.openSession(true);
    EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
    Employee employee = new Employee();
    employee.setEmpName("李四");
    employee.setEmpSalary(199.5);
    // 插入之前无主键
    System.out.println("插入前id：" + employee.getEmpId());
    int rows = mapper.insertEmp(employee);
    System.out.println("插入后id：" + employee.getEmpId());
    System.out.println(rows);
    // sqlSession.commit();
    sqlSession.close();
  }

  // 手动维护主键
  @Test
  public void test02() throws IOException {
    InputStream ips = Resources.getResourceAsStream("mybaits-config.xml");
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(ips);
    // 开启自动commit
    SqlSession sqlSession = sqlSessionFactory.openSession(true);
    TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
    Teacher teacher = new Teacher();
    teacher.settName("张五");
    teacher.settId(UUID.randomUUID().toString().replaceAll("-", ""));
    mapper.insertTeacher(teacher);
    System.out.println();
    sqlSession.close();
  }

  // mybatis维护主键
  @Test
  public void test03() throws IOException {
    InputStream ips = Resources.getResourceAsStream("mybaits-config.xml");
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(ips);
    // 开启自动commit
    SqlSession sqlSession = sqlSessionFactory.openSession(true);
    TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
    Teacher teacher = new Teacher();
    System.out.println("插入前id：" + teacher.gettId());
    teacher.settName("王六");
    mapper.insertTeacher(teacher);
    System.out.println("插入后id：" + teacher.gettId());
    System.out.println();
    sqlSession.close();
  }
}
