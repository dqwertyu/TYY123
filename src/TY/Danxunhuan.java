package TY;

public class Danxunhuan {
	public static void main(String[] args) {
		String[] yb= {"管理学院","音乐学院","设计学院","教育学院","演艺学院","中专�?","饮食文化学院"};
		/*
		 * 0 1 2 3 4 5
		 * 第一�?
		 * 0 5 1 4 2 3
		 * 第二�?
		 * 第一支队伍不�? �?后一支队伍移到第�?支队伍后面，其他队伍顺移
		 * 0 5 1 2 3 4
		 * 0 4 5 3 1 2
		 * 第三�?
		 * 第一支队伍不�? �?后一支队伍移到第�?支队伍后面，其他队伍顺移
		 * 0 4 5 1 2 3 
		 * 0 3 4 2 5 1
		 * 第四�?
		 * 第一支队伍不�? �?后一支队伍移到第�?支队伍后面，其他队伍顺移
		 * 0 3 4 5 1 2
		 * 0 2 3 1 4 5
		 * 第五�?
		 * 第一支队伍不�? �?后一支队伍移到第�?支队伍后面，其他队伍顺移
		 * 0 2 3 4 5 1
		 * 0 1 2 5 3 4
		 * */
		for( int i = 1; i < yb.length; i++) {
		System.out.println("�?"+i+"�?:");
		if(i>1) {
			String stemp=yb[yb.length-1];
			for(int k = yb.length-1; k > 1; k--) {
				yb[k]=yb[k-1];
			}
			yb[1]=stemp;
		}
		for (int j = 0; j< yb.length/2; j++) {
			System.out.println(yb[j]+"vs"+yb[yb.length-j-1]);
		}
		}
	}
}
