import com.yp.v2.mapper.ImUser;
import com.yp.v2.mapper.ImUserMapper;
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
        // 获取MapperProxy代理
        ImUserMapper mapper = sqlSession.getMapper(ImUserMapper.class);
        ImUser posImage = mapper.selectByUserId("yipeng");

        System.out.println("第一次查询: " + posImage);
        System.out.println();
        posImage = mapper.selectByUserId("yipeng");
        System.out.println("第二次查询: " + posImage);
    }
}
