package oom.vo;

import java.io.Serializable;
import java.util.List;

/**
 * 订单信息vo
 * 
 * @描述: .
 * @作者: Huangjinta.
 * @创建: 2016年7月11日 上午9:22:31
 * @版本: V1.0
 *
 */
@SuppressWarnings("serial")
public class OrderInfoVo implements Serializable {
	private int shopid;
	private String orderno;
	private String personname;
	private String mphone;
	private String address;
	private String totalmoney;
	private String cashpay;
	private String couponpay;
	private String orderstatus;
	private String remark;
	private String ordertime;
	private String arrivetime;
	private String shopname;
	private String sendmoney;
	private String orderstatusname;
	private List<OrderDetailInfoVo> orderdetaillist;

	public int getShopid() {
		return shopid;
	}

	public void setShopid(int shopid) {
		this.shopid = shopid;
	}

	public String getOrderno() {
		return orderno;
	}

	public void setOrderno(String orderno) {
		this.orderno = orderno;
	}

	public String getPersonname() {
		return personname;
	}

	public void setPersonname(String personname) {
		this.personname = personname;
	}

	public String getMphone() {
		return mphone;
	}

	public void setMphone(String mphone) {
		this.mphone = mphone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTotalmoney() {
		return totalmoney;
	}

	public void setTotalmoney(String totalmoney) {
		this.totalmoney = totalmoney;
	}

	public String getCashpay() {
		return cashpay;
	}

	public void setCashpay(String cashpay) {
		this.cashpay = cashpay;
	}

	public String getCouponpay() {
		return couponpay;
	}

	public void setCouponpay(String couponpay) {
		this.couponpay = couponpay;
	}

	public String getOrderstatus() {
		return orderstatus;
	}

	public void setOrderstatus(String orderstatus) {
		this.orderstatus = orderstatus;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getOrdertime() {
		return ordertime;
	}

	public void setOrdertime(String ordertime) {
		this.ordertime = ordertime;
	}

	public String getArrivetime() {
		return arrivetime;
	}

	public void setArrivetime(String arrivetime) {
		this.arrivetime = arrivetime;
	}

	public String getShopname() {
		return shopname;
	}

	public void setShopname(String shopname) {
		this.shopname = shopname;
	}

	public String getSendmoney() {
		return sendmoney;
	}

	public void setSendmoney(String sendmoney) {
		this.sendmoney = sendmoney;
	}

	public String getOrderstatusname() {
		return orderstatusname;
	}

	public void setOrderstatusname(String orderstatusname) {
		this.orderstatusname = orderstatusname;
	}

	public List<OrderDetailInfoVo> getOrderdetaillist() {
		return orderdetaillist;
	}

	public void setOrderdetaillist(List<OrderDetailInfoVo> orderdetaillist) {
		this.orderdetaillist = orderdetaillist;
	}
}
