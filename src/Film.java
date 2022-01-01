public class Film  {
    private String filmId="";
    private String filmName="";
    private String filmYear="";
   // Film films[]= null;
    Film(){

    }

    Film(String filmAd , String filmId, String filmYıl){
        this.filmName= filmAd;
        this.filmId = filmId;
        this.filmYear = filmYıl;
    }
    public void setFilmId(String filmId){
        this.filmId = filmId;
    }
    public String getFilmId(){
        return filmId;
    }
    public void setFilmName(String filmName){
        this.filmName = filmName;
    }
    public String getFilmName(){
        return filmName;
    }
    public void setFilmYear(String filmYıl){
        this.filmYear= filmYıl;
    }
    public String getFilmYear(){
        return filmYear;
    }
}