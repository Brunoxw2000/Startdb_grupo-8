
package conectageracao.conectageracao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Pessoasrepositorio extends JpaRepository<Pessoa,Integer> {

    boolean findByEmail(String email);


    
   
    


}