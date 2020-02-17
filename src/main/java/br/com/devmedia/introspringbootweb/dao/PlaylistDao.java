package br.com.devmedia.introspringbootweb.dao;

import br.com.devmedia.introspringbootweb.model.Playlist;

import java.util.List;

public interface PlaylistDao {

    void salvar(Playlist playlist);
    List<Playlist> recuperar();
    Playlist recuperarPorId(Long id);
    void atualizar(Playlist playlist);
    void excluir(Long id);
}
