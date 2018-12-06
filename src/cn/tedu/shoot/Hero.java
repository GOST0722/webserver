package cn.tedu.shoot;
/** 英雄机类 */
public class Hero {
	int width;
	int height;
	int x;
	int y;
	int life;       //命
	int doubleFire; //火力值
	/** 构造方法 */
	Hero(){
		width = 97;
		height = 124;
		x = 140;
		y = 400;
		life = 3;
		doubleFire = 0;
	}
	
	/** 英雄机随着鼠标动  x,y:鼠标的x坐标和y坐标 */
	void moveTo(int x,int y) {
		System.out.println("英雄机随着鼠标移动啦!");
	}
	/** 英雄机移动 */
	void step() {
		System.out.println("英雄机切换图片啦!");
	}
}
















