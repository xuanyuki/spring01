import com.xianyu.config.JavaConfig;
import com.xianyu.service.StudentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(value= JavaConfig.class)
public class Test01 {

  @Autowired
  private StudentService studentService;
  @Test
  public void test(){
    studentService.changeInfo();
  }
}
