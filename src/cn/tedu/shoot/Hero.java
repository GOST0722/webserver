package cn.tedu.shoot;
/** Ӣ�ۻ��� */
public class Hero {
	int width;
	int height;
	int x;
	int y;
	int life;       //��
	int doubleFire; //����ֵ
	/** ���췽�� */
	Hero(){
		width = 97;
		height = 124;
		x = 140;
		y = 400;
		life = 3;
		doubleFire = 0;
	}
	
	/** Ӣ�ۻ�������궯  x,y:����x�����y���� */
	void moveTo(int x,int y) {
		System.out.println("Ӣ�ۻ���������ƶ���!");
	}
	/** Ӣ�ۻ��ƶ� */
	void step() {
		System.out.println("Ӣ�ۻ��л�ͼƬ��!");
	}
}
















