/*  Himan Patel
 *  Course: CNT 4714 Fall 2013
 *  Assignment title: Program 2 - Synchronized, Cooperating Threads Under Locking
 *  Due Date: September 20, 2013
 */

import java.util.Random;

public class synchronizedThreading {
	public static void main(String[] args) {
			
		System.out.println("Deposit Threads\t\t\tWithdrawal Threads\t\t\tBalance");
		System.out.println("---------------\t\t\t------------------\t\t\t---------------");
		
		//Create three Deposit Threads
		deposit thread1 = new deposit(1);
		deposit thread2 = new deposit(2);
		deposit thread3 = new deposit(3);
		
		//Create four Withdrawal Threads
		withdraw thread4 = new withdraw(4);
		withdraw thread5 = new withdraw(5);
		withdraw thread6 = new withdraw(6);
		withdraw thread7 = new withdraw(7);
		
		//Start threads
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
		thread6.start();
		thread7.start();
	}

	//start the balance with 0
	static int balance = 0;
	//create random object to use for deposit1 and withdraw1
	static Random r = new Random();

	//deposit class that handles the deposits 
	static class deposit extends Thread {
		//makes the deposits a random number between 1 and 200.
		private int deposit1  = 1 + r.nextInt(199);
		private int name;
				
		//this gives the thread a name
		public deposit(int n){
			name = n;
		}
	
		public void run(){
			//if the deposit is < 0, then the balance stays the same
			if (deposit1 < 0){
				System.out.println("Deposit error");
				balance = balance;
			}
			//add the deposit amount to the balance
			else {
				balance += deposit1;
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("Thread " + name + " deposits $" + deposit1 + "\t\t\t\t\t\t\tBalance is $" + balance);
		}
	}

	static class withdraw extends Thread {
		int balace = 0;
		private int withdraw1 = 1 + r.nextInt(49);
		int name;		
		
		public withdraw(int n){
			name = n;
		}
		
		public void run() {
			if (withdraw1 > balance){
				System.out.println("\t\t\t\tThread " + name + " withdraws $" + withdraw1 + " Withdrawal - Blocked - Insufficient Funds");
				Thread.yield();
				
			}
			else if (withdraw1 < balance){
				balance -= withdraw1;
				Thread.yield();
			}
			System.out.println("\t\t\t\tThread " + name + " withdraws $" + withdraw1 + "\t\t\tBalance is $" + balance);
		}
	}
}


