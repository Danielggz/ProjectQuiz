/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package quizproject;

/**
 *
 * @author Daniel García
 * 1 dec 2023
 */
public class Question extends Quiz{
    private int number, section;
    private String text, imgPath;
    private Answer[] answers;

    public Question() {
    }

    public Question(int number, String text, String imgPath, int section) {
        this.number = number;
        this.text = text;
        this.imgPath = imgPath;
        this.section = section;
    }

    public void load(){
        
    }

    public void setAnswers(Answer[] answers) {
        this.answers = answers;
    }
    
    public void setNumber(int number) {
        this.number = number;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public int getNumber() {
        return number;
    }

    public String getText() {
        return text;
    }

    public Answer[] getAnswers() {
        return answers;
    }

    public String getImgPath() {
        return imgPath;
    }
    
}
