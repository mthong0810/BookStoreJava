/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.util.Vector;

/**
 *
 * @author son
 */
public interface ICrud {
    // Tạo mới 1 record trong CSDL, sử dụng đối tượng tương ứng
    boolean create();
    boolean update(Object newObject);
    boolean read();
    boolean delete();
}
