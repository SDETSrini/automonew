//package com.qa.base;
//
//public class DBConn {
//	
//	Class.forName("com.mysql.cj.jdbc.Driver");
//	Connection conn=null;
//
//
//	conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Business", "root", "root");
//
//	//object of statement class will help us to execute queries
//	Statement st=conn.createStatement();
//	ResultSet rs=st.executeQuery("select * from CustomerInfo where location = 'Asia' and purchasedDate=curdate();");
//	while(rs.next())
//	{
//		CustomerDetails c=new CustomerDetails();
//		//3 different json files, 3 diff java objects
//		c.setCourseName(rs.getString(1));
//		c.setPurchasedDate(rs.getString(2));
//		c.setAmount(rs.getInt(3));
//		c.setLocation(rs.getString(4));
//		a.add(c);
//		
//		
//
//	}
//	for(int i=0;i<a.size();i++)
//	{
//		ObjectMapper o=new ObjectMapper();
//		o.writeValue(new File("C:\\Users\\rahul\\Selenium\\JsonJava\\customerInfo"+i+".json"),a.get(i));
//
//	}
//
//
//
//
//
//	conn.close();
//
//
//
//
//
//
//
//		}
//
//	}
//
//
//}
