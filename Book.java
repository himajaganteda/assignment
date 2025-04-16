class Book{
    String title;
    String author;
    int year_of_publication;

    public Book(String title, String author, int year_of_publication){
        this.title = title;
        this.author = author;
        this.year_of_publication =  year_of_publication;
    }

    public void BookDetails(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("year_of_publication: " +year_of_publication);
    }
    
        public static void main(String[] args){
        System.out.println("NAME: G.HIMAJA \nROLL.NO: AV.SC.U4CSE2411");

        Book B1 = new Book("Harry Potter","J.K.Rowling",2001);
        Book B2 = new Book("Legend Borb","Tracy Deonn",2020);

        B1.BookDetails();
        B2.BookDetails();
    
    }
}