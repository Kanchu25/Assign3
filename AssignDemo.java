package assign;
class Book
{
	private int bookNo;
	private String title;
	private String author;
	private float price;

    public Book(int bookNo,String title,String author,float price)
    {   this.bookNo=bookNo;
        this.title=title;
        this.author=author;
        this.price=price; 
        
}
    
public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}

	public String getTitle() {
      return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
}
public class AssignDemo {

	public static void main(String[] args) {
		Book b =new Book(1234,"Harry Potter" , "J.K.Rowling", 240);
		b.getBookNo();
		System.out.println(b.getBookNo());
		b.getAuthor();
		System.out.println(b.getAuthor());
		b.getTitle();
		System.out.println(b.getTitle());
		b.getPrice();
		System.out.println(b.getPrice());

	}

}
