package br.com.foursys.locadora.backingbean;

import java.util.ArrayList;

import br.com.foursys.locadora.bean.Cidade;
import br.com.foursys.locadora.bean.Contato;
import br.com.foursys.locadora.bean.Endereco;
import br.com.foursys.locadora.bean.Estado;
import br.com.foursys.locadora.bean.Funcionario;
import br.com.foursys.locadora.controller.CidadeController;
import br.com.foursys.locadora.controller.EstadoController;
import br.com.foursys.locadora.controller.FuncionarioController;
import br.com.foursys.locadora.dao.CidadeDAO;
import br.com.foursys.locadora.util.JSFUtil;
import br.com.foursys.locadora.util.Valida;

/**
 * Classe responsável por controlar os componentes do front-end Funcionario
 * @author vicbaptista
 * @since 27/04/2021
 * @version 1.0
 */
public class FuncionarioBacking {

	// Atributos da tela de cadastro
	private String nome;
	private String cpf;
	private String rg;
	private String dataNascimento;
	private String idade;
	private String sexo;
	private String login;
	private String senha;
	private String perfilAcesso;
	private String telefone;
	private String celular;
	private String email;
	private String tipoLogradouro;
	private String enderec;
	private String numero;
	private String complemento;
	private String bairro;
	private String cep;
	private String cidade;
	private String estado;
	
	private Contato contato;
	private Endereco endereco;
	
	// Atributos da tela de Consulta
	private String nomePesquisar;
	private Funcionario funcionarioSelecionado;
	
	// Atributos auxiliares
	private Funcionario funcionario;
	private ArrayList<Funcionario> listaFuncionarios;
	private ArrayList<Estado> listaEstados;
    private ArrayList<Cidade> listaCidades;
    private ArrayList<String> listaE = carregarComboEstados();
    private ArrayList<String> listaC = carregarComboCidade();
    
