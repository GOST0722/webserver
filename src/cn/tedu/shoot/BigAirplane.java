package cn.tedu.shoot;
import java.util.Random;
/** ��л� */
public class BigAirplane {
	int width;
	int height;
	int x;
	int y;
	int speed; //�ƶ��ٶ�
	/** ���췽�� */
	BigAirplane(){
		width = 69;
		height = 99;
		Random rand = new Random(); //���������
		x = rand.nextInt(400-this.width); //x:0��(���ڿ�-��л���)֮�ڵ������
		y = -this.height; //y:���Ĵ�л��ĸ�
		speed = 2;
	}
	
	/** ��л��ƶ� */
	void step() {
		System.out.println("��л���y�����ƶ���:"+speed);
	}
}














