package test;

import main.FrequencyTest;

public class FrequencyTestTest {

	public static void main(String[] args) {

		// Test 1 :
		String str1 = "Hello you ! How are you today ?";
		String word1 = "you";
		int count1 = FrequencyTest.frequency(str1, word1);
		System.out.println("The string [" + str1 + "] contains the word [" + word1 + "] " + count1 + " times");

		// Test 1 :
		String str2 = "My name is Bond. James Bond.";
		String word2 = "Bond";
		int count2 = FrequencyTest.frequency(str2, word2);
		System.out.println("The string [" + str2 + "] contains the word [" + word2 + "] " + count2 + " times");

	}

}
