public class Balance {
    int left;
    int right;

    public void addRight(int n){
        this.right += n;
    }
    public void addLeft(int n){
        this.left += n;
    }

    public String getSituation(){
        return left == right ? "=" : left > right ? "L" : "R";
    }
}
