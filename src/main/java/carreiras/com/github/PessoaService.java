package carreiras.com.github;

public class PessoaService {

    public PessoaDTO list() {
        Pessoa pessoa = new PessoaRepository().list();
        PessoaDTO pessoaDTO = new PessoaDTO(pessoa.getNome(), pessoa.getCpf());
        return pessoaDTO;
    }
}
