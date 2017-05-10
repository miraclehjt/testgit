package oom.vo;

import java.io.Serializable;

/**
 * 购物车vo
 * 
 * @描述: .
 * @作者: Huangjinta.
 * @创建: 2016年7月11日 上午9:28:14
 * @版本: V1.0
 *
 */
@SuppressWarnings("serial")
public class ShopcartInfoVo implements Serializable {
	private String status;//ok-正常 empty-空
	private ShopInfoVo shop;
	private GoodsList goods;
	private double totalmoney;
	private double totalpackFee;
	private int packmum;
	private double lessmoney;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public ShopInfoVo getShop() {
		return shop;
	}
	public void setShop(ShopInfoVo shop) {
		this.shop = shop;
	}
	public GoodsList getGoods() {
		return goods;
	}
	public void setGoods(GoodsList goods) {
		this.goods = goods;
	}
	public double getTotalmoney() {
		return totalmoney;
	}
	public void setTotalmoney(double totalmoney) {
		this.totalmoney = totalmoney;
	}
	public double getTotalpackFee() {
		return totalpackFee;
	}
	public void setTotalpackFee(double totalpackFee) {
		this.totalpackFee = totalpackFee;
	}
	public int getPackmum() {
		return packmum;
	}
	public void setPackmum(int packmum) {
		this.packmum = packmum;
	}
	public double getLessmoney() {
		return lessmoney;
	}
	public void setLessmoney(double lessmoney) {
		this.lessmoney = lessmoney;
	}
	
}
