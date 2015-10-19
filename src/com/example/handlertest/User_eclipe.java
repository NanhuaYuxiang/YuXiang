package com.example.handlertest;

/**   
 *  
 * @Description: TODO 
 * @Create by lilin
 * @Date   2015年10月19日 . 下午4:41:04 
 * @Blog   www.gaosililin.iteye.com
 * @E_mail gaosi0812@gmail.com
 * @School University of South China(USC)
 */

public class User_eclipe {
	private int id;
	private String name ;
	private String sex;
	public User_eclipe(int id, String name, String sex) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "User_eclipe [id=" + id + ", name=" + name + ", sex=" + sex
				+ "]";
	}
	
	

}

