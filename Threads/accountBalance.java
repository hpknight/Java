import java.util.concurrent.locks.Lock;

//balance
//condition
//lock
//pass it into both deposit and withdraw

public class accountBalance {
	int balance = 0;
	int deposit1, withdraw1, name;
	Lock lock;
	
	public void deposit(){
		if (deposit1 < 0){
			System.out.println("Deposit error");
			balance = balance;
		}
		else {
			lock.lock();
			balance += deposit1;
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Thread " + ""  + " deposits $" + deposit1 + "\t\t\t\t\t\t\tBalance is $" + balance);
		lock.unlock();
	}
	
	
	public void withdraw () {
		if (withdraw1 > balance){
			System.out.println("\t\t\t\tThread " + name + " withdraws $" + withdraw1 + " Withdrawal - Blocked - Insufficient Funds");
			Thread.yield();
				
		}
		else if (withdraw1 < balance){
			lock.lock();			
			balance -= withdraw1;
			Thread.yield();
		}
		System.out.println("\t\t\t\tThread " + name + " withdraws $" + withdraw1 + "\t\t\tBalance is $" + balance);
	}
}

