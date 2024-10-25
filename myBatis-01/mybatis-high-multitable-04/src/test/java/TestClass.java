import com.xianyu.mapper.CustomerMapper;
import com.xianyu.mapper.OrderMapper;
import com.xianyu.pojo.Customer;
import com.xianyu.pojo.Order;
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

  // 多表查询，一条数据
  @Test
  public void test01() {
    OrderMapper mapper = sqlSession.getMapper(OrderMapper.class);
    Order order = mapper.selectOrderById(1);
    System.out.println(order);
    System.out.println(order.getCustomer());
  }

  @Test
  public void test02() {
    CustomerMapper mapper = sqlSession.getMapper(CustomerMapper.class);
    List<Customer> customers = mapper.queryList();
    System.out.println(customers);
  }

  @AfterEach
  public void clean() {
    sqlSession.close();
  }
}
