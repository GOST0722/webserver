package cn.tedu.shoot;
/** �ӵ� */
public class Bullet {
	int width;
	int height;
	int x;
	int y;
	int speed; //�ƶ��ٶ�
	/** ���췽�� */
	Bullet(int x,int y){
		width = 8;
		height = 14;
		this.x = x;
		this.y = y;
		speed = 3;
	}
	
	/** �ӵ��ƶ� */
	void step() {
		System.out.println("�ӵ���y�����ƶ���:"+speed);
	}
}















