package cn.tedu.shoot;
import java.util.Random;
/** С�л� */
public class Airplane {
	int width;
	int height;
	int x;
	int y;
	int speed; //�ƶ��ٶ�
	/** ���췽�� */
	Airplane(){
		width = 49;
		height = 36;
		Random rand = new Random(); //���������
		x = rand.nextInt(400-this.width); //x:0��(���ڿ�-С�л���)֮�ڵ������
		y = -this.height; //y:����С�л��ĸ�
		speed = 2;
	}
	
	/** С�л��ƶ� */
	void step() {
		System.out.println("С�л���y�����ƶ���:"+speed);
	}
	
}






















