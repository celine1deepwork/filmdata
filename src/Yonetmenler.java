class Yonetmenler {
    private String yonetmenId;
    private String yonetmenName;
    //Yonetmenler directors[] = null;

    Yonetmenler(){

    }
    Yonetmenler(String yonetmenName ,String yonetmenId){
        this.yonetmenName = yonetmenName;
        this.yonetmenId = yonetmenId;

    }
    public void setYonetmenId(String yonetmenId){
        this.yonetmenId = yonetmenId;
    }
    public String getYonetmenId(){
        return yonetmenId;
    }
    public void setYonetmenName(String yonetmenAd){
        this.yonetmenName= yonetmenName;
    }
    public String getYonetmenName(){
        return yonetmenName;
    }
}
