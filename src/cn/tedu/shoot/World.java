package cn.tedu.shoot;
/** 整个游戏世界 */
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
	
	void action() { //测试代码
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
		
		System.out.println("天空的宽:"+sky.width+"，天空的高:"+sky.height+"，天空的x:"+sky.x+"，天空的y:"+sky.y+"，天空的y1:"+sky.y1+"，天空的speed:"+sky.speed);
		System.out.println("英雄机的宽:"+hero.width+"，英雄机的高:"+hero.height+"，英雄机的x:"+hero.x+"，英雄机的y:"+hero.y+"，英雄机的命:"+hero.life+"，英雄机的火力值:"+hero.doubleFire);
		System.out.println("小敌机a1的宽:"+a1.width+"，小敌机a1的高:"+a1.height+"，小敌机a1的x:"+a1.x+"，小敌机a1的y:"+a1.y+"，小敌机a1的speed:"+a1.speed);
		System.out.println("小敌机a2的宽:"+a2.width+"，小敌机a2的高:"+a2.height+"，小敌机a2的x:"+a2.x+"，小敌机a2的y:"+a2.y+"，小敌机a2的speed:"+a2.speed);
		
	}
	
	public static void main(String[] args) {
		World world = new World();
		world.action();
	}
}























