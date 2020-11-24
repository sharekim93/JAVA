package threadstate;

/*
 * Q3. 다음 중 쓰레드를 일시정지 상태(WAITING)로 만드는 것이 아닌 것을 모두 고르시오
 * a. suspend()
 * b. resume()
 * c. join()
 * d. sleep()
 * e. wait()
 * f. notify()
 * 
 * Answer : b, f
 * 
 * Q4. 다음 중 interrupt()에 의해서 실행대기상태(Runnable)가 되지 않는 경우는?
 * a. sleep()에 의해서 일시정지 상태인 쓰레드
 * b. join()에 의해서 일시정지 상태인 쓰레드
 * c. wait()에 의해서 일시정지 상태인 쓰레드
 * d. suspend()에 의해서 일시정지 상태인 쓰레드
 * 
 * Answer : d
 * 
 * Q5. 출력된 화면은?
 * class Thread3 extends Thread{
 * 		public void run(){
 * 			for(int i=0;i<10,++){
 * 				System.out.println(i);
 * 				try{Thread.sleep(1000);} catch(Exception e){}
 * 			}
 * 		}
 * }
 * 
 * public class ThreadEx005{
 * 		public static void main(String[] args) throws Exception{
 * 		Thread3 th1 = new Thread3();
 * 		th1.start();
 * 		try{Thread.sleep(1000);} catch (Exception e){}
 * 		throw new Exception("STOP~!!!");
 * 
 * Answer : 
 * 0
 * 1
 * 2
 * 3
 * 4
 * 5
 * 6
 * 7
 * 8
 * 9
 * 
 * Q6. 메인이 종료되면 종속스레드도 같이 끝나게 코드를 수정하시오.
 * class Thread4 extends Thread{
 * 		public void run(){
 * 			for(int i=0;i<10;i++){
 * 				System.out.println(i);
 * 				try{Thread.sleep(1000);}catch (Exception e){}
 * 			}
 * 		}
 * }
 * 
 * public class Thread006_{
 * 		public static void main(String[] args) throws Exception{
 * 			Thread4 th1 = new Thread4();
 * 			//th.setDaemon(true);
 * 			th1.start();
 * 			try{Thread.sleep(5*1000);}catch (Exception e){}
 * 			throw new Exception("STOP~!!!");
 * 		}
 * }
 */		
 class Thread3 extends Thread{
 		public void run(){
 			for(int i=0;i<10;i++){
 				System.out.println(i);
 				try{Thread.sleep(1000);} catch(Exception e){}
 			}
 		}
 }



public class ThreadStateExample {

	public static void main(String[] args) throws Exception{
		  		Thread3 th1 = new Thread3();
		  		th1.start();
		  		try{Thread.sleep(5*1000);} catch (Exception e){}
		  		throw new Exception("STOP~!!!");
	}

}
