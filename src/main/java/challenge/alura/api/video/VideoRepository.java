package challenge.alura.api.video;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video, Long> {
    Page<Video> findAllByCategoriaId(Long id, Pageable pageable);
}
