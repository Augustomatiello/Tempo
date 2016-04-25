package tempo;

class time {
	int hour;
	int minute;
	time() {};
	private void settime(int x, int y){
		hour = x;
		minute = y;
		System.out.println("The time now is "+hour+":"+minute);
	};
	public static void main (String arg[]) {
		time t = new time();
		t.settime(3, 4);
	}
}

