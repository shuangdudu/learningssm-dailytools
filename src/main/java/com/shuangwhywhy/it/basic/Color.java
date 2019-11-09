package com.shuangwhywhy.it.basic;

public enum Color {
	RED(0,"红色"),
	BLUE(1,"蓝色"),
	YELLOW(2,"黄色"),
	GREEN(3,"绿色");
	//可以看出这在枚举类型里定义变量和方法和在普通类里面定义方法和变量没有什么区别。
	//唯一要注意的只是变量和方法定义必须放在所有枚举值定义的后面，否则编译器会给出一个错误。
	private int code;
	private String desc;
	Color(int code, String desc) { //加上public void 上面定义枚举会报错 The constructor Color(int, String) is undefined
		this.code = code;
		this.desc = desc;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	/**
	 * @param code
	 * @return
	 * 自己定义一个静态方法,通过code返回枚举常量对象
	 */
	public static Color getValue(int code){
		for(Color color : values()){
			if(color.getCode() == code){
				return color;
			}
		}
		return null;
	}
	
	
}
