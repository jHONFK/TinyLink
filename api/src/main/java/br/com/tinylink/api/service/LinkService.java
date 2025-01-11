package br.com.tinylink.api.service;

import java.util.List;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.tinylink.api.models.Link;
import br.com.tinylink.api.repository.LinkRepository;

public interface LinkService {
    boolean add(Link link);
    List<Link> list();
    Link findLinkByCode(Integer code);
}
