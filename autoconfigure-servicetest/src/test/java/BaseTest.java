import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.ql.servicetest.AutoconfigureWebApplication;

/**
 * @ClassName BaseTest @Description BaseTest @Author stack @Version 1.0
 *
 * @since 2019/6/25 10:57
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = AutoconfigureWebApplication.class)
public class BaseTest {}
