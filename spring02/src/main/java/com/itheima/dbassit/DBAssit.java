package com.itheima.dbassit;

import javax.sql.DataSource;
import java.sql.*;

/**
 * @Description: java类作用描述
 * @Author: wangch
 * @CreateDate: 2019/1/4 10:33
 * @Version: 1.0
 */
public class DBAssit {
     private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public int update(String sql, Object... params){
         Connection  conn=null;
         PreparedStatement  ps=null;
         try {
             conn=dataSource.getConnection();
             ps=conn.prepareStatement(sql);
             ParameterMetaData pd = ps.getParameterMetaData();
             //执行参数的个数
             int count = pd.getParameterCount();
             if(params==null){
                 throw new NullPointerException("没有执行的语句");
             }if(params.length!=count){
                 throw new RuntimeException("参数个数不一致");
             }

             for (int i=0;i<count;i++){
                 ps.setObject(i+1,params[i]);
             }

             int res=ps.executeUpdate();
                  return res;
         } catch (SQLException e) {
             e.printStackTrace();
         }finally {
             close(conn,ps,null);
         }
         return 0;
     }

     public void close(Connection conn, PreparedStatement ps, ResultSet res){
         try {
             if(conn!=null){
                 conn.close();
             }
             if(ps!=null){
                 ps.close();
             }
             if(res!=null){
                 res.close();
             }
         } catch (SQLException e) {
             e.printStackTrace();
         }
     }

}
