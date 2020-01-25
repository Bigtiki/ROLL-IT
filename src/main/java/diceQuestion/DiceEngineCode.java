package diceQuestion;

import java.util.Random;
import java.util.Scanner;

public class DiceEngineCode {
	
	public static double total;
	public DiceEngineCode(){
		
		System.out.println("H̩̃e͚̩̩͈̫͔͛̆͒ͩ̿̃l͖l̫̱͕ͣ̋͋ŏ̲̖̫̟̪̙̝̐̽ͭ̀̏̑,ͯ͋̈ ̻͕̮ͯ͑͋͂ͅTͫ͐hi̘̩̟̜̗̺͐͌̋͑ͭ̈s͔̦͚̝̳̭͓̀ͧ͊̀̐̓̓ ͖̤̻̼̰̥̪̏̆͒̾̽͛ͣis̮̖̹͋͌̾ ̟̖̹̯͈͎̖ͥ͊ͣ̅̈ͭ̐a R̫̺̮̯̳̙̽͐̎ͣ̋̎and̗̟̪̩̠̼ͮ̅͐̏͗̈́o̞̗͇̗͊͒̂̚m͖̻͕̠͇̺͚͒̀͌ͩ̏ͫ̄ ͤ̔ͫ̆Ḍ̗͚ͤͤ̍i̹̞͕̬̳̓̽̉̏ͩc̻̯ͅe ̳̹̮̀ͩ̌r̬͇ȍ̞̯̜̮͈̙͎̀̾͐̌ͧ̄l̪̙̣̦͔͖ͩ̌̊͒ͣ̈́͒ͅl̫͚͆́s̪̦̙̞̣̳͗̀̇ͪ̓̑\n"
				+ "\nAnswe̹̘̬̭̦ͅr͔̥̞͉̱̓ͪ̓́̊: YES/NO"+"\n\n̅̅:̅̅:̅̅:̅̅ ̅̅:̅̅:̅̅:̅̅   is 100%"+"\n\n ̲̲.̲̲ ̲̲ ̲̲.̲̲ is 3%\nLowest value is 3%"+
				"\n\n░T░h░e░r░e░ ░a░r░e░ ░3░6░ ░p░o░s░i░b░l░e░ ░v░a░l░u░e░s░.░"
				+"\nºO•❤•.¸✿¸.•❤•.( ͡° ͜ʖ﻿ ͡°) Each value has 1/36 chances. ");
	}

	public static void main(String[] args) {
	
		RunProgram();
	}
	
	
	public void EnterQuestion() {
		System.out.print("\n\n[Ì…Ì²Ì²Ì…EÌ…Ì²Ì²Ì…nÌ…Ì²Ì²Ì…tÌ…Ì²Ì²Ì…eÌ…Ì²Ì²Ì…rÌ…Ì²Ì²Ì… Ì…Ì²Ì²Ì…AÌ…Ì²Ì²Ì… Ì…Ì²Ì²Ì…QÌ…Ì²Ì²Ì…uÌ…Ì²Ì²Ì…eÌ…Ì²Ì²Ì…sÌ…Ì²Ì²Ì…tÌ…Ì²Ì²Ì…iÌ…Ì²Ì²Ì…oÌ…Ì²Ì²Ì…nÌ…Ì²Ì²Ì…:Ì…Ì²Ì²Ì… Ì…Ì²Ì²Ì…\nâˆ´");
		Scanner input = new Scanner(System.in);
		String Question = input.nextLine();
		System.out.println(Question);
		generateDice();
	}
	
	
	public static void RunProgram() {
		DiceEngineCode RollIt= new DiceEngineCode();
		RollIt.EnterQuestion();
		System.out.println("Do you want to continue:\n");
		Scanner input = new Scanner(System.in);
		String ContinueProg = input.nextLine();
		switch(ContinueProg.toLowerCase()){
		case "yes":
			RunProgram();
	break;
		case "no":
			System.out.println("Thank You for running the program.");
			break;			
		default:
			RunProgram();
			}
	}
	
	
	public String generateDice() {
		Random  rand = new Random();
		Random  rand2 = new Random();
		
		int num1= rand.nextInt(6);
		int num2= rand2.nextInt(6);
		String Number1= null;
		String Number2= null;
		
		//number  1 
		if(num1== 0) {
			num1= num1+1;
			Number1="[̲̲̅̅.̲̲̅̅] ";
			//System.out.print(Number1);
			} else if(num1== 6) {
				Number1="[̲̲̅̅:̲̲̅̅:̲̲̅̅:̲̲̅̅] ";
		}else if(num1== 5) {
			Number1="[̲̲̅̅:̲̲̅̅-̲̲̅̅:̲̲̅̅] ";
		}else if(num1== 4) {
			Number1="[̲̲̅̅:̲̲̅̅:̲̲̅̅] ";
		}else if(num1== 3) {
			Number1="[̲̲̅̅.̲̲̅̅*̲̲̅̅.̲̲̅̅] ";
		}else if(num1== 2 ) {
			Number1="[̲̲̅̅.̲̲̅̅.̲̲̅̅] ";
		}else if(num1== 1) {
			Number1="[̲̲̅̅.̲̲̅̅] ";
		}
		
		
		//Number 2
		if(num2== 0) {
			num2= num2+1;
			Number2="[̲̲̅̅.̲̲̅̅]";
			} else if(num2== 6) {
				Number2="[̲̲̅̅:̲̲̅̅:̲̲̅̅:̲̲̅̅]";
		}else if(num2== 5) {
			Number2="[̲̲̅̅:̲̲̅̅-̲̲̅̅:̲̲̅̅]";
		}else if(num2== 4) {
			Number2="[̲̲̅̅:̲̲̅̅:̲̲̅̅]";
		}else if(num2== 3) {
			Number2="[̲̲̅̅.̲̲̅̅*̲̲̅̅.̲̲̅̅]";
		}else if(num2== 2 ) {
			Number2="[̲̲̅̅.̲̲̅̅.̲̲̅̅]";
		}else if(num2== 1) {
			Number2="[̲̲̅̅.̲̲̅̅]";
		}
		total=num1+num2;
		String Answer= num1 + "    "+ num2+"\n"+Number1+"    "+Number2;
		return Answer;
		
		
		
		}
	}
