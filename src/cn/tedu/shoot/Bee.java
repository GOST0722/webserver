package cn.tedu.shoot;
import java.util.Random;
/** С�۷� */
public class Bee {
	int width;
	int height;
	int x;
	int y;
	int xSpeed; //x�����ƶ��ٶ�
	int ySpeed; //y�����ƶ��ٶ�
	int awardType; //��������
	/** ���췽�� */
	Bee(){
		width = 60;
		height = 50;
		Random rand = new Random(); //���������
		x = rand.nextInt(400-this.width); //x:0��(���ڿ�-С�۷��)֮�ڵ������
		y = -this.height; //y:����С�۷�ĸ�
		xSpeed = 1;
		ySpeed = 2;
		awardType = rand.nextInt(2); //0��1֮��������
	}
	
	/** С�۷��ƶ� */
	void step() {
		System.out.println("С�۷��x�����ƶ���:"+xSpeed+"��y�����ƶ���:"+ySpeed);
	}
}























