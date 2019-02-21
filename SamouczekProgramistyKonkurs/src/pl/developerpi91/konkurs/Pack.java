package pl.developerpi91.konkurs;

public class Pack {
    public int length;
    public int width;
    public int high;

    public Pack(int length, int width, int high) {
        this.length = length;
        this.width = width;
        this.high = high;
    }


    public void setHigh(int high) {
        this.high = high;
    }
    public int computeTotalPackArea(){
        return (2 * (this.length * this.width) + 2 * (this.length * this.high) + 2 * (this.width *this.high));
    }

    public int computeTheLowestPackSide(){
        int area;
        if(this.length<=this.high && this.width<=this.high){
            area = this.length * this.width;

        }else if (this.width<=this.length && this.high<=this.length){
                area = this.width * this.high;

            }else{
                area = this.length * this.high;

            }

        return area;
    }

}
