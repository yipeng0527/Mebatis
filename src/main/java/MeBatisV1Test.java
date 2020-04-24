import com.yp.v1.*;
import com.yp.v1.mapper.PosImage;
import com.yp.v1.mapper.PosImageMapper;

/**
 * @author ex-yipeng
 * @version Id: MeBatisV1Test.java, v 0.1 2020/4/24 11:19 ex-yipeng Exp $
 */
public class MeBatisV1Test {
    public static void main(String[] args) {
        SqlSession sql = new SqlSession(new Configuration(), new Executor());
        PosImageMapper posImageMapper = sql.getMapper(PosImageMapper.class);
        PosImage posImage = posImageMapper.selectById("bd62db9e-b8a7-4420-96b7-c9dddce81156");
        System.out.println(posImage);
    }
}
