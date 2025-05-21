package construct.ex;

public class Book {
    String title; //제목
    String author; //저자
    int page;

    Book(){
        this.title = "";
        this.author = "";
        this.page = 0;
    }
    Book(String title){
        this.title = title;
    }
    Book(String title, String author){
        this.title = title;
        this.author = author;
    }
    Book(String title, String author, int page){
                this.title = title;
        this.author = author;
        this.page = page;
    }
    void displayinfo(){
        System.out.println("제목: "+this.title+", 저자: "+this.author+", 페이지: "+this.page);
    }
}
