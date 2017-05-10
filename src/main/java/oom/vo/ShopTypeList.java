package oom.vo;

import java.util.List;

/**
 * 获取商店类别（口味）结果vo
 * 
 * @描述: .
 * @作者: Huangjinta.
 * @创建: 2016年7月11日 上午9:17:20
 * @版本: V1.0
 *
 */
public class ShopTypeList {
	private int total;
	
	private List<ShopTypeVo> rows;

	public List<ShopTypeVo> getRows() {
		return rows;
	}

	public void setRows(List<ShopTypeVo> rows) {
		this.rows = rows;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
}
