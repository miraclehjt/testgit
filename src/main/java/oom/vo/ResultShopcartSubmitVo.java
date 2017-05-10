package oom.vo;

/**
 * 购物车增删改响应结果vo
 * 
 * @描述: .
 * @作者: Huangjinta.
 * @创建: 2016年7月11日 上午9:22:51
 * @版本: V1.0
 * 
 */
@SuppressWarnings("serial")
public class ResultShopcartSubmitVo extends ResultCommonVo {
	private int shopid;
	private int goodsid;

	public int getShopid() {
		return shopid;
	}

	public void setShopid(int shopid) {
		this.shopid = shopid;
	}

	public int getGoodsid() {
		return goodsid;
	}

	public void setGoodsid(int goodsid) {
		this.goodsid = goodsid;
	}

}
