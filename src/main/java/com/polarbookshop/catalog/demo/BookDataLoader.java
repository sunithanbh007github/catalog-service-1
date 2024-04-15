package com.polarbookshop.catalog.demo;

import com.polarbookshop.catalog.domain.Book;
import com.polarbookshop.catalog.domain.BookRepository;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Profile;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;

@Component
@Profile("testdata")
public class BookDataLoader {
    private final BookRepository bookRepository;

    public BookDataLoader(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void loadBookTestData() {
        bookRepository.deleteAll();
        var book1 = Book.of("1234567891", "Northern Lights", "Lyra Silverstar", new BigDecimal(9.90),"vasireddy");
        var book2 = Book.of("1234567892", "Polar Journey", "Iorek Polarson", new BigDecimal(12.90),"vasireddy");
        bookRepository.saveAll(List.of(book1, book2));
        //bookRepository.save(book1);
        //bookRepository.save(book2);
    }
}
