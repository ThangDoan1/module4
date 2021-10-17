package thang.demo.service;



import thang.demo.entity.Book;
import thang.demo.entity.Code;
import thang.demo.exception.NotAvailableException;
import thang.demo.exception.WrongCodeException;

import java.util.List;

public interface ICodeService {
    List<Code> findAll();
    Code findById(Integer id);

    void save(Code code);

    List<Code> findAllCodeByBookId(Integer id);

    List<Code> findAvailableCodeByBookId(Integer id);

    List<Code> findUsedCodeByBookId(Integer id);

    void returnBookByCode(Book book, Integer returnCode);




}
