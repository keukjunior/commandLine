package sn.maps.commandeline.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import sn.maps.commandeline.entity.Product;

import java.util.List;

public interface ProductRepository  extends JpaRepository<Product, Long> {
    Page<Product> findByActiveTrue(Pageable pageable);
    Page<Product> findByCategoryAndActiveTrue(String category, Pageable pageable);
    List<Product> findByStockLessThan(int threshold); // Alertes stock
}
