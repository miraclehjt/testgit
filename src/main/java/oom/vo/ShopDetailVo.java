package oom.vo;

import java.io.Serializable;

/**
 * 商店信息vo
 * @author huangjt
 *
 */
@SuppressWarnings("serial")
public class ShopDetailVo implements Serializable {
	private GoodsCateVo goodscate;
	private GoodsList goodslist;
	
	public GoodsCateVo getGoodscate() {
		return goodscate;
	}
	public void setGoodscate(GoodsCateVo goodscate) {
		this.goodscate = goodscate;
	}
	public GoodsList getGoodslist() {
		return goodslist;
	}
	public void setGoodslist(GoodsList goodslist) {
		this.goodslist = goodslist;
	}
	
}
