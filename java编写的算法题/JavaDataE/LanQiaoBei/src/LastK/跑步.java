package LastK;

public class 跑步 {
	/*
	 * 这个算法有点懵
	 * 小明要做一个跑步训练。
初始时，小明充满体力，体力值计为 10000。如果小明跑步，每分钟损耗
600 的体力。如果小明休息，每分钟增加 300 的体力。体力的损耗和增加都是
均匀变化的。
小明打算跑一分钟、休息一分钟、再跑一分钟、再休息一分钟……如此循
环。如果某个时刻小明的体力到达 0，他就停止锻炼。
请问小明在多久后停止锻炼。为了使答案为整数，请以秒为单位输出答案。
run:每秒10
xiu:每秒5
	 */

	public static void main(String[] args) {
		int power=10000;
		int d=0;
		while(power>=600) {
			power-=600;
			power +=300;
			d++;
		}
		System.out.println(d);
 System.out.println(power);
 System.out.println(d*2*60+400/10);//求出3880秒
	}

}
