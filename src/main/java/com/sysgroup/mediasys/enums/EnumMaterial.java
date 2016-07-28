package com.sysgroup.mediasys.enums;

/**
 * �ز�ö����
 * @author liqingguo
 *
 */
public enum EnumMaterial {

	VIDEO("V", "��Ƶ"),
	PICTURE("p", "ͼƬ"),
	RADIO("R", "��Ƶ");
	
	
	private String code;
	private String value;
	
	private EnumMaterial(String code, String value) {
		this.code = code;
		this.value = value;
	}

	public String getCode() {
		return code;
	}

	public String getValue() {
		return value;
	}

	
	
	
	
	
}
