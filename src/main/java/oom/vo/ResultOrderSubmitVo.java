package oom.vo;


/**
 * 注册响应结果vo
 * 
 * @描述: .
 * @作者: Huangjinta.
 * @创建: 2016年7月11日 上午9:22:51
 * @版本: V1.0
 * 
 */
@SuppressWarnings("serial")
public class ResultOrderSubmitVo extends ResultCommonVo {
	private String couname;//成功下单后获得的优惠包，订单完成后生效

	public String getCouname() {
		return couname;
	}

	public void setCouname(String couname) {
		this.couname = couname;
	}
	
}
