package com.sonata.DAOImpl;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.sonata.DAO.ProductIntf;
import com.sonata.Model.Product;
//import java.security.PKCS12Attribute; 
public class ProductImpl implements ProductIntf {
    
    DBConnection db = new DBConnection();	
    PreparedStatement s1;	int row = 0;	
    @Override	
    public int save(Object object) {		
        
        Product p1 = (Product) object;	
        try {s1 = db.getConnection().prepareStatement("insert into product values(?,?,?)");			
            
            s1.setInt(1, p1.getProductId());		
            s1.setString(2, p1.getProductName());			
            s1.setDouble(3, p1.getProductPrice());		
            row = s1.executeUpdate();		
            db.closeConnection();		} 
        catch (SQLException e) {e.printStackTrace();}		 
        
        finally { if (s1!=null){		
                
                try {	s1.close();	} 
                
                catch (SQLException e) {e.printStackTrace();		 } }}		
        return row;	}}