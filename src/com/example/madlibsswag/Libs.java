package com.example.madlibsswag;

import java.io.Serializable;
import java.util.ArrayList;

import org.apache.http.entity.SerializableEntity;

public class Libs implements Serializable {

	String [][] words;
	String story;
	int [] numbers;

	public Libs(int[] numbers, String story) {

		this.story= story;
		words= new String[2][];
this.numbers= numbers;


	}
	

	public String getStory() {
		return story;
	}


	public void setStory(String story) {
		this.story = story;
	}


	public int getNumbers(int number) {
		return numbers[number];
	}


	public void setNumbers(int number) {
		numbers[number] = 343;
	}


	public void setwords(String[] array, int number){

		words[number] = array;
	
		
	}
	public String [] getwords(int number){
		
		return words[number];
	}

}
