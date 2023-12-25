package cn.xmcu.domain;

import java.util.Date;
public class User {
	private Integer id;
	private String username;
	private String password;
	private String sex;
	private byte age;
	private Date birthday;
	private boolean status;
	private String addr;
	private String email;
	private String phone;
	public User() {
	}
	
	
    public User(Integer id, String username, String password, String sex, byte age,
    		Date birthday, boolean status, String addr, String email, 
    		String phone) {
			this.id = id;
			this.username = username;
			this.password = password;
			this.sex = sex;
			this.age = age;
			this.birthday = birthday;
			this.status = status;
			this.addr = addr;
			this.email = email;
			this.phone = phone;
       }
    
		public Integer getId() {
		     return this.id;
		}
		
		public void setId(Integer id) {
		     this.id = id;
		}
		
		public String getUsername() {
		    return this.username;
		}
		public void setUsername(String username) {
		     this.username = username;
		}
		public String getPassword() {
		     return this.password;
		}
		public void setPassword(String password) {
		     this.password = password;
		}
		public String getSex() {
		    return this.sex;
		}
		public void setSex(String sex) {
		    this.sex = sex;
		}
		public byte getAge() {
		    return this.age;
		}
		public void setAge(byte age) {
		     this.age = age;
		}
		public Date getBirthday() {
		     return this.birthday;
		}
		public void setBirthday(Date birthday) {
		    this.birthday = birthday;
		}
		public boolean isStatus() {
		     return this.status;
		}
		
		public void setStatus(boolean status) {
		    this.status = status;
		}
		public String getAddr() {
		     return this.addr;
		}
		public void setAddr(String addr) {
		     this.addr = addr;
		}
		public String getEmail() {
		     return this.email;
		}
		public void setEmail(String email) {
		    this.email = email;
		}
		public String getPhone() {
		    return this.phone;
		}
		public void setPhone(String phone) {
		     this.phone = phone;
		}
}
