package dao;
import model.Pessoa;
import util.Conexao;
import Controller.PessoaController;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PessoaDao {
    public void inserir(Pessoa pessoa){
        String sql = "insert into pessoa(nome) values(?)";
        try(
                Connection conn = Conexao.getConnection();
                PreparedStatement statement = conn.prepareStatement(sql);
        ){
            statement.setString(1, pessoa.getNome());
            statement.executeUpdate();
            System.out.println("Pessoa cadastrada com sucesso!");
        }catch (SQLException e) {
            System.out.println("Erro: "+ e.getMessage());
        }
    }
    public Pessoa buscarPorNome(String nome){
        String sql = "Select * from pessoa where nome = ?";
        try(
                Connection conn = Conexao.getConnection();
                PreparedStatement statement = conn.prepareStatement(sql);
        ){
            statement.setString(1, nome);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                Pessoa pessoa = new Pessoa();
                pessoa.setId(resultSet.getInt("id"));
                pessoa.setNome(resultSet.getString("nome"));
                return pessoa;
            }
        }catch (SQLException e) {
            System.out.println("Erro: "+ e.getMessage());
        }
        return null;
    }
    public void atualizar(Pessoa pessoa) {
        String sql = "UPDATE pessoa SET nome = ? WHERE id = ?";
        try (
                Connection conn = Conexao.getConnection();
                PreparedStatement statement = conn.prepareStatement(sql);
        ) {
            statement.setString(1, pessoa.getNome());
            statement.setInt(2, pessoa.getId());
            statement.executeUpdate();
            System.out.println("Pessoa atualizada com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
    public void excluir(int id) {
        String sql = "DELETE FROM pessoa WHERE id = ?";
        try (
                Connection conn = Conexao.getConnection();
                PreparedStatement statement = conn.prepareStatement(sql);
        ) {
            statement.setInt(1, id);
            statement.executeUpdate();
            System.out.println("Pessoa removida com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