	/*
	 * Métodos Getters e Setters
	 */
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getIdade() {
		return idade;
	}
	public void setIdade(String idade) {
		this.idade = idade;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getPerfilAcesso() {
		return perfilAcesso;
	}
	public void setPerfilAcesso(String perfilAcesso) {
		this.perfilAcesso = perfilAcesso;
	}
	public ArrayList<Funcionario> getListaFuncionarios() {
		return listaFuncionarios;
	}
	public void setListaFuncionarios(ArrayList<Funcionario> listaFuncionarios) {
		this.listaFuncionarios = listaFuncionarios;
	}
	public String getNomePesquisar() {
		return nomePesquisar;
	}
	public void setNomePesquisar(String nomePesquisar) {
		this.nomePesquisar = nomePesquisar;
	}
	public Funcionario getFuncionarioSelecionado() {
		return funcionarioSelecionado;
	}
	public void setFuncionarioSelecionado(Funcionario funcionarioSelecionado) {
		this.funcionarioSelecionado = funcionarioSelecionado;
	}
	public ArrayList<Estado> getListaEstados() {
		return listaEstados;
	}
	public void setListaEstados(ArrayList<Estado> listaEstados) {
		this.listaEstados = listaEstados;
	}
	public ArrayList<Cidade> getListaCidades() {
		return listaCidades;
	}
	public void setListaCidades(ArrayList<Cidade> listaCidades) {
		this.listaCidades = listaCidades;
	}
	public ArrayList<String> getListaE() {
		return listaE;
	}
	public void setListaE(ArrayList<String> listaE) {
		this.listaE = listaE;
	}
	public ArrayList<String> getListaC() {
		return listaC;
	}
	public void setListaC(ArrayList<String> listaC) {
		this.listaC = listaC;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTipoLogradouro() {
		return tipoLogradouro;
	}
	public void setTipoLogradouro(String tipoLogradouro) {
		this.tipoLogradouro = tipoLogradouro;
	}
	public String getEnderec() {
		return enderec;
	}
	public void setEnderec(String enderec) {
		this.enderec = enderec;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	/*
	 * Método responsável por capturar a ação do botão cadastrar na tela CAD-FILME.JSP
	 */
	public void cadastrar() {
		if (validar()) {
			try {
				funcionario = new Funcionario();
				contato = new Contato();
				endereco = new Endereco();
				getFuncionario();
				new FuncionarioController().salvar(funcionario);
				limparCampos();
				JSFUtil.addInfoMessage("Funcionario cadastrado com Sucesso!");
			} catch (Exception e) {
				JSFUtil.addErrorMessage("Erro ao cadastrar o funcionario!");
			}
		}
	}
	
	/*
	 * Método responsável por capturar a ação do botão alterar na tela ALT-FILME.JSP
	 */
	public void alterarFuncionario() {
		if (validar()) {
			try {
				funcionario = funcionarioSelecionado;
				contato = funcionarioSelecionado.getContatoIdContato();
				endereco = funcionarioSelecionado.getEnderecoIdEndereco();
				getFuncionarioAlterar();
				new FuncionarioController().salvar(funcionario);
				limparCampos();
				JSFUtil.addInfoMessage("Funcionario alterado com Sucesso!");
			} catch (Exception e) {
				JSFUtil.addErrorMessage("Erro ao alterar o funcionario!");
			}
		}
	}
	
	private boolean validar() {
		
		if (Valida.isEmptyOrNull(nome)) {
			JSFUtil.addErrorMessage("Informe o nome, campo obrigatório!");
			return false;
		}
		
		return true;
	}
	
	/*
	 * Método responsável por capturar a ação do botão cancelar na tela CAD-FILME.JSP
	 */
	public void cancelar() {
		limparCampos();
	}
	
	/*
	 * Método responsável por capturar a ação do botão sair na tela CAD-FILME.JSP
	 */
	public String sair() {
		return "sair";
	}
	
	/*
	 * Método para abrir a tela de cadastro
	 */
	public String cadastroFuncionario() {
		limparCampos();
		return "";
	}
	
	/*
	 * Método para abrir a tela de consulta
	 */
	public String consultarFuncionario() {
		nomePesquisar = null;
		listaFuncionarios = null;
		return "";
	}
	
	/*
	 * Método para retornar objeto Funcionario
	 */
	private void getFuncionario() {
		
		funcionario.setNome(nome);
		funcionario.setCpf(cpf);
		funcionario.setRg(rg);
		funcionario.setDataNascimento(dataNascimento);
		funcionario.setIdade(Integer.parseInt(idade));
		funcionario.setSexo(sexo);
		funcionario.setLogin(login);
		funcionario.setSenha(senha);
		funcionario.setContatoIdContato(getContato());
		funcionario.setEnderecoIdEndereco(getEndereco());
	}
	
	/*
	 * Método para retornar objeto Contato
	 */
	private Contato getContato() {
		
		contato.setTelefone(telefone);
		contato.setCelular(celular);
		contato.setEmail(email);
		return contato;
	}
	
	/*
	 * Método para retornar objeto Endereco
	 */
	private Endereco getEndereco() {
		
		endereco.setTipoLogradouro(tipoLogradouro);
		endereco.setEndereco(enderec);
		endereco.setNumero(Integer.parseInt(numero));
		endereco.setBairro(bairro);
		endereco.setComplemento(complemento);
		endereco.setCep(cep);
		endereco.setCidadeIdCidade(listaCidades.get(listaC.indexOf(cidade)));
		return endereco;
	}
	/*
	 * Método para retornar objeto Funcionario
	 */
	private void getFuncionarioAlterar() {
		
		funcionario.setNome(nome);
		funcionario.setNome(nome);
		funcionario.setCpf(cpf);
		funcionario.setRg(rg);
		funcionario.setDataNascimento(dataNascimento);
		funcionario.setIdade(Integer.parseInt(idade));
		funcionario.setSexo(sexo);
		funcionario.setLogin(login);
		funcionario.setSenha(senha);
		funcionario.setContatoIdContato(getContato());
		funcionario.setEnderecoIdEndereco(getEndereco());
	}
	
	private void limparCampos() {
		setNome(null);
		
	}
	
	/*
	 * Método responsável por pesquisar funcionarios
	 */
	public String pesquisar() {
		try {
			listaFuncionarios = new FuncionarioController().buscarPorNome(nomePesquisar);
		} catch (Exception e) {
			JSFUtil.addErrorMessage("Erro ao pesquisar funcionarios!");
		}
		
		return "";
	}
	
	/*
	 * Método responsável por
	 */
	public String alterar() {
		nome = funcionarioSelecionado.getNome();
		
		return "";
	}
	
	public String excluir() {
		try {
			new FuncionarioController().excluir(funcionarioSelecionado);
			pesquisar();
			JSFUtil.addInfoMessage("Funcionario excluído com sucesso!");
		} catch (Exception e) {
			JSFUtil.addErrorMessage("Falha ao excluir o Funcionario");
		}
		return "";
	}
	
	/*
     * Método para carregar a combo de estados
     */
    public ArrayList<String> carregarComboEstados() {
    	ArrayList<String> list = new ArrayList<String>();
    	listaEstados = new EstadoController().buscarTodos();
    	for (Estado estado : listaEstados) {
			list.add(estado.getNome());
		}
    	return list;
    }
    
    /*
     * Método para carregar a combo de cidades
     */
    public ArrayList<String> carregarComboCidade() {
    	
    	System.out.println(estado);
    	int indice = listaE.indexOf(estado);
    	ArrayList<String> list = new ArrayList<String>();
    	if (indice >= 0) {
        	listaCidades = new CidadeController().buscarPorEstado(listaEstados.get(indice));	
        	for (Cidade cidade : listaCidades) {
    			list.add(cidade.getNome());
    		}
    	}
    	return list;
    }
}
