package java0507;

import java.util.Objects;
					//先按右鍵做get and set
public class Book { //在按右鍵做hash and equals
	
	//get and set
	private int id;
	private String title;
	private String author;
	/**
	 * @return id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id 要設定的 id
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title 要設定的 title
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return author
	 */
	public String getAuthor() {
		return author;
	}
	/**
	 * @param author 要設定的 author
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public int hashCode() {
		return Objects.hash(author, id, title);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == 
				obj)
			return true;
		if (!(obj instanceof Book))
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && id == other.id && Objects.equals(title, other.title);
	}
	//toString要Override才會印(很重要)
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + "]";
	}
	
}
