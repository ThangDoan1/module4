package thang.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import thang.model.Blogged;

import java.util.List;

public interface BloggedRepository extends Repository<Blogged> {

}
