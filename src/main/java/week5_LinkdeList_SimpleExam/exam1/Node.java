package week5_LinkdeList_SimpleExam.exam1;


import lombok.Data;

@Data
class Node {
    private float coef;
    private int expo;
    Node link;

    public Node() {
        this.link = null;
    }

    public Node(float coef, int expo) {
        this.coef = coef;
        this.expo = expo;
    }

    public Node(float coef, int expo, Node link) {
        this.coef = coef;
        this.expo = expo;
        this.link = link;
    }
    public float getCoef(){
        return this.coef;
    }
    public void setCoef(float coef1){
        this.coef = coef1;
    }
    public int getExpo(){
        return this.expo;
    }
    public void setExpo(int expo){
        this.expo = expo;
    }
    public Node getLink(){
        return this.link;
    }
    public void setLink(Node link){
        this.link = link;
    }
}
