package com.family.kitchen.user.mapper;

import java.io.IOException;
import com.family.kitchen.user.po.User;

/**
 * 
 * <p>Title: 用户信息dao层接口</p>
 * <p>Copyright: </p> 
 * @author XBB 
 * @date 2015年7月26日 下午8:50:12 Create
 * @version V1.0 
 * <pre>Histroy:
 *       2015年7月26日 下午8:50:12  XBB  Create
 *       2014-10-24  XBB  modify
 * </pre>
 *
 */
public interface UserMapper {

	public void add(User user) throws IOException; 
}
