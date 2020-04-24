package com.yp.v1;

import com.yp.v1.mapper.PosImage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ex-yipeng
 * @version Id: Executor.java, v 0.1 2020/4/24 10:16 ex-yipeng Exp $
 */
public class Executor {

    public <T> T query(String sql, Object parameter) {
        String url = "jdbc:postgresql://10.32.0.175:5432/ht_service?binaryTransfer=false";
        String user = "posopr";
        String password = "ht123456";
        try {
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(String.format(sql, parameter));
            List<PosImage> list = new ArrayList<PosImage>();
            while (rs.next()) {
                PosImage posImage = new PosImage();
                posImage.setPosImageId(rs.getString("pos_image_id"));
                posImage.setPosAcceptId(rs.getString("pos_accept_id"));
                posImage.setPosBatchId(rs.getString("pos_batch_id"));
                list.add(posImage);
            }
            if (null != list && list.size() > 0) {
                return (T) list.get(0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
