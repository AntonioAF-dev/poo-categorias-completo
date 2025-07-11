package antonioaf.dev.servicio;

import antonioaf.dev.model.Categoria;

import java.util.List;

public interface InterfaceCategoriaServicio {

    public List<Categoria> listarCategorias();
    public Categoria agregarCategoria(Categoria categoria);
    public Categoria editarCategoria(Integer id);
    public Categoria actualizarCategoria(Categoria categoria);
    public void eliminarCategoria(Integer id);
}
