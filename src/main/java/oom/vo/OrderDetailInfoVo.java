package oom.vo;

import java.io.Serializable;

/**
 * 订单明细vo
 * 
 * @描述: .
 * @作者: Huangjinta.
 * @创建: 2016年7月11日 上午9:22:31
 * @版本: V1.0
 * 
 */
@SuppressWarnings("serial")
public class OrderDetailInfoVo implements Serializable {
	private int orderdetailid;
	private int goodsid;
	private String goodsname;
	private String goodsprice;
	private int goodsnum;
	private String orderno;
	private String goodsevalute;
	private String evaluatecontent;

	public int getOrderdetailid() {
		return orderdetailid;
	}

	public void setOrderdetailid(int orderdetailid) {
		this.orderdetailid = orderdetailid;
	}

	public int getGoodsid() {
		return goodsid;
	}

	public void setGoodsid(int goodsid) {
		this.goodsid = goodsid;
	}

	public String getGoodsname() {
		return goodsname;
	}

	public void setGoodsname(String goodsname) {
		this.goodsname = goodsname;
	}

	public String getGoodsprice() {
		return goodsprice;
	}

	public void setGoodsprice(String goodsprice) {
		this.goodsprice = goodsprice;
	}

	public int getGoodsnum() {
		return goodsnum;
	}

	public void setGoodsnum(int goodsnum) {
		this.goodsnum = goodsnum;
	}

	public String getOrderno() {
		return orderno;
	}

	public void setOrderno(String orderno) {
		this.orderno = orderno;
	}

	public String getGoodsevalute() {
		return goodsevalute;
	}

	public void setGoodsevalute(String goodsevalute) {
		this.goodsevalute = goodsevalute;
	}

	public String getEvaluatecontent() {
		return evaluatecontent;
	}

	public void setEvaluatecontent(String evaluatecontent) {
		this.evaluatecontent = evaluatecontent;
	}

}
