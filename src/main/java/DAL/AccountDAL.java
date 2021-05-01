/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.*;

import java.sql.Connection;
import util.DatabaseAccess;

/**
 *
 * @author son
 */
public class AccountDAL extends Accessor implements ICrud, IFuntionable {

    public AccountDTO account;

    public AccountDAL() {
        super();
        this.account = null;
    }
    public AccountDAL(Object o) {
        super();
        this.account = (AccountDTO) o;
    }
    @Override
    public boolean create() {
        String query = "INSERT INTO account(user_name,pwd,role_id)"
                    + "VALUES (?,?,?)";
        if (super.connect("bookstore")) {
            try {
                if (super.createPreparedStatement(query)) {
                    super.statement.setString(1, this.account.getUser_name());
                    super.statement.setString(2, this.account.getPwd());
                    super.statement.setInt(3, this.account.getRole_id());
                    return super.statement.execute();
                }
            } catch (Exception ex) {
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean update(Object newObject) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean read() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean doesHave() {
        String query = "SELECT EXISTS(SELECT * FROM account WHERE user_name = ?)";
        if(super.connect("bookstore")){
            try{
                if(super.createPreparedStatement(query)){
                    super.statement.setString(1,this.account.getUser_name());
                    return super.statement.execute();
                }
            }
            catch (Exception e){
                return false;
            }
        }
        return false;
    }

}
