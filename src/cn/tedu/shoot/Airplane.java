package cn.tedu.shoot;
import java.util.Random;
/** 小敌机 */
public class Airplane {
	int width;
	int height;
	int x;
	int y;
	int speed; //移动速度
	/** 构造方法 */
	Airplane(){
		width = 49;
		height = 36;
		Random rand = new Random(); //随机数对象
		x = rand.nextInt(400-this.width); //x:0到(窗口宽-小敌机宽)之内的随机数
		y = -this.height; //y:负的小敌机的高
		speed = 2;
	}
	
	/** 小敌机移动 */
	void step() {
		System.out.println("小敌机的y坐标移动了:"+speed);
	}
	
}






















