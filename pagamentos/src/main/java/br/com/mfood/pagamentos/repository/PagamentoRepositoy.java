package br.com.mfood.pagamentos.repository;

import br.com.mfood.pagamentos.model.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagamentoRepositoy extends JpaRepository<Pagamento, Long> {
}
