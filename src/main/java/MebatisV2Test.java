import com.yp.v2.session.DefaultSqlSession;
import com.yp.v2.session.SqlSessionFactory;

/**
 * @author ex-yipeng
 * @version Id: MebatisV2Test.java, v 0.1 2020/4/24 15:34 ex-yipeng Exp $
 */
public class MebatisV2Test {
    public static void main(String[] args) {
        SqlSessionFactory factory = new SqlSessionFactory();
        DefaultSqlSession sqlSession = factory.build().openSqlSession();
    }
}
