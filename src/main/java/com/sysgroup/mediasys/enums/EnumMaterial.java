package com.sysgroup.mediasys.enums;

/**
 * Àÿ≤ƒ√∂æŸ¿‡
 * @author liqingguo
 *
 */
public enum EnumMaterial {

	VIDEO("V", " ”∆µ"),
	PICTURE("p", "Õº∆¨"),
	RADIO("R", "“Ù∆µ");
	
	
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
