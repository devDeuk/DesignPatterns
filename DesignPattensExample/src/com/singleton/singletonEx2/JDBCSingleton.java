package com.singleton.singletonEx2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

class JDBCSingleton {
	//1단계
	//JDBCSingleton 클래스를 만듭니다.
	//정적 멤버는 JDBCSingleton 클래스의 인스터스 하나만 보유합니다.
	 private static JDBCSingleton instance;
	 
	 //JDBCSingleton은 다른 클래스에서 인스턴스화 방지합니다.
	 private JDBCSingleton() {}
	 

	 //싱글톤 access 영역
	 public static JDBCSingleton getInstance() {
		if(instance == null) {
			instance = new JDBCSingleton();
		}else {
			System.out.println("이미 instance 생성되어있음");
		}
		return instance;
	}

	private static Connection getConnection() {
		
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/kubdb", "kub", "xmsxms2");
			
			System.out.println("Mysql 데이타베이스 접속");			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	
	
    public int insert(String name, String pass) throws SQLException{  
        Connection con=null;  
        PreparedStatement ps=null;  
        int recordCounter=0;  
          
        try {  
            con=JDBCSingleton.getConnection();  
            ps=con.prepareStatement("insert into userdata(uname,upassword)values(?,?)");  
            ps.setString(1, name);  
            ps.setString(2, pass);  
            recordCounter=ps.executeUpdate();  
                  
        } catch (Exception e) { e.printStackTrace(); } finally{  
              if (ps!=null){  
                ps.close();  
            }if(con!=null){  
                con.close();  
            }   
        }  
       return recordCounter;  
    }  	
	
    
    public  void view(String name) throws SQLException  
    {  
    	Connection con = null;  
    	PreparedStatement ps = null;  
    	ResultSet rs = null;  
                
    	try {  
                    
          con=JDBCSingleton.getConnection();  
          ps=con.prepareStatement("select * from userdata where uname=?");  
          ps.setString(1, name);  
          rs=ps.executeQuery();  
          while (rs.next()) {  
            System.out.println("Name= "+rs.getString(1)+"\t"+"Paasword= "+rs.getString(2));      
          }  
              
        } catch (Exception e){ 
        	System.out.println(e);
        }finally{  
	      if(rs!=null){  
	          rs.close();  
	      }if (ps!=null){  
	        ps.close();  
	      }if(con!=null){  
	    	  con.close();  
	      }   
        }  
    }
    
    public int update(String name, String password) throws SQLException  {  
        Connection con=null;  
        PreparedStatement ps=null;  
        int recordCounter=0;  
        try {  
	        con=JDBCSingleton.getConnection();  
	        ps=con.prepareStatement(" update userdata set upassword=? where uname='"+name+"' ");  
	        ps.setString(1, password);  
	        recordCounter=ps.executeUpdate();  
        } catch (Exception e) {  e.printStackTrace(); } finally{  
                
            if (ps!=null){  
                ps.close();  
            }if(con!=null){  
                con.close();  
            }   
         }  
       return recordCounter;  
    }  

    
}
