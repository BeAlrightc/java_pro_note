package themes2;

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
	static int power = 10000;

	public static void main(String[] args) {
		int sum = 0;//统计跑了多久时间（分钟）
		boolean juge = true;
		for (int i = 1;; i++) {
			if(power < 600&&juge ) {
				break;
			}
			//跑步
			if(i % 2 != 0 && juge) {
				power -= 600;
				juge = false;
			}else {	//休息
				power += 300;
				juge = true;
			}
			sum++;
		}
		System.out.println(sum * 60 + power / 10);
	}

}