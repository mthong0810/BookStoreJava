/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import util.DatabaseAccess;

/**
 *
 * @author son
 */
public abstract class Accessor {
    
    private Connection con;
    protected PreparedStatement statement;
    
    
    public Accessor(){
        this.con = null;
        this.statement=null;
    }
    
    protected boolean connect(String db){
        try{
            this.con = DatabaseAccess.createConnection(db);
            if(this.con!=null)
                return true;
            return false;
        }
        catch(Exception e){
            return false;
        }
    }
    
    
    protected boolean createPreparedStatement(String query){
        try{
            this.statement = this.con.prepareStatement(query);
            if(this.statement!=null)
                return true;
            return false;
        }
        catch(Exception e){
            return false;
        }
    }
}
