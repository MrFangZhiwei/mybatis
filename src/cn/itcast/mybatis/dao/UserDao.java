package cn.itcast.mybatis.dao;

import java.util.List;

import cn.itcast.mybatis.po.User;

/**
 * 
 * <p>Title: UserDao</p>
 * <p>Description: 用户dao</p>
 * <p>Company: www.itcast.com</p> 
 * @author	传智.燕青
 * @date	2015-3-17下午2:47:51
 * @version 1.0
 */
public interface UserDao {
	
	//根据id查询用户信息
	public User findUserById(int id) throws Exception;
	//根据用户名称模糊查询用户列表
	public List<User> findUserByUsername(String username) throws Exception;
	//插入用户
	public void insertUser(User user) throws Exception;

}
