package oom.vo;

import java.util.List;

/**
 * 获取商店明细结果vo
 * 
 * @描述: .
 * @作者: Huangjinta.
 * @创建: 2016年7月11日 上午9:16:25
 * @版本: V1.0
 *
 */
public class ShopDetailList {
	private ShopInfoVo shop;
	
	private List<ShopDetailVo> goodscateandgoods;

	public ShopInfoVo getShop() {
		return shop;
	}

	public void setShop(ShopInfoVo shop) {
		this.shop = shop;
	}

	public List<ShopDetailVo> getGoodscateandgoods() {
		return goodscateandgoods;
	}

	public void setGoodscateandgoods(List<ShopDetailVo> goodscateandgoods) {
		this.goodscateandgoods = goodscateandgoods;
	}

}
