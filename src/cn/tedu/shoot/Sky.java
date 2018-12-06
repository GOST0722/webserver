package cn.tedu.shoot;
/** 天空 */
public class Sky {
	int width;
	int height;
	int x;
	int y;
	int speed; //移动速度
	int y1;    //第二张图的y坐标
	/** 构造方法 */
	Sky(){
		width = 400;
		height = 700;
		x = 0;
		y = 0;
		speed = 1;
		y1 = -700;
	}
	
	/** 天空移动 */
	void step() {
		System.out.println("天空的y坐标和y1坐标移动了:"+speed);
	}
}






















