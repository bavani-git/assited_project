package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="question")
public class Question  {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int quesid;
	private String question;
	private String opt1; 
	private String opt2;
	private String opt3;
	private String opt4;
	private int answer;
	public int getQuesid() {
		return quesid;
	}
	public void setQuesid(int quesid) {
		this.quesid = quesid;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getOpt1() {
		return opt1;
	}
	public void setOpt1(String opt1) {
		this.opt1 = opt1;
	}
	public String getOpt2() {
		return opt2;
	}
	public void setOpt2(String opt2) {
		this.opt2 = opt2;
	}
	public String getOpt3() {
		return opt3;
	}
	public void setOpt3(String opt3) {
		this.opt3 = opt3;
	}
	public String getOpt4() {
		return opt4;
	}
	public void setOpt4(String opt4) {
		this.opt4 = opt4;
	}
	public int getAnswer() {
		return answer;
	}
	public void setAnswer(int answer) {
		this.answer = answer;
	}
	@Override
	public String toString() {
		return "Question [quesid=" + quesid + ", question=" + question + ", opt1=" + opt1 + ", opt2=" + opt2 + ", opt3="
				+ opt3 + ", opt4=" + opt4 + ", answer=" + answer + "]";
	}
	
	
}
