package za.co.app.autocarservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.co.app.autocarservice.model.SalesInvoice;

import java.util.Optional;
@Repository
public interface SalesInvoiceDao extends JpaRepository<SalesInvoice , Long> {
  //  Optional<SalesInvoice> findByIdAndSalesPersonId(Long invoiceId, Long salesPersonId);
}
