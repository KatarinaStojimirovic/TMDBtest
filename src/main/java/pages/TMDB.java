package pages;

public class TMDB {
    private HomePage homePage;
    private MovieDetailsPage movieDetailsPage;
    private SignInPage signInPage;
    private MyAccountPage myAccountPage;


    public HomePage getHomePage(){
        if (homePage == null){
            homePage = new HomePage();
        }
        return homePage;
    }
    public MovieDetailsPage getMovieDetailsPage(){
        if (movieDetailsPage == null){
            movieDetailsPage = new MovieDetailsPage();
        }
        return movieDetailsPage;
    }
    public SignInPage getSignInPage(){
        if (signInPage == null){
            signInPage = new SignInPage();
        }
        return signInPage;
    }

    public MyAccountPage getMyAccountPage(){
        if (myAccountPage == null){
            myAccountPage = new MyAccountPage();
        }
        return myAccountPage;
    }
}