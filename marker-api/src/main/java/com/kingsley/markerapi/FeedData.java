package com.kingsley.markerapi;

import com.kingsley.markerapi.domain.entity.Marker;
import com.kingsley.markerapi.domain.repository.MarkerRepositoryInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Component
@RequiredArgsConstructor
public class FeedData implements CommandLineRunner {
    private final MarkerRepositoryInterface repository;
    @Override
    public void run(String... args) throws Exception {

        repository.save(new Marker(null, "Kingsley", "https://kingsleyoha.com", Instant.now()));
        repository.save(new Marker(null, "SpringBlog", "https://spring.io/blog", Instant.now()));
        repository.save(new Marker(null, "Quarkus", "https://quarkus.io/", Instant.now()));
        repository.save(new Marker(null, "Micronaut", "https://micronaut.io/", Instant.now()));
        repository.save(new Marker(null, "JOOQ", "https://www.jooq.org/", Instant.now()));
        repository.save(new Marker(null, "VladMihalcea", "https://vladmihalcea.com", Instant.now()));
        repository.save(new Marker(null, "Thoughts On Java", "https://thorben-janssen.com/", Instant.now()));
        repository.save(new Marker(null, "DZone", "https://dzone.com/", Instant.now()));
        repository.save(new Marker(null, "DevOpsBookmarks", "http://www.devopsbookmarks.com/", Instant.now()));
        repository.save(new Marker(null, "Kubernetes docs", "https://kubernetes.io/docs/home/", Instant.now()));
        repository.save(new Marker(null, "Expressjs", "https://expressjs.com/", Instant.now()));
        repository.save(new Marker(null, "Marcobehler", "https://www.marcobehler.com", Instant.now()));
        repository.save(new Marker(null, "baeldung", "https://www.baeldung.com", Instant.now()));
        repository.save(new Marker(null, "devglan", "https://www.devglan.com", Instant.now()));
        repository.save(new Marker(null, "linuxize", "https://linuxize.com", Instant.now()));

    }
}
