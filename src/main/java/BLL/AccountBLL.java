package BLL;
import DAL.AccountDAL;
import DTO.AccountDTO;
import java.util.ArrayList;

import java.util.logging.Level;
import java.util.logging.Logger;
public class AccountBLL {
    public static ArrayList <AccountDTO> accountList;
   public AccountBLL()
    {
        
    }
    public  void  read() throws Exception 
    {
        AccountDAL accountData=new AccountDAL();
        if(accountList==null) 
        {
            accountList=new ArrayList<AccountDTO>();
        }
        accountList=accountData.read();
        
    }
    public void create(AccountDTO account)
    {
        try
        {
            AccountDAL accountData=new AccountDAL();
            accountData.create(account);
            if(accountList!=null)
            accountList.create(account);
        }
        catch (Exception ex) {
           Logger.getLogger(AccountBLL.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
    }
    public void update(AccountDTO account,int i)
    {
        try
        {

           AccountDAL accountData=new AccountDAL();
           accountData.update(account);
           if(accountList!=null)
           accountList.set(i,account);
        }
        catch (Exception ex) {
           Logger.getLogger(AccountBLL.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
    }
     public void delete(AccountDTO account,int index)
    {
        AccountDAL accountData =new AccountDAL();
        String deleteAcc = accountList.get(index).getUser_name();
        accountData.delete(deleteAcc);
        if(accountList!=null)
        accountList.set(index,account);
    }
     //Xóa với ID
    public void delete(String ID, int index) 
    {
        AccountDAL accountData = new AccountDAL();
        accountData.delete(); // update trạng thái lên accountDatabase
        AccountDTO DTO=accountList.get(index); // sửa lại thông tin trong accountList
        if(accountList!=null)
        accountList.set(index,DTO);
    }
}