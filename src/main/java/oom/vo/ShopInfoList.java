package oom.vo;

import java.util.List;

/**
 * 获取商店列表结果vo
 * 
 * @描述: .
 * @作者: Huangjinta.
 * @创建: 2016年7月11日 上午9:17:52
 * @版本: V1.0
 *
 */
public class ShopInfoList {
	private int total;
	
	private List<ShopInfoVo> rows;

	public List<ShopInfoVo> getRows() {
		return rows;
	}

	public void setRows(List<ShopInfoVo> rows) {
		this.rows = rows;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
}
