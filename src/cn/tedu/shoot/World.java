package cn.tedu.shoot;
/** ������Ϸ���� */
public class World {
	Sky sky;
	Hero hero;
	Airplane a1;
	Airplane a2;
	BigAirplane ba1;
	BigAirplane ba2;
	Bee b1;
	Bee b2;
	Bullet bt1;
	Bullet bt2;
	
	void action() { //���Դ���
		sky = new Sky();
		hero = new Hero();
		a1 = new Airplane();
		a2 = new Airplane();
		ba1 = new BigAirplane();
		ba2 = new BigAirplane();
		b1 = new Bee();
		b2 = new Bee();
		bt1 = new Bullet(100,200);
		bt2 = new Bullet(60,120);
		
		System.out.println("��յĿ�:"+sky.width+"����յĸ�:"+sky.height+"����յ�x:"+sky.x+"����յ�y:"+sky.y+"����յ�y1:"+sky.y1+"����յ�speed:"+sky.speed);
		System.out.println("Ӣ�ۻ��Ŀ�:"+hero.width+"��Ӣ�ۻ��ĸ�:"+hero.height+"��Ӣ�ۻ���x:"+hero.x+"��Ӣ�ۻ���y:"+hero.y+"��Ӣ�ۻ�����:"+hero.life+"��Ӣ�ۻ��Ļ���ֵ:"+hero.doubleFire);
		System.out.println("С�л�a1�Ŀ�:"+a1.width+"��С�л�a1�ĸ�:"+a1.height+"��С�л�a1��x:"+a1.x+"��С�л�a1��y:"+a1.y+"��С�л�a1��speed:"+a1.speed);
		System.out.println("С�л�a2�Ŀ�:"+a2.width+"��С�л�a2�ĸ�:"+a2.height+"��С�л�a2��x:"+a2.x+"��С�л�a2��y:"+a2.y+"��С�л�a2��speed:"+a2.speed);
		
	}
	
	public static void main(String[] args) {
		World world = new World();
		world.action();
	}
}























