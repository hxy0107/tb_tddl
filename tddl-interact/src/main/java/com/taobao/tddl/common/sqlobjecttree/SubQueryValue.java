/*(C) 2007-2012 Alibaba Group Holding Limited.	

import java.util.Map;

/**
 * Ϊ�˽������һ�����⣺
 * �������治��֧��һ��=��comparative�а������Or�Ĺ���ƥ�䡣
 * ������Щ�������Ƕ��ֱ�����ֵ��subSelect��̳�����ӿڣ���
 * Comparative����һ��hook��ר�Ŵ�������֮�µ�����
 * @author shenxun
 *
 */
public interface SubQueryValue extends Value {
	public void setAliasMap(Map<String, SQLFragment>  map);
	
}