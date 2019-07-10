package guru.springframework.springbeanlifecycle.custominitanddestroy.domain;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BookCustomBean {
    private String bookName;

    public BookCustomBean() {
        System.out.println("Constructor of BookCustomBean bean is called !! ");
    }

    public void customDestroy() throws Exception {

        System.out.println("custom destroy method of BookCustomBean is called !! ");
    }

    public void customInit() throws Exception {
        System.out.println("custom Init  method of BookCustomBean is called !! ");
    }

    public BookCustomBean(String bookName) {
        this.bookName = bookName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                '}';
    }

}
