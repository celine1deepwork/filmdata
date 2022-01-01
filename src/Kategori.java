class Kategori  {

        private String kategoriId;
        private String kategoriName;
    //Kategori category []  ;
    Kategori(){
    }

    Kategori(String kategoriId , String kategoriName){
        this.kategoriName = kategoriName;
        this.kategoriId = kategoriId;

    }
    public void setKategoriId(String kategoriId){
        this.kategoriId = kategoriId;
    }
    public String getKategoriId(){
        return kategoriId;
    }
    public void setKategoriAd(String kategoriName){
        this.kategoriName= kategoriName;
    }
    public String getKategoriName(){
        return kategoriName;
    }
}
