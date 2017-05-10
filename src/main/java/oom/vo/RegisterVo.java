package oom.vo;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/3/14.
 */
@SuppressWarnings("serial")
public class RegisterVo implements Serializable {
	private String username;
	private String password;
	private String cfgPassword;
	private String phone;
	private Integer userType;
	private String validateCode;

	public String getCfgPassword() {
		return cfgPassword;
	}

	public void setCfgPassword(String cfgPassword) {
		this.cfgPassword = cfgPassword;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getUserType() {
		return userType;
	}

	public void setUserType(Integer userType) {
		this.userType = userType;
	}

	public String getValidateCode() {
		return validateCode;
	}

	public void setValidateCode(String validateCode) {
		this.validateCode = validateCode;
	}
}
