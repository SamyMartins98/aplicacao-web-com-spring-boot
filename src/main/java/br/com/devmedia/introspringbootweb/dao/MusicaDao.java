package br.com.devmedia.introspringbootweb.dao;


import br.com.devmedia.introspringbootweb.model.Musica;

import java.util.List;

public interface MusicaDao {

    void salvar(Musica musica);
    List<Musica> recuperarPorPlaylist(Long playlistId);
    Musica recuperarPorPlaylistIdEMusicaId(Long playlistId, Long id);
    void atualizar(Musica musica);
    void excluir(Long musicaId);

}
