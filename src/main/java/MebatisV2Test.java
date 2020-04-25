import com.yp.v2.mapper.PosImage;
import com.yp.v2.mapper.PosImageMapper;
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
        PosImageMapper mapper = sqlSession.getMapper(PosImageMapper.class);
        PosImage posImage = mapper.selectById("bd62db9e-b8a7-4420-96b7-c9dddce81156");

        System.out.println("第一次查询: " + posImage);
        System.out.println();
        posImage = mapper.selectById("bd62db9e-b8a7-4420-96b7-c9dddce81156");
        System.out.println("第二次查询: " + posImage);
    }
}
