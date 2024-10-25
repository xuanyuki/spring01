import com.xianyu.mapper.EmployeeMapper;
import com.xianyu.pojo.Employee;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Testclass {
  private SqlSession sqlSession;

  @BeforeEach
  public void init() throws IOException {
    sqlSession = new SqlSessionFactoryBuilder().build(
            Resources.getResourceAsStream("mybatis-config.xml")).openSession(true);

  }

  @Test
  public void test01() {
    EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
    List<Employee> query = mapper.query("张三", null);
    System.out.println(query);
  }

  @Test
  public void test02() {
    EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
    int em = mapper.updateById(new Employee(1, "张三", 999.0));
    System.out.println(em);
  }

  @Test
  public void test03() {
    EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
    List<Employee> employees = mapper.queryChoose(null, 199.5);
    System.out.println(employees);
  }

  @Test
  public void test04() {
    EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
    List<Employee> employees = mapper.queryBatch(Arrays.asList(1, 2, 3));
    System.out.println(employees);
  }

  @Test
  public void test05() {
    EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
    int rows = mapper.deleteBatch(Arrays.asList(1, 2));
    System.out.println(rows);
  }

  @Test
  public void test06() {
    EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
    List<Employee> employees = new ArrayList<Employee>();
    employees.add(new Employee(null, "张三", 1025.0));
    employees.add(new Employee(null, "李四", 1854.0));
    employees.add(new Employee(null, "王五", 1324.0));
    int rows = mapper.insertBatch(employees);
    System.out.println(rows);
  }


  @Test
  public void test07() {
    EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
    List<Employee> employees = new ArrayList<Employee>();
    employees.add(new Employee(5, "张三", 888.0));
    employees.add(new Employee(6, "李四", 888.3));
    employees.add(new Employee(4, "王五", 888.78));
    int rows = mapper.updateBatch(employees);
    System.out.println(rows);
  }


  @AfterEach
  public void clean() {
    sqlSession.close();
  }
}
