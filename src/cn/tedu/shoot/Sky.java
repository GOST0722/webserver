package cn.tedu.shoot;
/** ��� */
public class Sky {
	int width;
	int height;
	int x;
	int y;
	int speed; //�ƶ��ٶ�
	int y1;    //�ڶ���ͼ��y����
	/** ���췽�� */
	Sky(){
		width = 400;
		height = 700;
		x = 0;
		y = 0;
		speed = 1;
		y1 = -700;
	}
	
	/** ����ƶ� */
	void step() {
		System.out.println("��յ�y�����y1�����ƶ���:"+speed);
	}
}






















