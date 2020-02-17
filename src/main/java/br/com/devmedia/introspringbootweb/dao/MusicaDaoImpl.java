package br.com.devmedia.introspringbootweb.dao;

import br.com.devmedia.introspringbootweb.model.Musica;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class MusicaDaoImpl implements MusicaDao {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void salvar(Musica musica) {
        em.persist(musica);
    }

    @Override
    public List<Musica> recuperarPorPlaylist(Long playlistId) {
        return em.createQuery("select m from Musica m where m.playlist.id = :playlistId", Musica.class)
                .setParameter("playlistId", playlistId).getResultList();
    }

    @Override
    public Musica recuperarPorPlaylistIdEMusicaId(Long playlistId, Long id) {
        return null;
    }

    @Override
    public void atualizar(Musica musica) {

    }

    @Override
    public void excluir(Long musicaId) {

    }
}
