import java.util.Scanner;
import  java.util.ArrayList;
public class TestMain {
    public static void main(String[] args) {
        ArrayList<Kategori> kategoriler = new ArrayList<>(); // :(
        ArrayList<Film>filmler = new ArrayList<>();
        ArrayList<Yonetmenler> yonetmenler = new ArrayList<>();//
        CreateFilm(kategoriler,filmler,yonetmenler);

    }

    public static void  CreateFilm(ArrayList<Kategori>kat ,ArrayList<Film>film ,ArrayList<Yonetmenler>yonet) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of film in list: " );// napıyorsun hatayı yaptım zaten nasıl ?? check whatsapp
        int numFilm = scn.nextInt();
        for(int i= 0;i<numFilm;i++){
            film.add(new Film());
            kat.add(new Kategori());
            yonet.add(new Yonetmenler());
        }

        for(int i = 0 ; i < numFilm; i++){
            // FILM
            System.out.println(i +") Enter film name  : ");
            film.get(i).setFilmName(scn.next()); // film[i].setFilmName aynı olayı
            System.out.println(i +") Enter film Id : ");
            film.get(i).setFilmId(scn.next());
            System.out.println(i+") Enter Produced year : ");
            film.get(i).setFilmYear(scn.next()); //
            // DIRECTOR
            System.out.println(i+ "= Enter director name : ");
            yonet.get(i).setYonetmenName(scn.next());
            System.out.println(i +"= Enter director Id : ");
            yonet.get(i).setYonetmenId(scn.next()); //
            //CATEGORY


        }
    for(int i = 0;i<numFilm;i++){

        System.out.println();
        System.out.println("________________________________________________________________________________");
        System.out.println(i + " Film Name : " +film.get(i).getFilmName() + "\n " + i + "| Film Id : " +film.get(i).getFilmId() + "\n "+ i +"| Film produced Year : " +film.get(i).getFilmYear() + "\n Director Name" + yonet.get(i).getYonetmenName() + " \n Director Id : " + yonet.get(i).getYonetmenId());
        System.out.println("________________________________________________________________________________");
    }
    }
}
