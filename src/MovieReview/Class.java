package MovieReview;
public class Class {
    public static void main(String[] args) {
        MovieReview[] movieReviews = new MovieReview[2];
        movieReviews[0] = new MovieReview();
        movieReviews[1] = new MovieReview();
        movieReviews[0].title = "인셉션";
        movieReviews[0].review = "인생은 무한 루프";
        movieReviews[1].title = "어바웃 타임";
        movieReviews[1].review = "인생 시간 영화!";
        System.out.println("영화 제목: "+movieReviews[0].title+", 리뷰: "+movieReviews[0].review);
        System.out.println("영화 제목: "+movieReviews[1].title+", 리뷰: "+movieReviews[1].review);
    }
}

